package com.example.demo;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class LoginService {
	 @Cacheable("examples")
	public String getLoginDetails(String id ) {
		 System.out.println("First time service call");
		return getCheckloginDetailsCache(id);
		// TODO Auto-generated method stub
		
	}
	 private String getCheckloginDetailsCache(String id) {
	        System.out.println(" Values are store in cache");
	        try {
	        	 System.out.println(" Cached Use details");
	            Thread.sleep(3000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	        return " Value store in cached    ==>"+id;
	    }
	 @Cacheable("userBean")
	public UserBean getStoreBeanDetails(UserBean userBean) {
		 UserBean bean =new UserBean("123", "ranjan");		
		return  this.getCheckUserDetailsCache(bean);
	}
	 private UserBean getCheckUserDetailsCache(UserBean userBean) {
	        System.out.println(" Values are store in cache");
	        try {
	        	 System.out.println(" Cached Use details");
	            Thread.sleep(3000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	        return userBean;
	    }
}


