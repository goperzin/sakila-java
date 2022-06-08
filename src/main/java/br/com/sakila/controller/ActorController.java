package br.com.sakila.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.sakila.controller.dto.ActorDto;
import br.com.sakila.repository.ActorRepository;

@RestController
@RequestMapping("/sakila/atores")
public class ActorController {
	
	@Autowired
	ActorRepository actorRepository;

	@RequestMapping("/all")
	public List<ActorDto> getAllActor(){
		return ActorDto.converteDto(actorRepository.findAll());
	}
}
