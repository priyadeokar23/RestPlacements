package com.springrest.springrest.services;

import java.util.List;

import com.springrest.springrest.entities.PlacementDrive;

public interface PlacementDriveService {
	
	public List<PlacementDrive> 	getDrives();	//tested, working
	public PlacementDrive 			getDrive(int id);	//tested, working
	
	public int 				addDrive(PlacementDrive d);//tested, working

	public int 				updateDrive(PlacementDrive d);//tested, working
	
	public int				deleteDrive(int id);//tested, working
}
