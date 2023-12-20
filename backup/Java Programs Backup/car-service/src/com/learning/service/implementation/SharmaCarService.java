package com.learning.service.implementation;

import com.learning.enums.WashType;
import com.learning.model.Car;
import com.learning.model.Engine;
import com.learning.model.Fault;
import com.learning.model.ServiceCost;
import com.learning.service.CarService;

public class SharmaCarService extends CarService{

	
	public void carWash(Car car, WashType washType) {
		System.out.println("Sharma Car Services");
		System.out.println(car.getModelName() + " " + car.getRegistration());
		System.out.println("Washing " + washType);
		
	}

	
	public ServiceCost repair(Car car, Fault fault) {
		System.out.println("Sharma Car Services");
		System.out.println(car.getModelName() + " " + car.getRegistration());
		
		if(null != fault) {	
			
			Engine engine = fault.getEngine();
			String wiringIssue = fault.getWiringIssue();
			
			if(null != wiringIssue && null != engine) {
				System.out.println("Repair Wiring and Engine");
			} else if(null != engine) {
				System.out.println("Repair Engine");			
			} else {
				System.out.println("Repair Wiring Issue");			
			}		
			
		} else {
			System.out.println("Repair Not required");
		}
		
		
		
		
		return null;
	}

}
