package com.learning.service;

import com.learning.enums.WashType;
import com.learning.model.Car;
import com.learning.model.Fault;
import com.learning.model.ServiceCost;

public abstract class CarService {
	
	public abstract void carWash(Car car, WashType washType);
	public abstract ServiceCost repair(Car car, Fault fault);

}
