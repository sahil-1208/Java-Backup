package com.learning.model;

import com.learning.enums.BikeType;

public class Bike {

	private long id;
	private String rc;
	private String modelName;
	private String brand;
	private boolean isPetrol;
	private BikeType bikeTypes;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getRc() {
		return rc;
	}

	public void setRc(String rc) {
		this.rc = rc;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public boolean isPetrol() {
		return isPetrol;
	}

	public void setPetrol(boolean isPetrol) {
		this.isPetrol = isPetrol;
	}

	public BikeType getBikeTypes() {
		return bikeTypes;
	}

	public void setBikeTypes(BikeType bikeTypes) {
		this.bikeTypes = bikeTypes;
	}

}
