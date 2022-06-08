package br.com.sakila.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.sakila.controller.dto.CityDto;
import br.com.sakila.repository.CityRepository;

@RestController
@RequestMapping("/sakila/cidades")
public class CityController {
	
	@Autowired
	CityRepository cityRepository;

	@RequestMapping("/all")
	public List<CityDto> getAllCity(){
		return CityDto.converteDto(cityRepository.findAll());
	}
}
