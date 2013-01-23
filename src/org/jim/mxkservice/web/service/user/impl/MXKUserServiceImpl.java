package org.jim.mxkservice.web.service.user.impl;

import javax.jws.WebService;

import org.jim.mxkservice.service.user.IUserSerivce;
import org.jim.mxkservice.web.service.user.IMXKUserService;
import org.springframework.beans.factory.annotation.Autowired;

@WebService(endpointInterface = "org.jim.mxkservice.web.service.user.IMXKUserService",
serviceName = "UserService")
public class MXKUserServiceImpl implements IMXKUserService {
  
	@Autowired
	private IUserSerivce ius;
	
	@Override
	public String userlogin(String username, String password) {
		return ius.userlogin(username, password);
	}

}
