package br.com.sakila.controller.dto;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import br.com.sakila.modelo.City;

public class CityDto {
	
	private Long city_id;
    private String city;
    
    public CityDto(City cityModelo) {
		super();
		this.city_id = cityModelo.getCity_id();
		this.city = cityModelo.getCity();
	}
    
	public CityDto(Long city_id, String city) {
		super();
		this.city_id = city_id;
		this.city = city;
	}

	public Long getCity_id() {
		return city_id;
	}

	public String getCity() {
		return city;
	}

	@Override
	public int hashCode() {
		return Objects.hash(city_id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CityDto other = (CityDto) obj;
		return Objects.equals(city_id, other.city_id);
	}

	public static List<CityDto> converteDto(List<City> paramCity) {
		return paramCity.stream().map(CityDto::new).collect(Collectors.toList());	
	}
}
