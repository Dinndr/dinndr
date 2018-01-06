package dinndr;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.annotation.Resource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NextDishController {

	@Resource
	private UserProfileRepo userProfileRepo;

	@Resource
	private DishRepo dishRepo;

	@Resource
	private RestaurantRepo restaurantRepo;

	private Log log = LogFactory.getLog(getClass());

	@RequestMapping(value = "/dishes/next", method = RequestMethod.GET)
	public Dish findNextDish() {
		UserProfile theOne = userProfileRepo.findOne(1L);
		List<Dish> eligible = findEligibleDishes(theOne);
		int index = new Random().nextInt(eligible.size());
		// Dish random = all.get(index);
		log.info("New total of " + eligible.size());
		return eligible.get(index);

	}

	private List<Dish> findEligibleDishes(UserProfile profile) {
		List<Dish> all = dishRepo.findAll();

		// start with all
		List<Dish> eligible = new ArrayList<>(all);
		// remove liked
		eligible.removeAll(profile.getLiked());
		// remove disliked
		eligible.removeAll(profile.getDisliked());

		return eligible;
	}
}
