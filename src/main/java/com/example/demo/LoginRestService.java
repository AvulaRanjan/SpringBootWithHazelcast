package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/examples")
public class LoginRestService {

	@Autowired
	private LoginService loginService;

	private static Logger logger = LoggerFactory.getLogger(LoginRestService.class);

	@GetMapping("/{userName}/{userId}")
	public UserBean login(@PathVariable("userName") String userName, @PathVariable("userId") String userId) {
		UserBean userBean = new UserBean(userId, userId);
		userBean.setUserId(userId);
		userBean.setUserName(userName);
		UserBean result = loginService.getStoreBeanDetails(userBean);

		return result;

	}
	
	@GetMapping("/{id}")
	public String login(@PathVariable("id") String id) {
		
		String result = loginService.getLoginDetails(id);

		return result +"  ===>"+id;

	}

}
