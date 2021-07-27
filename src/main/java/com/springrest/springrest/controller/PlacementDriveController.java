package com.springrest.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.entities.PlacementDrive;
import com.springrest.springrest.services.PlacementDriveService;

@RestController
public class PlacementDriveController {
	
	@Autowired
	private PlacementDriveService driveService;

	@GetMapping("/drives")
	public List<PlacementDrive> getdrives() {
		return this.driveService.getDrives();
	}

	@GetMapping("/drives/{id}")
	public PlacementDrive getDrive(@PathVariable int id) {
		return this.driveService.getDrive(id);
	}

	@PostMapping("/drives")
	public int addDrive(@RequestBody PlacementDrive drive) {
		int added = driveService.addDrive(drive);		
		return added;
	}

	
	
	@PutMapping("/drives")
	public PlacementDrive updateDrive(@RequestBody PlacementDrive drive) {
		int updated = this.driveService.updateDrive(drive);
		if (updated>0){
			return drive;
		}
		return new PlacementDrive();
	}
	
	@DeleteMapping("/drives/{id}")
	public int deleteDrive(@PathVariable int id) {
		int deleted = this.driveService.deleteDrive(id);
		return deleted;
	}
}