package com.springrest.springrest.services;

import java.util.List;
import com.springrest.springrest.entities.Company;
public interface CompanyService {
	
	public List<Company> getCompanies();
	
	public Company addCompany(Company company);

	public Company updateCompany(Company company);
	
	public Company getCompany(long CompanyId);
	
	
	

}
