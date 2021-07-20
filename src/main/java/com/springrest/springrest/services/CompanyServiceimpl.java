package com.springrest.springrest.services;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import com.springrest.springrest.entities.Company;

import org.springframework.jdbc.core.RowMapper;



@Service
public class CompanyServiceimpl implements CompanyService {

	List<Company> list;
	
	@Autowired
	JdbcTemplate template;
	
//	public CompanyServiceimpl() {
//		
//		list =new ArrayList<>();
//		list.add(new Company(1, "ABC", "Software Enginner", 12, 7.5, "Mumbai"));
//		list.add(new Company(2, "XYZ", "Software Enginner", 8, 6.5, "Pune"));
//		list.add(new Company(3, "ASD", "Software Testing", 10, 7, "Pune"));
//
//		
//	}


	public List<Company> getCompanies() 
	{
		// TODO Auto-generated method stub
		String query = "SELECT * FROM company;";
		
//		List<Company> users1 = template.query(query, new RowMapper<Company>() {
//
//			@Override
//			public Company mapRow(ResultSet rs, int rowNum) throws SQLException {
//				return new user(rs.getInt(1), rs.getString(2), rs.getString(3));
//			}});
//		
		List<Company> users = template.query(query, new RowMapper() {

			@Override
			public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
				// TODO Auto-generated method stub
				return new Company (rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4));
			}
		});
		
		return users;
//		return list;
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











