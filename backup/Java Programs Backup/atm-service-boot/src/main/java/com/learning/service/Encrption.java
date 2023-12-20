package com.learning.service;

public class Encrption {
	
	int key = 5;
	
	public String getEncryption(String password) {
		String encrypt =" ";
		for(int i=0 ; i<password.length();i++) {
			char ch = password.charAt(i);
			ch =(char)(ch+key);
			
			encrypt = encrypt + ch ;
		}
		
		return encrypt;
	}
	
 public String getDecryption(String encrypt) {
	 String decrypt ="";
	 for (int i =0;i<encrypt.length();i++)
	 {
		 char ch = encrypt.charAt(i);
		 ch = (char)(ch -key);
		 
		 decrypt = decrypt + ch; 
	 }
	 
	return decrypt;
	 
 }
 
}
