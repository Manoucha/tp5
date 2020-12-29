package com.ensim.tp5.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Geometry {
	private List<Float> coordinates;

	
	public List<Float> getCoordinates() {
		return coordinates;
	}

	public void setCoordinates(List<Float> coordinates) {
		this.coordinates = coordinates;
	}

	@Override
	public String toString() {
		return "Geometry [coordinates=" + coordinates.toString() + "]\n";
	}
	
}