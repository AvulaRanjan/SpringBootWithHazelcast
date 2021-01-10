package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserRepository{

	@Override
	public UserBean getUserDeatils(String id) {
		// TODO Auto-generated method stub
		simulateSlowService();
		 return new UserBean(id, "Uset  book");
	}
	
	// Don't do this at home
	  private void simulateSlowService() {
	    try {
	      long time = 3000L;
	      Thread.sleep(time);
	    } catch (InterruptedException e) {
	      throw new IllegalStateException(e);
	    }
	  }

}
