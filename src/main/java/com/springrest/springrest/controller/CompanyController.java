package com.springrest.springrest.controller;

import java.util.*;


import org.springframework.beans.factory.annotation.Autowired;
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

	@GetMapping("/test")
	public String home()
	{
		return "Welcome to Company Management System";
	}
	
	//Get the Companies	
	@GetMapping("/Companies")
	public List<Company> getCompanies()
	{
		return this.companyService.getCompanies();
		
	}
	
	//Get Single Company	
	@GetMapping ("/Companies/{CompanyID}")
	public Company getCompany(@PathVariable String CompanyID)
	{
		return this.companyService.getCompany(Long.parseLong(CompanyID));
	}
	
	
	// Add Company
	@PostMapping("/Companies")
	public Company addCompany(@RequestBody Company company)
	{
		int added = companyService.addCompany(company);
		if(added>0) {
			return company;
		}		
		return new Company();
		
	}
	
	@PutMapping("/Companies")
	public int updateCompany(@RequestBody Company company)
	{
		return this.companyService.updateCompany(company);
		
	}
	
	public int deleteCompany(@RequestBody Company company) {
		int deleted = this.companyService.deleteCompany(company);
		return deleted;
	}

	
}










