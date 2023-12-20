package service;

import datasource.DataSource;
import entity.User;
import exception.ProductNotFoundException;

public class Service {

	private DataSource dataSource;

	public Service() {
		this.dataSource = new DataSource();
	}

	public User userValidate(User user) throws ProductNotFoundException {

		User[] usersData = dataSource.userArray();
		for (int index = 0; index < usersData.length; index++) {
			User users = usersData[index];

			if (users != null) {
				int ageValidation = user.getAge();
				if (ageValidation < 18) {
					try {
						throw new ProductNotFoundException("U are UnderAged");
					} catch (ProductNotFoundException ex) {
						System.out.println(ex.getMessage());
						ex.printStackTrace();
					}
				} else {
					System.out.println("Here Is Your Product");
				}
			}
		}
		return user;

	}
}
