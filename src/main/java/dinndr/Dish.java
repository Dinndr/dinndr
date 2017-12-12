package dinndr;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class Dish {

	@Id
	@GeneratedValue
	private Long id;

	private String name;
<<<<<<< HEAD
	@Lob
	private String description;
	private String restaurant;
	private String price;
	private String imgUrl;
	private String tagOne;
	private String tagTwo;
	private String tagThree;
	private String tagFour;
	private String tagFive;

	public Dish(String name, String description,String restaurant, String price, String imgUrl, String tagOne, String tagTwo, String tagThree, String tagFour, String tagFive) {
		this.name = name;
		this.description = description;
		this.restaurant = restaurant;
		this.price = price;
		this.imgUrl = imgUrl;
		this.tagOne = tagOne;
		this.tagTwo = tagTwo;
		this.tagThree = tagThree;
		this.tagFour = tagFour;
		this.tagFive = tagFive;
=======

	private String image;

	public Dish(String name, String image) {
		this.name = name;
		this.image = image;
>>>>>>> viewimage
	}

	public Dish() {

	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}
<<<<<<< HEAD
	public String getDescription() {
		return description;
	}
	public String getRestaurant() {
		return restaurant;
	}
	public String getPrice() {
		return price;
	}
	public String getImgUrl() {
		return imgUrl;
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
	
=======

	public String getImage() {
		return image;
	}
>>>>>>> viewimage
}
