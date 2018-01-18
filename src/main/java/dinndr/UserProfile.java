package dinndr;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class UserProfile {

	@ManyToMany
	private Collection<Dish> liked;

	@ManyToMany
	private Collection<Dish> disliked;

	@Id
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

	public void removeAll(Collection<Dish> liked2) {
		// TODO Auto-generated method stub
		
	}
}
