package dinndr;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Tag {

	@Id
	@GeneratedValue
	private long id;

	private String taste;

	@ManyToMany(mappedBy = "tags")
	private Set<Dish> taggedBy;

	public long getId() {
		return id;
	}

	public Set<Dish> getTaggedBy() {
		return taggedBy;
	}

	private Tag() {
	}

	public Tag(String taste) {
		this.taste = taste;
	}

	public String getTaste() {
		return taste;
	}

}
