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

	private String image;

	public Dish(String name, String image) {
		this.name = name;
		this.image = image;
	}

	public Dish() {

	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getImage() {
		return image;
	}
}
