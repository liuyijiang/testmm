package org.jim.mxkservice.jms.listener;
import java.util.Iterator;
import java.util.Set;

import javax.jms.MapMessage;
import javax.jms.Message;
import javax.jms.MessageListener;

import org.springframework.beans.factory.annotation.Autowired;

import redis.clients.jedis.Jedis;

/**
 * 用户工程进度推送给好友 jms 异步消息监听
 * @author jim.liu
 *
 */
public class ProjectPlanPublishListener implements MessageListener{
     
	@Autowired
	public Jedis jedis;
	
	@Override
	public void onMessage(Message message) {
//		MapMessage m = (MapMessage)message;
//		try {
//			String userid = m.getString("userId");
//			String planId = m.getString("planId");
//			String key = userid+MXKKeyNameConstant.MXK_USER_FOLLOWERSID;
//			Set<String> set = jedis.smembers(key);//获得粉丝的id
//			Iterator<String> it = set.iterator();//遍历粉丝为每一位粉丝加入新消息
//			while(it.hasNext()){//key 格式  userid   + mxk_user_new_message
//				String mkey = it.next() + MXKKeyNameConstant.MXK_USER_NEW_MESSAGE;
//				jedis.lpush(mkey, planId);
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
	}

}
