package dinndr;

import java.util.List;
import java.util.Random;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NextDishController {
	
	@Resource
	private DishRepo dishRepo;
	
	@Resource
	private RestaurantRepo restaurantRepo;

	@RequestMapping(value = "/dishes/next", method = RequestMethod.GET)
	public Dish findNextDish() {
		List<Dish> all = dishRepo.findAll();
		int index = new Random().nextInt(all.size());
		Dish random = all.get(index);
		return dishRepo.findOne((long) index);
				}

}
