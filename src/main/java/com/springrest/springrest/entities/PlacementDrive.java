package com.springrest.springrest.entities;

public class PlacementDrive {
	int p_id;
	
    String c_name;  
    String employment_type; 
    String job_title; 
    String job_description;
    
    String stipend; 
    String location;
    
    String duration;
    String degree;
    String batch;     
    String branch;
    
    String min_cgpa; 
    String min_X_marks;
    String min_XII_marks;
    String diploma_cgpa; 
    
    int 	active_backlogs;
    int 	dead_backlogs; 
    int 	gap_years;
    
    String required_skills;
    String optional_skills;
    String requirement_remarks;
    
    String form_link;
    String form_deadline;

    	public PlacementDrive() {
		
	}

	public PlacementDrive(int p_id, String c_name, String employment_type, String job_title, String job_description,
			String stipend, String location, String duration, String degree, String batch, String branch,
			String min_cgpa, String min_X_marks, String min_XII_marks, String diploma_cgpa, int active_backlogs,
			int dead_backlogs, int gap_years, String required_skills, String optional_skills,
			String requirement_remarks, String form_link, String form_deadline) {
		super();
		this.p_id = p_id;
		this.c_name = c_name;
		this.employment_type = employment_type;
		this.job_title = job_title;
		this.job_description = job_description;
		this.stipend = stipend;
		this.location = location;
		this.duration = duration;
		this.degree = degree;
		this.batch = batch;
		this.branch = branch;
		this.min_cgpa = min_cgpa;
		this.min_X_marks = min_X_marks;
		this.min_XII_marks = min_XII_marks;
		this.diploma_cgpa = diploma_cgpa;
		this.active_backlogs = active_backlogs;
		this.dead_backlogs = dead_backlogs;
		this.gap_years = gap_years;
		this.required_skills = required_skills;
		this.optional_skills = optional_skills;
		this.requirement_remarks = requirement_remarks;
		this.form_link = form_link;
		this.form_deadline = form_deadline;
	}

		public int getP_id() {
		return p_id;
	}

	public void setP_id(int p_id) {
		this.p_id = p_id;
	}

	public String getC_name() {
		return c_name;
	}

	public void setC_name(String c_name) {
		this.c_name = c_name;
	}

	public String getEmployment_type() {
		return employment_type;
	}

	public void setEmployment_type(String employment_type) {
		this.employment_type = employment_type;
	}

	public String getJob_title() {
		return job_title;
	}

	public void setJob_title(String job_title) {
		this.job_title = job_title;
	}

	public String getJob_description() {
		return job_description;
	}

	public void setJob_description(String job_description) {
		this.job_description = job_description;
	}

	public String getStipend() {
		return stipend;
	}

	public void setStipend(String stipend) {
		this.stipend = stipend;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public String getBatch() {
		return batch;
	}

	public void setBatch(String batch) {
		this.batch = batch;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getMin_cgpa() {
		return min_cgpa;
	}

	public void setMin_cgpa(String min_cgpa) {
		this.min_cgpa = min_cgpa;
	}

	public String getMin_X_marks() {
		return min_X_marks;
	}

	public void setMin_X_marks(String min_X_marks) {
		this.min_X_marks = min_X_marks;
	}

	public String getMin_XII_marks() {
		return min_XII_marks;
	}

	public void setMin_XII_marks(String min_XII_marks) {
		this.min_XII_marks = min_XII_marks;
	}

	public String getDiploma_cgpa() {
		return diploma_cgpa;
	}

	public void setDiploma_cgpa(String diploma_cgpa) {
		this.diploma_cgpa = diploma_cgpa;
	}

	public int getActive_backlogs() {
		return active_backlogs;
	}

	public void setActive_backlogs(int active_backlogs) {
		this.active_backlogs = active_backlogs;
	}

	public int getDead_backlogs() {
		return dead_backlogs;
	}

	public void setDead_backlogs(int dead_backlogs) {
		this.dead_backlogs = dead_backlogs;
	}

	public int getGap_years() {
		return gap_years;
	}

	public void setGap_years(int gap_years) {
		this.gap_years = gap_years;
	}

	public String getRequired_skills() {
		return required_skills;
	}

	public void setRequired_skills(String required_skills) {
		this.required_skills = required_skills;
	}

	public String getOptional_skills() {
		return optional_skills;
	}

	public void setOptional_skills(String optional_skills) {
		this.optional_skills = optional_skills;
	}

	public String getRequirement_remarks() {
		return requirement_remarks;
	}

	public void setRequirement_remarks(String requirement_remarks) {
		this.requirement_remarks = requirement_remarks;
	}

	public String getForm_link() {
		return form_link;
	}

	public void setForm_link(String form_link) {
		this.form_link = form_link;
	}

	public String getForm_deadline() {
		return form_deadline;
	}

	public void setForm_deadline(String form_deadline) {
		this.form_deadline = form_deadline;
	}
    
    
}
