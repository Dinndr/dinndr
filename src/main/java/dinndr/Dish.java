package dinndr;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Dish {
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String name;
	
	public Dish(String name) {
		this.name = name;
	}
	public Dish() {
		
	}
	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}
}
