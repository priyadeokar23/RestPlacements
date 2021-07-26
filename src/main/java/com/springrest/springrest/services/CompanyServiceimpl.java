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

	@Autowired
	JdbcTemplate template;

	public List<Company> getCompanies() {
		String query = "SELECT * FROM company;";

		List<Company> companies = template.query(query, new RowMapper<Company>() {

			@Override
			public Company mapRow(ResultSet rs, int rowNum) throws SQLException {
				return new Company(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4));
			}
		});

		return companies;
	}

	@Override
	public Company getCompany(long CompanyID) {

		String query = "select * from company where name=?;";

		Company c = template.queryForObject(query, new RowMapper<Company>() {

			@Override
			public Company mapRow(ResultSet rs, int rowNum) throws SQLException {
				return new Company(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4));
			}
		}, CompanyID);

		return c;
	}

	@Override
	public int addCompany(Company company) {
		String query = "insert into company (id, name, website, description) values(?,?,?);";

		int added = template.update(query, company.getId(), company.getName(), company.getWebsite(), company.getDescription());

	return added;
  }
	
	@Override
	public int updateCompany(Company company) {
		String query = "update company set name=?, website = ?, description = ? where userid=?;";

		Object[] params = { company.getName(), company.getWebsite(), company.getDescription(), company.getId() };

		int[] types = { Types.VARCHAR, Types.VARCHAR, Types.VARCHAR, Types.INTEGER };

		int updated = template.update(query, params, types);

		return updated;
	}

	@Override
	public int deleteCompany(Company company) {
		String query = "delete from company where userid=?;";

		int deleted = template.update(query, company.getId());
		return deleted;
  }
	
}
