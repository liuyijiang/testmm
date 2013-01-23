package org.jim.mxkservice.web.service.user;

import javax.jws.WebService;

@WebService
public interface IMXKUserService {
   
	public String userlogin(String username,String password);
	
}
