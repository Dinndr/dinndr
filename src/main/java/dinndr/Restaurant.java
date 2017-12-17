package dinndr;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Restaurant {

	// Variables

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String name;
	private String website;
	private String address;
	private String hours;
	private String phoneNumber;
	private String delivery;
	private double latitude;
	private double longitude;

	@OneToMany(mappedBy = "restaurant")
	private Set<Dish> restaurants;

	// used for JPA

	public Restaurant() {

	}

	public Restaurant(String name, String website, String address, String hours, String phoneNumber, String delivery, double latitude, double longitude) {
		this.name = name;
		this.website = website;
		this.address = address;
		this.hours = hours;
		this.phoneNumber = phoneNumber;
		this.delivery = delivery;
		this.latitude = latitude;
		this.longitude = longitude;
	}

	// Getters

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getWebsite() {
		return website;
	}

	public String getAddress() {
		return address;
	}

	public String getHours() {
		return hours;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public String getDelivery() {
		return delivery;
	}
	public double getLatitude() {
		return latitude;
	}
	public double getLongitude() {
		return longitude;
	}

	public Set<Dish> getRestaurants() {
		return restaurants;
	}

}
