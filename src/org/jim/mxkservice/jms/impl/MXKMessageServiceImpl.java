package org.jim.mxkservice.jms.impl;

import javax.jms.Destination;

import org.jim.mxkservice.jms.IMXKMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class MXKMessageServiceImpl implements IMXKMessageService{
   
	@Autowired
	private JmsTemplate jmsTemplate;
	
	@Autowired
	private Destination destination;//用户进度
	
	@Autowired
	private Destination messagedestination;//用户消息
	
//	@Autowired
//	private IMessageMongoService imms;
	
	@Override
	public void publishPlanToFollowor(String userid,String projectid,String plan) {
//		MXKMessageCreator mess = new MXKMessageCreator(userid,projectid,plan,null);
//		jmsTemplate.send(destination,mess);
	}

	@Override
	@Transactional
	public void publishUserMessageFollowor(String username,String userid,String projectid,String message,String type) {
//		//save message
//		MessageVO vo = new MessageVO();
//		vo.setBcId(projectid);
//		vo.setMessage(message);
//		vo.setOwnerId(userid);
//		vo.setType(type);
//		vo.setOwnername(username);
//		imms.saveUserMessage(vo);
//		if(vo.getId() != null){
//			 MXKMessageCreator mess = new MXKMessageCreator(userid,vo.getId(),null,message);
//			 jmsTemplate.send(messagedestination,mess);
//		}
	}

	public JmsTemplate getJmsTemplate() {
		return jmsTemplate;
	}

	public void setJmsTemplate(JmsTemplate jmsTemplate) {
		this.jmsTemplate = jmsTemplate;
	}

	public Destination getDestination() {
		return destination;
	}

	public void setDestination(Destination destination) {
		this.destination = destination;
	}

	public Destination getMessagedestination() {
		return messagedestination;
	}

	public void setMessagedestination(Destination messagedestination) {
		this.messagedestination = messagedestination;
	}
    
	
	
}
