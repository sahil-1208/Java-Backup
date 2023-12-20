package repository;

import java.util.ArrayList;
import java.util.List;

import model.User;

public class UserRepoImpl implements UserRepo {

	private List<User> userList;
	
	public UserRepoImpl() {
		userList = new ArrayList();
	}

	@Override
	public User save(User user) {
	 userList.add(user);
		return user;
	}

	@Override
	public User findById(int id) {
	User user =	userList.get(id);
		return user;
	}

	@Override
	public void deleteById(int id) {
		userList.remove(id);
		
	}
}
