package com.plantplace.dto;

public class SpecimenDTO {
	private int specimentId;
	private String latitude;
	private String longitude;
	private String description;
	
	public int getSpecimentId() {
		return specimentId;
	}
	public void setSpecimentId(int specimentId) {
		this.specimentId = specimentId;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

}
