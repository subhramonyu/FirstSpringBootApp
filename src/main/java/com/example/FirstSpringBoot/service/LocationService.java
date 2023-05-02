package com.example.FirstSpringBoot.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.FirstSpringBoot.model.Location;

@Service
public class LocationService {

	Location location1 = new Location("l1", "Lagos");
	Location location2 = new Location("l2", "Asaba");
	Location location3 = new Location("l3", "Budapest");

	List<Location> locations = new ArrayList<>( Arrays.asList(location1, location2, location3));

	public List<Location> getAllLocations() {

		return locations;
	}
	
	public Location getLocation(String id) {
		return locations.stream().filter(l -> id.equals(l.getId()))
				.findFirst().orElse(null);
	}
	
	public void addLocation(Location location) {
		locations.add(location);
	}
	
	public void updateLocation(String id,Location location) {
		/*
		 * int loc = locations.stream().filter(l -> id.equals(l.getId()));
		 * locations.set(id, loc);
		 */
	}

}
