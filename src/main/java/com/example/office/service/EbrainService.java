package com.example.office.service;


import java.util.List;
import java.util.Optional;

import com.example.office.dto.EbrainDto;
import com.example.office.entity.Ebrain;


public interface EbrainService {


	
	EbrainDto ebrainDto(EbrainDto dto);

	EbrainDto ebrainDto(int id);

	EbrainDto putDto(EbrainDto updateDto);

	String deleteDto(int id);
	
	EbrainDto getName(String name);

	Optional<Ebrain> entityBrain(int id);

	Ebrain postEntity(Ebrain post);

}
