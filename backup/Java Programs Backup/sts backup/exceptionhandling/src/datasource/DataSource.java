package datasource;

import entity.User;

public class DataSource {
	
	public  User[] userArray() {
		User sahil = new User(1,"sahil",22);
		User akhil = new User(2,"akhil",26);
		User sakshi = new User(3,"sakshi",22);
		User zora = new User(4,"zorawar",21);
		User aatif = new User(5,"aatif",17);
		
		User[] usersArray = {sahil,akhil,sakshi,zora,aatif};
		
		return usersArray;
		
	}
	
}
	
	
