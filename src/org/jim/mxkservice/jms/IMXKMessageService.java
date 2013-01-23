package org.jim.mxkservice.jms;

public interface IMXKMessageService {
    
	public void publishPlanToFollowor(String userid,String projectid,String plan);
	
	public void publishUserMessageFollowor(String username,String userid,String projectid,String message,String type);
	
}
