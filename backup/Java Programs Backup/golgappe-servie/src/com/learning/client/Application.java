package com.learning.client;

import com.learning.enums.ChutneyTypes;
import com.learning.enums.GolgappaType;
import com.learning.enums.PaaniTypes;
import com.learning.model.Golgappa;
import com.learning.service.implementation.GuptaServiceImpl;

public class Application {
	public static void main(String[] args) {
		Golgappa golgappa= new Golgappa();
		golgappa.setChutneytypes(ChutneyTypes.RED);
		golgappa.setGolgappaType(GolgappaType.SUJI);
		golgappa.setMixture("Aalu  with Chole");
		golgappa.setPaaniTypes(PaaniTypes.TIKHA);
		golgappa.setQuantity(6);
		System.out.println(golgappa.getMixture());
		System.out.println(golgappa.getGolgappaType());
		System.out.println(golgappa.getQuantity());
		
		
		GuptaServiceImpl gsImpl	= new GuptaServiceImpl();
	 boolean available = gsImpl.availability(GolgappaType.AATA,PaaniTypes.TIKHA);
	 
	  System.out.println(available);
	
		
		
		
		
		
	}

}
