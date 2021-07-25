package com.springrest.springrest.services;

import java.util.List;
import com.springrest.springrest.entities.Company;
import com.springrest.springrest.entities.user;
public interface CompanyService {
	
	public List<Company> getCompanies();
	
	public int addCompany(Company User);
	
	public Company getCompanybyName(long CompanyName);
	
	public Company getById(int CompanyID);

	public int update(Company u1);

	public int deleteById(int CompanyID, Company u);

	//int deleteById(int id, Company User);

	

	//public Company addCompany(Company company);
	
	//public Company updateCompany(Company company);
	
	//public Company getbyid(long CompanyId);
	
	//public Company deleteCompany(int CompanyId);
	
	//public Company deleteCompanybyName(long CompanyName);
	
	//public user updateUser(long u_id);

}
