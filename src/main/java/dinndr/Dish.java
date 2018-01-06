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

import com.fasterxml.jackson.annotation.JsonIgnore;


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

/*	 @Override
	    public boolean equals(Object obj)
	    {
	         
	    // checking if both the object references are 
	    // referring to the same object.
	    if(this == obj)
	            return true;
	         
	        // it checks if the argument is of the 
	        // type Geek by comparing the classes 
	        // of the passed argument and this object.
	        // if(!(obj instanceof Geek)) return false; ---> avoid.
	        if(obj == null || obj.getClass()!= this.getClass())
	            return false;
	         
	        // type casting of the argument. 
	        Dish dish = (Dish) obj;
	         
	        // comparing the state of argument with 
	        // the state of 'this' Object.
	        return (dish.name == this.name && dish.id == this.id);
	    }
*/
}
