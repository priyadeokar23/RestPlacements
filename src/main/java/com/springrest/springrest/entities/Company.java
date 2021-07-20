package com.springrest.springrest.entities;

public class Company

{

	private int id;
	private String name;
	private String website;
	private String description;
	
//	private String roledes;
//	private int ctc;
//	private double cgpaCrit;
//	private String place;
	
	
	public Company()
	{
		super();
		
	}

	

public Company(int id, String name, String website, String description) {
	
	this.id = id;
	this.name = name;
	this.website = website;
	this.description = description;
}



public int getId() {
	return id;
}



public void setId(int id) {
	this.id = id;
}



public String getName() {
	return name;
}



public void setName(String name) {
	name = name;
}



public String getWebsite() {
	return website;
}



public void setWebsite(String website) {
	this.website = website;
}



public String getDescription() {
	return description;
}



public void setDescription(String description) {
	this.description = description;
}



//	@Override
//	public String toString() {
//		return "Company [Name=" + Name + ", roledes=" + roledes + ", ctc=" + ctc + ", cgpaCrit=" + cgpaCrit + ", place="
//				+ place + "]";
//	}
}
	