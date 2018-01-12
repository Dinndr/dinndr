package dinndr;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface DishRepo extends CrudRepository<Dish, Long> {

	@Override
	public List<Dish> findAll();

}