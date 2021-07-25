package com.springrest.springrest.services;

import java.util.List;

import com.springrest.springrest.entities.PlacementDrive;

public interface PlacementDriveService {
	
	public List<PlacementDrive> 	getDrives();	
	public PlacementDrive 			getDrive(int id);	
	
	public int 				addDrive(PlacementDrive d);

	public int 				updateDrive(PlacementDrive d);
	
	public int				deleteDrive(PlacementDrive d);
}
