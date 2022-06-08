package br.com.sakila.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.sakila.modelo.City;

public interface CityRepository extends JpaRepository<City, Long> {

}
