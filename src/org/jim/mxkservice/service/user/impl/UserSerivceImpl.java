package org.jim.mxkservice.service.user.impl;

import org.jim.mxkservice.dao.user.IUserMongoDBDao;
import org.jim.mxkservice.service.user.IUserSerivce;
import org.jim.mxkservice.tool.security.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 * 
 * @author jim.liu
 *
 */
@Service
public class UserSerivceImpl implements IUserSerivce {

	@Autowired
	private IUserMongoDBDao ium;
	
	@Override
	public String userlogin(String username, String password) {
		password = SecurityUtils.digestByMd5(password);
		return ium.getUserIDByNameAndPassword(username, password);
	}

}
