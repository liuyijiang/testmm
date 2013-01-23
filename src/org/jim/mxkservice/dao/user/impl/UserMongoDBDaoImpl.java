package org.jim.mxkservice.dao.user.impl;

import org.jim.mxkservice.dao.user.IUserMongoDBDao;
import org.jim.mxkservice.vo.user.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

@Service
public class UserMongoDBDaoImpl implements IUserMongoDBDao {
  
	@Autowired
	private MongoOperations mog; 
	
	@Override
	public String getUserIDByNameAndPassword(String name, String password) {
		String success = null;
		Query q = new Query(Criteria.where("email").is(name).and("password").is(password));
		UserVO vo = mog.findOne(q, UserVO.class,"userVO");
		if(vo != null && vo.getId() != null){
			success = vo.getId();
		}
	    return success;
	}

}
