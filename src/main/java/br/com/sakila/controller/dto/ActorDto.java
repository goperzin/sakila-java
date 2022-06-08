package br.com.sakila.controller.dto;

import java.util.List;
import java.util.stream.Collectors;

import br.com.sakila.modelo.Actor;
import br.com.sakila.modelo.City;

public class ActorDto {

	private String first_name;
	private String last_name;
	
	public String getFirst_name() {
		return first_name;
	}
	
	public String getLast_name() {
		return last_name;
	}
	
	public ActorDto(String first_name, String last_name) {
		super();
		this.first_name = first_name;
		this.last_name = last_name;
	}
	
	public ActorDto(Actor actor) {
		super();
		this.first_name = actor.getFirst_name();
		this.last_name = actor.getLast_name();
	}
	
	public static List<ActorDto> converteDto(List<Actor> paramActor) {
		return paramActor.stream().map(ActorDto::new).collect(Collectors.toList());	
	}
}