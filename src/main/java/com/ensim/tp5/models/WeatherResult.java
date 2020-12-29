package com.ensim.tp5.models;


import java.util.HashMap;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class WeatherResult {
	public Weather[] weather;
	public String base;
	public Main main;
	public int dt;
	public int timezone;

}
