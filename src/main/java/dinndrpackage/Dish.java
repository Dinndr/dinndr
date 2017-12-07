package dinndrpackage;

import org.springframework.stereotype.Component;

@Component
public class Dish {
	
	
	private long id;
	private String name;
	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}
}
