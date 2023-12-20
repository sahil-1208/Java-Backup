package controller;

import entity.User;
import service.Service;

public class Controller {

	private Service service;

	public Controller() {
		this.service = new Service();
	}

	
	public User findUser(String name)  {
		User users = null;

		switch(name) {

		case "sahil" : {
			User sahil = new User(1, "sahil", 22);
			users = sahil;
			break;
		}
		case "akhil": {
			User akhil = new User(2, "akhil", 26);
			users = akhil;
			break;
		}
		case "sakshi": {
			User sakshi = new User(3, "sakshi", 22);
			users = sakshi;
			break;
		}
		case "zora": {
			User zora = new User(4, "zorawar", 21);
			users = zora;
			break;
		}
		case "aatif": {
			User aatif = new User(5, "aatif", 17);
			users = aatif;
			break;
		}
		default : {
			System.out.println("Name case not found");
			return users;
		}
		}
		
		User validatedUser = service.userValidate(users);	
			System.out.println(validatedUser);
			return validatedUser;
	}
	
}
