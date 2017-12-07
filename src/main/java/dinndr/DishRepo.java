package dinndr;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface DishRepo extends CrudRepository<Dish, Long> {
	
}
