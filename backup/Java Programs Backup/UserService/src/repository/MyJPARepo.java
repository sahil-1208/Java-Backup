package repository;

import model.User;

public interface MyJPARepo {

	User save(User user);
	User findById(int id);
	void deleteById(int id);
}
