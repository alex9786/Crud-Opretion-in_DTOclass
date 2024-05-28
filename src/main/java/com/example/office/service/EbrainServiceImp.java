package com.example.office.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.office.dto.EbrainDto;
import com.example.office.entity.Ebrain;
import com.example.office.repository.EbrainRepository;

@Service
public class EbrainServiceImp implements EbrainService {

	@Autowired
	EbrainRepository ebrainRepo;



	@Override
	public EbrainDto ebrainDto(EbrainDto dto) {
		Ebrain ebrain = new Ebrain();
		ebrain.setId(dto.getId());
		ebrain.setName(dto.getName());
		ebrain.setWork(dto.getWork());
		ebrainRepo.save(ebrain);
		return dto;
	}

	@Override
	public EbrainDto ebrainDto(int id) {
		Optional<Ebrain> ebrain=ebrainRepo.findById(id);
		Ebrain ebrainEnt = ebrain.get();
		EbrainDto dto = new EbrainDto();
		dto.setId(ebrainEnt.getId());
		dto.setName(ebrainEnt.getName());
		dto.setWork(ebrainEnt.getWork());
		return dto;
	}

	@Override
	public EbrainDto putDto(EbrainDto updateDto) {
		Ebrain dto = new Ebrain();
		dto.setId(updateDto.getId());
		dto.setName(updateDto.getName());
		dto.setWork(updateDto.getWork());
		ebrainRepo.save(dto);
		return updateDto;
	}

	@Override
	public String deleteDto(int id) {
		ebrainRepo.deleteById(id);
		return "Deleted ";
	}
	

	@Override
	public EbrainDto getName(String name) {
		Optional<Ebrain> ebrain=ebrainRepo.findByName(name);
		Ebrain ebrainEnt = ebrain.get();
		EbrainDto dto = new EbrainDto();
		dto.setId(ebrainEnt.getId());
		dto.setName(ebrainEnt.getName());
		dto.setWork(ebrainEnt.getWork());
		return dto;
	
	}


	@Override
	public Ebrain postEntity(Ebrain post) {
		return ebrainRepo.save(post);
	}

	@Override
	public Optional<Ebrain> entityBrain(int id) {	
		return ebrainRepo.findById(id) ;
	}

	
	
	
}
