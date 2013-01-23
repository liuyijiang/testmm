package org.jim.mxkservice.vo.user;

import org.jim.mxkservice.vo.base.BaseVO;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
/**
 * mongodb中持久化
 * @author jim.liu
 *
 */
@Document
public class UserVO extends BaseVO{
    
	/**
	 * 
	 */
	private static final long serialVersionUID = -8324135769457143163L;
	
	@Id
	private String id;
	private String name;
	private String email;
	private String password;
	private String createTime;
	private String hobby;
	private String image;
	private String sex;
	private String info;
	
	//这些都是没有持久化在mysql中的 只在mongdb中
	private long followors;//粉丝
	private long focus;//关注
	private long projects;//项目数
	private long messages;//消息数量
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	public long getFollowors() {
		return followors;
	}
	public void setFollowors(long followors) {
		this.followors = followors;
	}
	public long getFocus() {
		return focus;
	}
	public void setFocus(long focus) {
		this.focus = focus;
	}
	public long getProjects() {
		return projects;
	}
	public void setProjects(long projects) {
		this.projects = projects;
	}
	public long getMessages() {
		return messages;
	}
	public void setMessages(long messages) {
		this.messages = messages;
	}
	
	@Override
	public String toString() {
		return "UserVO [id=" + id + ", name=" + name + ", email=" + email
				+ ", password=" + password + ",createTime=" + createTime
				+ ", hobby=" + hobby + ", image=" + image + ",sex=" + sex
				+ ",info=" + info + ",followors=" + followors + ",focus="
				+ focus + ",projects=" + projects + ",messages=" + messages
				+ "]";
	}
	
}
