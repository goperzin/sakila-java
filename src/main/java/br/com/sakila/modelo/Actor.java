package br.com.sakila.modelo;

import java.time.LocalDateTime;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Actor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long actor_id;
	private String first_name;
	private String last_name;
	private LocalDateTime last_update;
	
	public Long getActor_id() {
		return actor_id;
	}
	
	public String getFirst_name() {
		return first_name;
	}
	
	public String getLast_name() {
		return last_name;
	}
	
	public LocalDateTime getLast_update() {
		return last_update;
	}

	@Override
	public int hashCode() {
		return Objects.hash(actor_id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Actor other = (Actor) obj;
		return Objects.equals(actor_id, other.actor_id);
	}
}