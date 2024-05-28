package com.example.office.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.office.dto.EbrainDto;
import com.example.office.entity.Ebrain;
import com.example.office.service.EbrainService;

@RestController
@RequestMapping("/api")
public class EbrainController {

	@Autowired
	EbrainService ebrainService;
	
	
		
	@PostMapping("/postDto")
	public EbrainDto brainDto(@RequestBody EbrainDto dto) {
		return ebrainService.ebrainDto(dto);
	}

	@GetMapping("/getDto/{id}")
	public EbrainDto dtoBrain(@PathVariable("id") int id) {
		return ebrainService.ebrainDto(id);
	}

	@PutMapping("/updateDto")
	public EbrainDto putDto(@RequestBody EbrainDto updateDto) {
		return ebrainService.putDto(updateDto);
	}
	
	@DeleteMapping("/deleteDto/{id}")
	public String deleteDto(@PathVariable ("id")int id){
		return ebrainService.deleteDto(id);
	}
	
	@GetMapping("/find/{name}")
	public EbrainDto getName (@PathVariable ("name") String name) {
		return ebrainService.getName(name);
	}
	
	@PostMapping("/postEntity")
	public Ebrain ebrain(@RequestBody Ebrain post) {
		return ebrainService.postEntity(post);
	}


	@GetMapping("/getEntity/{id}")
	public Optional<Ebrain> entityBrain(@PathVariable("id") int id) {
		return ebrainService.entityBrain(id);
	}
	
	
	
}
