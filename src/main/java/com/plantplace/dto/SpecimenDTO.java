package com.plantplace.dto;

public class SpecimenDTO {
	private int specimenId;
	private String latitude;
	private String longitude;
	private String description;
	
	public int getSpecimentId() {
		return specimenId;
	}
	public void setSpecimentId(int specimentId) {
		this.specimenId = specimentId;
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
	
	@Override
	public String toString() {
		return specimenId + " " + latitude + " " + longitude + " " + description;
	}

}
