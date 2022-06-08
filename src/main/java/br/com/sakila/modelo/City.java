package br.com.sakila.modelo;

import java.time.LocalDateTime;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class City {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long city_id;
    private String city;
    private Long country_id;
    private LocalDateTime last_updat;
    
	public Long getCity_id() {
		return city_id;
	}
	
	public void setCity_id(Long city_id) {
		this.city_id = city_id;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public Long getCountry_id() {
		return country_id;
	}
	
	public void setCountry_id(Long country_id) {
		this.country_id = country_id;
	}
	
	public LocalDateTime getLast_updat() {
		return last_updat;
	}
	
	public void setLast_updat(LocalDateTime last_updat) {
		this.last_updat = last_updat;
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
		City other = (City) obj;
		return Objects.equals(city_id, other.city_id);
	}
}