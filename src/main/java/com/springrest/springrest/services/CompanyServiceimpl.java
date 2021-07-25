package com.springrest.springrest.services;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import com.springrest.springrest.entities.Company;
import com.springrest.springrest.entities.user;

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
		String query = "SELECT * FROM company;";
		
		List<Company> companies = template.query(query, new RowMapper<Company>() {

			@Override
			public Company mapRow(ResultSet rs, int rowNum) throws SQLException {
				// TODO Auto-generated method stub
				return new Company (rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4));
			}
		});
		
		return companies;
	}

	@Override
	public Company getById(int CompanyID) {
		
		
		String query = "select * from Company where id=?;";
		
		//see above note for errors
		Company User = template.queryForObject(query, new RowMapper<Company>() {
			
			@Override
			public Company mapRow(ResultSet rs, int arg1) throws SQLException {
				return new Company(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4));
			}
		}, CompanyID );	
					
		
		return User;
	}
	
	
	@Override
	public int addCompany(Company User) {
		String query = "insert into Company values(id,c_name,website, description) values(?,?,?.?);";
		
		int added = template.update(
				query,
				User.getId(),
				User.getName(),
				User.getWebsite(),
				User.getDescription()
		);
		return added;
	}
	
	@Override
	public int update(Company User) {
		
		String query = "update Company set id=?, name = ?, website =?, desceription =? where userid=?;";
		
		Object[] params = {User.getId(), User.getName(), User.getWebsite(), User.getDescription() };
		
		int[] types = {Types.INTEGER,Types.VARCHAR,Types.VARCHAR,Types.VARCHAR};
		
		int updated = template.update(
				query,
				params,
				types
				
		);
		
		return updated;
	}
	
	
	

	@Override
	public int deleteById(int CompanyID, Company User) {
		String query = "delete from Company where id=?;";
		
		int deleted = template.update(query, User.getId());
		return deleted;
	}

	@Override
	public Company getCompanybyName(long CompanyName) {
		// TODO Auto-generated method stub
		return null;
	}

//	@Override
//	public Company getCompanybyName(long CompanyName) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public int deleteById(int id, user u) {
//		// TODO Auto-generated method stub
//		return 0;
//	}

//	@Override
//	public Company getCompanybyName(long CompanyName) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public int deleteById(int id, user u) {
//		// TODO Auto-generated method stub
//		return 0;
//	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	

//	@Override
//	public Company updateCompany(Company company) {
//		// TODO Auto-generated method stub
//		return null;
//	}

//	@Override
//	public Company getCompanybyName(long CompanyName) {
//		// TODO Auto-generated method stub
//		return null;
//	}

//	@Override
//	public Company deleteCompany(long CompanyId) {
//		// TODO Auto-generated method stub
//		return null;
//	}

//	@Override
//	public Company deleteCompanybyName(long CompanyName) {
//		// TODO Auto-generated method stub
//		return null;
//	}
////	@Override
//	public Company deleteCompany(int CompanyID) {
//		Company c = new Company();
//	    CompanyService.removeIf(c.CompanyID ->c.CompanyID.getId().equals(CompanyID));
//	}
	
	
	//@Override
	//public user updateUser(long u_id) 
	//{
		// TODO Auto-generated method stub
	//	return null;
	//}

//	@Override
//	public Company getCompany(long CompanyId) {
//		// TODO Auto-generated method stub
//		return null;
//	}

	//private void deleteBook(@PathVariable("bookid") int bookid)   
    //{  
	//booksService.delete(bookid);  
	//}
	
	//public void updatePost(String id, Post post) {

	  //  for(int i = 0; i < posts.size(); i++) {

		//Post p = posts.get(i);

		//if(p.equals(post)) {

		  //   posts.set(i, post);
		//}
	  //  }
	//}
	
}











