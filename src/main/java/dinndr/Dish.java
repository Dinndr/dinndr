package dinndr;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
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

	@ManyToMany
	private Set<Tag> tags;

	public long getTagId() {
		return id;
	}

	public Set<Tag> getTags() {
		return tags;
	}

	@ManyToOne
	private Restaurant restaurant;

	public Dish(String name, String description, Restaurant restaurant, String price, String image, Tag... tags) {
		this.name = name;
		this.description = description;
		this.restaurant = restaurant;
		this.price = price;
		this.image = image;
		this.tags = new HashSet<>(Arrays.asList(tags));
	}

	private Dish() {

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

	public void add(Tag tag) {
		tags.add(tag);

	}

	public void remove(Tag tag) {
		tags.remove(tag);
	}

	@Override
	public String toString() {
		return name;
	}

	@Override
	public int hashCode() {
		return name.hashCode();
	}

}
