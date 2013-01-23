package org.jim.mxkservice.jms.listener;

import java.util.Iterator;
import java.util.Set;

import javax.jms.MapMessage;
import javax.jms.Message;
import javax.jms.MessageListener;

import org.springframework.beans.factory.annotation.Autowired;

import redis.clients.jedis.Jedis;

/**
 * 这个message 是用来推送用户的各种小消息
 * @author jim.liu
 *
 */
public class SimpleMessagePublishListener implements MessageListener{
  
	@Autowired
	public Jedis jedis;
	
	@Override
	public void onMessage(Message message) {
//		MapMessage m = (MapMessage)message;
//		try{
//			if(m != null){
//				String userid = m.getString("userId");
//				String projectId = m.getString("projectId");//这里projectid是消息的id
//				String key = userid+MXKKeyNameConstant.MXK_USER_FOLLOWERSID;
//				Set<String> set = jedis.smembers(key);//获得粉丝的id
//				Iterator<String> it = set.iterator();//遍历粉丝为每一位粉丝加入新消息
//				while(it.hasNext()){//key 格式  userid + mxk_user  + mxk_user_new_message
//				    String mkey = it.next() + MXKKeyNameConstant.MXK_USER_ON_MESSAGE_SET;
////					String value = (projectId+MXKKeyNameConstant.MXK_MESSAGE).getBytes();//将主作为value
//					jedis.lpush(mkey, projectId);//将messageid放入list中
//				}
//			}
//		}catch(Exception e){
//			e.printStackTrace();
//		}
	}
	
}
