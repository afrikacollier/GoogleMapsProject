package com.tts.mapsapp;

import lombok.Data;

@Data
public class Location {
	//These two fields are not found in the JSON and will not get
	//unpacked from JSON but are our private fields to store
	//city and state, because the Location class does double duty
	//as both a class used for JSON deserialization (unpacking) and 
	//as a utility class for us to store locations in.
	private String city;
	private String state;
	
	private String lat;
	private String lng;
}
