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

@Service
public class PlacementDriveServiceImpl implements PlacementDriveService {

	@Autowired
	JdbcTemplate template;

	@Override
	public List<PlacementDrive> getDrives() {
		String query = "select * from placementdrive;";

		List<PlacementDrive> drives = template.query(query, new RowMapper<PlacementDrive>() {

			@Override
			public PlacementDrive mapRow(ResultSet rs, int rowNum) throws SQLException {
				return new PlacementDrive(rs.getInt(1), 
						rs.getString(2), rs.getString(3), rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),
						rs.getString(8),rs.getString(9),rs.getString(10),rs.getString(11),rs.getString(12),rs.getString(13),rs.getString(14),rs.getString(15),
						rs.getInt(16),rs.getInt(17),rs.getInt(18),
						rs.getString(19),rs.getString(20),rs.getString(21),rs.getString(22),rs.getString(23)
						);
			}
		});

		return drives;
	}

	@Override
	public PlacementDrive getDrive(int id) {
		String query = "select * from placementdrive where p_id=?;";

		PlacementDrive d = template.queryForObject(query, new RowMapper<PlacementDrive>() {

			@Override
			public PlacementDrive mapRow(ResultSet rs, int rowNum) throws SQLException {
				return new PlacementDrive(rs.getInt(1), 
						rs.getString(2), rs.getString(3), rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),
						rs.getString(8),rs.getString(9),rs.getString(10),rs.getString(11),rs.getString(12),rs.getString(13),rs.getString(14),rs.getString(15),
						rs.getInt(16),rs.getInt(17),rs.getInt(18),
						rs.getString(19),rs.getString(20),rs.getString(21),rs.getString(22),rs.getString(23));
			}
		}, id);

		return d;
	}

	@Override
	public int addDrive(PlacementDrive d) {
		String query = "insert into placementdrive values(?,?,?,?,?,  ?,?,?,?,?,  ?,?,?,?,?,   ?,?,?,?,?,  ?,?,?);";

		Object[] params = { d.getP_id(),
				d.getC_name(), d.getEmployment_type(), d.getJob_title(), d.getJob_description(),
				d.getStipend(), d.getLocation(),
				d.getDuration(), d.getDegree(), d.getBatch(), d.getBranch(),
				d.getMin_cgpa(), d.getMin_X_marks(), d.getMin_XII_marks(),d.getDiploma_cgpa(),
				d.getActive_backlogs(), d.getDead_backlogs(), d.getGap_years(),
				d.getRequired_skills(), d.getOptional_skills(), d.getRequirement_remarks(),
				d.getForm_link(), d.getForm_deadline()				
		};
		int added = template.update(query,params);
		return added;
	}

	@Override
	public int updateDrive(PlacementDrive d) {
		
		String query = "update placementdrive set c_name=?,employment_type=?,job_title=?,job_description=?,stipend=?,  location=?,duration=?,degree=?,batch=?,branch=?,  min_cgpa=?,min_X_Marks=?,min_XII_marks=?,diploma_cgpa=?,active_backlogs=?,   dead_backlogs=?,gap_years=?,required_skills=?,optional_skills=?,requirement_remarks=?,  form_link=?,form_deadline=? where p_id=? ";
		
		Object[] params = { 
	d.getC_name(), d.getEmployment_type(), d.getJob_title(), d.getJob_description(),
	d.getStipend(), d.getLocation(),
	d.getDuration(), d.getDegree(), d.getBatch(), d.getBranch(),
	d.getMin_cgpa(), d.getMin_X_marks(), d.getMin_XII_marks(),d.getDiploma_cgpa(),
	d.getActive_backlogs(), d.getDead_backlogs(), d.getGap_years(),
	d.getRequired_skills(), d.getOptional_skills(), d.getRequirement_remarks(),
	d.getForm_link(), d.getForm_deadline(),
	d.getP_id()
		};

		int[] types = { 
				Types.VARCHAR, Types.VARCHAR, Types.VARCHAR,  Types.VARCHAR,
				 Types.VARCHAR, Types.VARCHAR,
				 Types.VARCHAR, Types.VARCHAR, Types.VARCHAR, Types.VARCHAR,
				 Types.VARCHAR, Types.VARCHAR, Types.VARCHAR, Types.VARCHAR,
				Types.INTEGER,Types.INTEGER,Types.INTEGER,
				 Types.VARCHAR, Types.VARCHAR, Types.VARCHAR,
				 Types.VARCHAR, Types.VARCHAR,
				 Types.INTEGER};

		int updated = template.update(query, params, types);

		return updated;
	}

	@Override
	public int deleteDrive(int id) {
		String query = "delete from placementdrive where p_id=?;";
		int deleted = template.update(query,id);
		return deleted;
	}

}