package br.com.sakila.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.sakila.modelo.Actor;

public interface ActorRepository extends JpaRepository<Actor, Long> {

}
