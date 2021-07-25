package com.springrest.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.springrest.springrest.entities.PlacementDrive;
import com.springrest.springrest.services.PlacementDriveService;

public class PlacementDriveController {
	@Autowired	
	private PlacementDriveService driveService;	

	@GetMapping("/testdrive")
	public String home()
	{
		return "Welcome to PlacementDrive Management System";
	}
	
	//Get the Companies	
	@GetMapping("/Drives")
	public List<PlacementDrive> getdrives()
	{
		return this.driveService.getDrives();
		
	}
	
	//Get Single PlacementDrive	
	@GetMapping ("/Drives/{id}")
	public PlacementDrive getDrive(@PathVariable int id)
	{
		return this.driveService.getDrive(id);
	}
	
	
	// Add PlacementDrive
	@PostMapping("/Drives")
	public PlacementDrive addDrive(@RequestBody PlacementDrive drive)
	{
		int added = driveService.addDrive(drive);
		if(added>0) {
			return drive;
		}		
		return new PlacementDrive();
		
	}
	
	@PutMapping("/Companies")
	public int updateDrive(@RequestBody PlacementDrive drive)
	{
		return this.driveService.updateDrive(drive);
		
	}
	
	public int deleteDrive(@RequestBody PlacementDrive drive) {
		int deleted = this.driveService.deleteDrive(drive);
		return deleted;
	}
}
