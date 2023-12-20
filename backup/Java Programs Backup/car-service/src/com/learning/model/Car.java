package com.learning.model;

import com.learning.enums.CarType;

public class Car {

	private long id;
	private String registration, modelName, brand;
	private boolean isPetrolEngine;
	private CarType carType;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getRegistration() {
		return registration;
	}

	public void setRegistration(String registration) {
		this.registration = registration;
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

	public boolean isPetrolEngine() {
		return isPetrolEngine;
	}

	public void setPetrolEngine(boolean isPetrolEngine) {
		this.isPetrolEngine = isPetrolEngine;
	}

	public CarType getCarType() {
		return carType;
	}

	public void setCarType(CarType carType) {
		this.carType = carType;
	}

}
