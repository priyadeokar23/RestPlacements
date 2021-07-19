package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springrest.springrest.entities.Company;

@Service
public class CompanyServiceimpl implements CompanyService {

	List<Company> list;
	
	public CompanyServiceimpl() {
		
		list =new ArrayList<>();
		list.add(new Company(1, "ABC", "Software Enginner", 12, 7.5, "Mumbai"));
		list.add(new Company(2, "XYZ", "Software Enginner", 8, 6.5, "Pune"));
		list.add(new Company(3, "ASD", "Software Testing", 10, 7, "Pune"));

		
	}


	public List<Company> getCompanies() 
	{
		// TODO Auto-generated method stub
		return list;
	}

	@Override
	public Company getCompany(long CompanyID) {
		// TODO Auto-generated method stub
		
		Company c=null;
		
		for(Company company:list)
		{
			if(company.getId()==CompanyID)
			{
				c=company;
				break;
			}
		}
		return c;
	}





	@Override
	public Company addCompany(Company company) {
		// TODO Auto-generated method stub
		list.add(company);
		return company;
	}





	@Override
	public Company updateCompany(Company company) {
		// TODO Auto-generated method stub
		return null;
	}





//	@Override
//	public Company getCompany(long CompanyId) {
//		// TODO Auto-generated method stub
//		return null;
//	}

}











