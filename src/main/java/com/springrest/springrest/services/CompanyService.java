package com.springrest.springrest.services;

import java.util.List;
import com.springrest.springrest.entities.Company;
public interface CompanyService {
	
	
	public List<Company> 	getCompanies();					//tested, working	
	public Company 			getCompany(int companyId);		//tested, working
	
	public int 				addCompany(Company company);	//tested, working

	public int 				updateCompany(Company company);	//tested, working
	
	public int				deleteCompany(int id);			//tested, working
	
	
	

}
