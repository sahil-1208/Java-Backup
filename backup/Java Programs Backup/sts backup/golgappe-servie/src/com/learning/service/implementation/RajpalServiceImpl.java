package com.learning.service.implementation;

import com.learning.enums.GolgappaType;
import com.learning.enums.PaaniTypes;
import com.learning.model.Golgappa;
import com.learning.model.ServingCost;
import com.learning.service.GolgappaService;

public  class RajpalServiceImpl extends GolgappaService {
	
	public void order(Golgappa golgappa) {
		System.out.println(golgappa.getGolgappaType()+" "+ golgappa.getQuantity()+" "+ golgappa.getPaaniTypes()+" "+golgappa.getChutneytypes());
			
		}
		public ServingCost serve(Golgappa golgappa, ServingCost service) {
			int number = golgappa.getQuantity();
			int totalCost = number *5 ;
			System.out.println(totalCost);
			return null;
		}

		public boolean availability(Golgappa golgappa, PaaniTypes paanitype) {
			 System.out.println(golgappa.getGolgappaType());
			 GolgappaType golgappaType=golgappa.getGolgappaType();
			if(null !=golgappaType.AATA && null !=golgappaType.SUJI)
			{
				System.out.println("Sir please select your type of Golgappa");
			}
			else if (null !=golgappaType.AATA) {
				System.out.println("Sorry sir we have only aata golgappa");
			}
			else {
				System.out.println("Sir Sorry we have only Suji");
			}
			 
			return false;
		}
}
