package com.springrest.springrest.services;

import java.util.List;
import com.springrest.springrest.entities.Company;
public interface CompanyService {
	
	public List<Company> 	getCompanies();	
	public Company 			getCompany(long companyId);	
	
	public int 				addCompany(Company company);

	public int 				updateCompany(Company company);
	
	public int				deleteCompany(Company company);
	
	
	

}
