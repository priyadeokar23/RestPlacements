package com.springrest.springrest.controller;

import java.util.*;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springrest.springrest.entities.Company;
import com.springrest.springrest.services.CompanyService;

@RestController
public class CompanyController
{
	@Autowired	
	private CompanyService companyService;	

	//working
	@GetMapping("/test")
	public String home()
	{
		return "Welcome to Company Management System";
	}
	
	//working
	@GetMapping("/companies")
	public List<Company> getCompanies()
	{
		return this.companyService.getCompanies();
		
	}
	
	//working	
	@GetMapping ("/companies/{CompanyID}")
	public Company getCompany(@PathVariable int CompanyID)
	{
		return this.companyService.getCompany(CompanyID);
	}
	
	
	//working
	@PostMapping("/companies")
	public Company addCompany(@RequestBody Company company)
	{
		int added = companyService.addCompany(company);
		if(added>0) {
			return company;
		}		
		return new Company();
		
	}
	
	//working
	@PutMapping("/companies")
	public int updateCompany(@RequestBody Company company)
	{
		return this.companyService.updateCompany(company);		
	}
	
	//working
	@DeleteMapping("/companies/{id}")
	public int deleteCompany(@PathVariable int id) {
		int deleted = this.companyService.deleteCompany(id);
		return deleted;
	}

	
}










