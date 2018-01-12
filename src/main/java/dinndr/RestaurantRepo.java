package dinndr;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface RestaurantRepo extends CrudRepository<Restaurant, Long> {

}
