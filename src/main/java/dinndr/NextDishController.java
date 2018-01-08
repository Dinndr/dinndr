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
		List<Dish> likedDishes = findLikedDishes(theOne);
		log.info("New total of " + eligible.size());
		if (eligible.size() > 0) {
			int eligibleIndex = new Random().nextInt(eligible.size());
			return eligible.get(eligibleIndex);
		} else {
			int eligibleLikedIndex = new Random().nextInt(likedDishes.size());
			return likedDishes.get(eligibleLikedIndex);
		}

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

	private List<Dish> findLikedDishes(UserProfile profile) {

		List<Dish> likedEligible = new ArrayList<>(profile.getLiked());

		return likedEligible;
	}
}
