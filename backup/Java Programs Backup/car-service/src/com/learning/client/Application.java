package com.learning.client;

import com.learning.enums.CarType;
import com.learning.enums.ImplementationType;
import com.learning.enums.WashType;
import com.learning.model.AutomaticEngine;
import com.learning.model.Car;
import com.learning.model.Engine;
import com.learning.model.Fault;
import com.learning.model.ManualEngine;
import com.learning.service.CarService;
import com.learning.service.implementation.CarServiceImplementation;
import com.learning.service.implementation.SharmaCarService;
import com.learning.service.implementation.VermaCarService;

public class Application {

	public static void main(String[] args) {
		
		//Car object created and data set in car object
		Car car = new Car();
		car.setId(101L);
		car.setRegistration("HR51CE4729");
		car.setBrand("Nissan");
		car.setModelName("Kicks");
		car.setCarType(CarType.SUV);
		car.setPetrolEngine(true);
		
		/*Engine object created using parent reference and child object 
		and data set*/ 
		Engine engine = new ManualEngine();
		engine.setName("CRDe");
		engine.setHorsePower("2499cc");
		
		Fault fault = new Fault();
		fault.setEngine(engine);
		
		CarService carService = getInstance(ImplementationType.DEFAULT);
		carService.repair(car, fault);
		carService.carWash(car, WashType.FOAM);
	}
	public static CarService getInstance(ImplementationType implType) {
		CarService carService = null;
		switch(implType) {
		case SHARMA : {
			carService = new SharmaCarService();
			break;
		}
		case VERMA : {
			carService = new VermaCarService();
			break;
		}
		case DEFAULT : {
			carService = new CarServiceImplementation();
		}
		}
		
		return carService;
	}
	
	public static void nonPremitiveTypeCast(){
		Engine engine = null;
		engine = new Engine();
		engine = new ManualEngine();
		engine = new AutomaticEngine();
		System.out.println("working");
	}
		
}
