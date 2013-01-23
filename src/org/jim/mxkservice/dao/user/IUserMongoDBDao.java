package org.jim.mxkservice.dao.user;


public interface IUserMongoDBDao {
   
   public String getUserIDByNameAndPassword(String name,String password);
}
