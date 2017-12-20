package dinndr;

import java.util.Collection;

import javax.persistence.Entity;

@Entity
public class UserProfile {

	private Collection<Dish> liked;

	private Collection<Dish> disliked;

	private Long id;

	public UserProfile(Collection<Dish> liked, Collection<Dish> disliked) {
		this.id = 1L;
		this.liked = liked;
		this.disliked = disliked;
	}

	public Collection<Dish> getLiked() {
		return liked;
	}

	public Collection<Dish> getDisliked() {
		return disliked;
	}

	public Long getId() {
		return id;
	}

	public UserProfile() {
	}

}
