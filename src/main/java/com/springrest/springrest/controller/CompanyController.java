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
import com.springrest.springrest.entities.user;
import com.springrest.springrest.services.CompanyService;

@RestController
public class CompanyController
{
	@Autowired	
	private CompanyService companyService;
	
	

	@GetMapping("/home")
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
	
	//Get company by Id
	@GetMapping("/Company/{CompanyID}")
	public Company getbyid(@PathVariable int CompanyID)
		{
			Company C_ID = companyService.getById(CompanyID);
			return C_ID;
		}
	
	@PostMapping("/add")
	public Company AddCompany(@RequestBody Company User) {	
		int added = companyService.addCompany(User);
		if(added>0) {
			return User;
		}		
		return new Company();
	}
	
	@PutMapping("/updateUser")
	public int updateCompany(@RequestBody Company u1) {
		
		return companyService.update(u1);
	}
	
	@DeleteMapping("/delete/{CompanyID}")
	public int deleteUser(@PathVariable int CompanyID, @RequestBody Company u) {
		return companyService.deleteById(CompanyID, u);
	}
	
	
	
//	
////	//Get Single Company(by ID)
////	@GetMapping ("/Companies/{CompanyID}")
////	public Company getCompany(@PathVariable int CompanyID)
////	{
////		return this.companyService.getCompany(CompanyID);
////	}
//	
//	//Get Single company (by name)
//	@GetMapping("/Companies/{CompanyName}")
//	public Company getCompanybyName(@PathVariable String CompanyName)
//	{
//		return this.companyService.getCompanybyName(Long.parseLong(CompanyName));
//	}
//	
////	// Add Company
////	@PostMapping("/Companies")
////	public Company addCompany(@RequestBody Company company)
////	{
////		return this.companyService.addCompany(company);
////		
////	}
//	
//
//	//upload new Company data
//	@PutMapping("/Companies")
//	public Company updateCompany(@RequestBody Company company)
//	{
//		return this.companyService.updateCompany(company);
//		
//	}
//	//Delete Company (Using Name)
//		@DeleteMapping("/Companies/{CompanyID}")
//		public Company deleteCompanybyName(@PathVariable String CompanyName)
//		{
//			return this.companyService.deleteCompanybyName(Long.parseLong(CompanyName));
//		}
//	
//		
//		@PostMapping("/add")
//		public Company addCompany(@RequestBody Company company) {	
//			Company added = companyService.addCompany(company);
////			if(added>0) {
////				return added;
////			}		
//			return new Company();
//		}
//		
//		
//		@GetMapping("/Company/{CompanyID}")
//		public Company getbyid(@PathVariable long C_ID) {
//			Company company = companyService.getbyid(C_ID);
//			return company;
//			
//		}
//		
////		@GetMapping("/getUser/{id}")
////		public user getbyid(@PathVariable int id) {
////			user User = dao.getById(id);
////			return User;
////			
////		}
//		
//		
//		
//	//upload user
//	//@PutMapping("/User/{u_id}")
//	//public user updateUser(@RequestBody user)
//	//{
//	//	return this.companyService.updateUser(user);
//	//}
//	
//	
////	//Delete Company (Using ID)
////	@DeleteMapping("/Companies/{CompanyID}")
////	public Company deleteCompany(@PathVariable int CompanyID )
////	{
////		return this.companyService.deleteCompany(CompanyID);
////	}
//	
//	
//	
//	
//	//@RequestMapping(value="/users/{id}", method = RequestMethod.PUT)
//	//public void getUser(@PathVariable String id, @RequestBody User user) {
//
////	    userService.updateUser(id, user);
//
////	}
//	
//	//@RequestMapping(value="/posts/{id}", method = RequestMethod.PUT)
//	//public void updatePost(@PathVariable String id, @RequestBody Post post) {
//
//	   //   postService.updatePost(id, post);
//
//	//}
//	
//	
//	
////	 @RequestMapping(value = "/Companies/{companyID}", method = RequestMethod.DELETE)
////	 public Company deleteComapny(@PathVariable int CompanyID) 
////	 {
////	     return this.companyService.deleteCompany(CompanyID);
////	 }
//	
	
}










