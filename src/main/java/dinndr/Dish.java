package dinndr;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;

@Entity
public class Dish {

	@Id
	@GeneratedValue
	private Long id;

	private String name;

	@Lob
	private String description;
	private String price;
	private String image;
	private String tagOne;
	private String tagTwo;
	private String tagThree;
	private String tagFour;
	private String tagFive;

	@ManyToOne
	private Restaurant restaurant;

	public Dish(String name, String description, Restaurant restaurant, String price, String image, String tagOne,
			String tagTwo, String tagThree, String tagFour, String tagFive) {
		this.name = name;
		this.description = description;
		this.restaurant = restaurant;
		this.price = price;
		this.image = image;
		this.tagOne = tagOne;
		this.tagTwo = tagTwo;
		this.tagThree = tagThree;
		this.tagFour = tagFour;
		this.tagFive = tagFive;
	}

	public Dish() {

	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public Restaurant getRestaurant() {
		return restaurant;
	}

	public String getPrice() {
		return price;
	}

	public String getImage() {
		return image;
	}

	public String getTagOne() {
		return tagOne;
	}

	public String getTagTwo() {
		return tagTwo;
	}

	public String getTagThree() {
		return tagThree;
	}

	public String getTagFour() {
		return tagFour;
	}

	public String getTagFive() {
		return tagFive;
	}

}
