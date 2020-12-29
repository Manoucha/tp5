package com.ensim.tp5.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Meteo {
	
	private Currently currently;

	public Currently getCurrently() {
		return currently;
	}

	public void setCurrently(Currently currently) {
		this.currently = currently;
	}

	@Override
	public String toString() {
		return "Meteo [currently=" + currently + "]";
	}
	
	
}
