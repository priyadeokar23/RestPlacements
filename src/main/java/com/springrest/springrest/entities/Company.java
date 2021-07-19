package com.springrest.springrest.entities;

public class Company

{

	private int id;
	private String Name;
	private String roledes;
	private int ctc;
	private double cgpaCrit;
	private String place;
	
	public Company(int id, String name, String roledes, int ctc, double cgpa, String place) {
		super();
		this.Name = name;
		this.roledes = roledes;
		this.ctc = ctc;
		this.cgpaCrit = cgpa;
		this.place = place;
	}

	public Company()
	{
		super();
		
	}

	

//	@Override
//	public String toString() {
//		return "Company [Name=" + Name + ", roledes=" + roledes + ", ctc=" + ctc + ", cgpaCrit=" + cgpaCrit + ", place="
//				+ place + "]";
//	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setCgpaCrit(double cgpaCrit) {
		this.cgpaCrit = cgpaCrit;
	}

	public String getName() {
		return Name;
	}

	@Override
	public String toString() {
		return "Company [id=" + id + ", Name=" + Name + ", roledes=" + roledes + ", ctc=" + ctc + ", cgpaCrit="
				+ cgpaCrit + ", place=" + place + "]";
	}

	public void setName(String name) {
		Name = name;
	}

	public String getRoledes() {
		return roledes;
	}

	public void setRoledes(String roledes) {
		this.roledes = roledes;
	}

	public int getCtc() {
		return ctc;
	}

	public void setCtc(int ctc) {
		this.ctc = ctc;
	}

	public double getCgpaCrit() {
		return cgpaCrit;
	}

	public void setCgpaCrit(float cgpaCrit) {
		this.cgpaCrit = cgpaCrit;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}
	
	
	
	
	
	
}
