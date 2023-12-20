package com.learning.service;

import com.learning.enums.PaaniTypes;
import com.learning.model.Golgappa;
import com.learning.model.ServingCost;

public abstract class GolgappaService {
	
	public abstract void order(Golgappa golgappa);
	public abstract ServingCost serve(Golgappa golgappa, ServingCost service);
	public abstract boolean availability(Golgappa golgappa,PaaniTypes paanitype);

}
