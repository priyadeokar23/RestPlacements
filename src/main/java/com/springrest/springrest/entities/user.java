package com.springrest.springrest.entities;

public class user
{
	int u_id;
	String name;
	String mob_no;
	String mail_college;
	String password;
	
	public user(int u_id, String name, String mob_no, String mail_college, String password) {
		super();
		this.u_id = u_id;
		this.name = name;
		this.mob_no = mob_no;
		this.mail_college = mail_college;
		this.password = password;
	}
	public int getU_id() {
		return u_id;
	}
	public void setU_id(int u_id) {
		this.u_id = u_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMob_no() {
		return mob_no;
	}
	public void setMob_no(String mob_no) {
		this.mob_no = mob_no;
	}
	public String getMail_college() {
		return mail_college;
	}
	public void setMail_college(String mail_college) {
		this.mail_college = mail_college;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	 

}
