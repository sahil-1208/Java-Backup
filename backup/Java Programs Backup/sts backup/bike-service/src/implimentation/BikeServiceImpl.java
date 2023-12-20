package implimentation;

import com.learning.enums.Washtype;
import com.learning.model.Bike;
import com.learning.model.Engine;
import com.learning.model.Fault;
import com.learning.model.ServiceCost;
import com.learning.service.BikeService;

public class BikeServiceImpl extends BikeService{

	@Override
	public void bikeWash(Bike bike, Washtype washtype) {
		System.out.println("Bike Wash");
		
		System.out.println(bike.getModelName() +" " + bike.getRc() );
		System.out.println("Washing" +washtype);
		
	}

	@Override
	public ServiceCost repair(Bike bike, Fault fault) {
		 System.out.println("Bike Service");
		 System.out.println(bike.getModelName() +" " + bike.getRc() );
		if( null != fault ) {
			 String wiring=fault.getWiringIssue();
			 Engine engine = fault.getEngine();
			 if(null != wiring && null !=engine )
			 {
				 System.out.println("Repair engine and wiring");
			 }
			 else if (null !=engine)
			 {
				 System.out.println("Repair Engine");
			 }
			 else
			 {
				 System.out.println("Repair wiring");
			 }
		}
		else {
			System.out.println("Repairing not needed");
		}
		
		return null;
	}

}
