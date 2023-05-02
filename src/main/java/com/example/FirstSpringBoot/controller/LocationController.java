package com.example.FirstSpringBoot.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.FirstSpringBoot.model.Location;
import com.example.FirstSpringBoot.service.LocationService;

@RestController
public class LocationController {

	@Autowired
	LocationService locationservice;

	@RequestMapping(value = "/locations")
	public List<Location> getAllLocations() {
		return locationservice.getAllLocations();
	}
	
	@RequestMapping(value ="/locations/{id}")
	public Location getLocation(@PathVariable String id) {
		return locationservice.getLocation(id);
	}
	
	@RequestMapping(method = RequestMethod.POST ,value = "/locations")
	public void addLocation(@RequestBody Location location ) {
		locationservice.addLocation(location);
	}

}
