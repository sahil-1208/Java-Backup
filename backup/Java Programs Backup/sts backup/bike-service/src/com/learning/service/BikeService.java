package com.learning.service;

import com.learning.enums.Washtype;
import com.learning.model.Bike;
import com.learning.model.Fault;
import com.learning.model.ServiceCost;

public abstract class BikeService {
	public abstract void bikeWash(Bike bike, Washtype washtype);
	public abstract ServiceCost repair(Bike bike, Fault fault);

}
