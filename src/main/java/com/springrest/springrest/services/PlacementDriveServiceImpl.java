package com.springrest.springrest.services;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import com.springrest.springrest.entities.PlacementDrive;
import com.springrest.springrest.entities.PlacementDrive;

@Service
public class PlacementDriveServiceImpl implements PlacementDriveService {

	@Autowired
	JdbcTemplate template;
	
	@Override
	public List<PlacementDrive> getDrives() {
		String query = "SELECT * FROM d;";

		List<PlacementDrive> drives = template.query(query, new RowMapper<PlacementDrive>() {

			@Override
			public PlacementDrive mapRow(ResultSet rs, int rowNum) throws SQLException {
				return new PlacementDrive(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4));
			}
		});

		return drives;
	}
	}

	@Override
	public PlacementDrive getDrive(int id) {
		String query = "select * from d where name=?;";

		PlacementDrive d = template.queryForObject(query, new RowMapper<PlacementDrive>() {

			@Override
			public PlacementDrive mapRow(ResultSet rs, int rowNum) throws SQLException {
				return new PlacementDrive(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4));
			}
		}, id);

		return d;
	}

	@Override
	public int addDrive(PlacementDrive d) {
		String query = "insert into d (id, name, website, description) values(?,?,?);";

		int added = template.update(query, d.getId(), d.getName(), d.getWebsite(), d.getDescription());
		return added;
	}

	@Override
	public int updateDrive(PlacementDrive d) {
		String query = "update d set name=?, website = ?, description = ? where userid=?;";

		Object[] params = { d.getName(), d.getWebsite(), d.getDescription(), d.getId() };

		int[] types = { Types.VARCHAR, Types.VARCHAR, Types.VARCHAR, Types.INTEGER };

		int updated = template.update(query, params, types);

		return updated;
	}

	@Override
	public int deleteDrive(PlacementDrive d) {
		String query = "delete from d where userid=?;";

		int deleted = template.update(query, d.getId());
		return deleted;
	}
	
}
