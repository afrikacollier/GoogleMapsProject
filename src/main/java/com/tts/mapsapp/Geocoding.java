package com.tts.mapsapp;

import java.util.List;

import lombok.Data;

@Data
public class Geocoding {
	private String formatted_address;
	private Geometry geometry;
	private String place_id;
	List<String> types;
}
