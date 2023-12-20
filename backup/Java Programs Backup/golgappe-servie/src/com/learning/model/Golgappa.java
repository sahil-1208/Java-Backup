package com.learning.model;

import com.learning.enums.ChutneyTypes;
import com.learning.enums.GolgappaType;
import com.learning.enums.ImplementationType;
import com.learning.enums.PaaniTypes;


public class Golgappa {
		
		  private long tokenNumber;
		  private int quantity;
		   private String mixture ;
		   private ChutneyTypes chutneytypes;
		   private PaaniTypes paaniTypes;
		   private GolgappaType golgappaType;
		   
		   
		public long getTokenNumber() {
			return tokenNumber;
		}
		public void setTokenNumber(long tokenNumber) {
			this.tokenNumber = tokenNumber;
		}
		public int getQuantity() {
			return quantity;
		}
		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}
		public String getMixture() {
			return mixture;
		}
		public void setMixture(String mixture) {
			this.mixture = mixture;
		}
		public ChutneyTypes getChutneytypes() {
			return chutneytypes;
		}
		public void setChutneytypes(ChutneyTypes chutneytypes) {
			this.chutneytypes = chutneytypes;
		}
		public PaaniTypes getPaaniTypes() {
			return paaniTypes;
		}
		public void setPaaniTypes(PaaniTypes paaniTypes) {
			this.paaniTypes = paaniTypes;
		}
		public GolgappaType getGolgappaType() {
			return golgappaType;
		}
		public void setGolgappaType(GolgappaType golgappaType) {
			this.golgappaType = golgappaType;
		}
		  
							
	 }


