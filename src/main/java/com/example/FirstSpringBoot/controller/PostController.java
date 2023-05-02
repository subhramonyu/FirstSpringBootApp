package com.example.FirstSpringBoot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.FirstSpringBoot.model.Post;
import com.example.FirstSpringBoot.service.PostService;

@RestController
public class PostController {

	@Autowired
	PostService postservice;

	@RequestMapping(value = "/posts")
	public List<Post> getAllPosts() {
		return postservice.getAllPosts();
	}

	@RequestMapping(value="/posts/{id}")
	public Post getPost(@PathVariable String id) {
		return postservice.getPost(id);
	}
	
	@RequestMapping(method = RequestMethod.POST,value = "/posts")
	public void addPost(@RequestBody Post post) {
		postservice.addPost(post);
	}
	
}
