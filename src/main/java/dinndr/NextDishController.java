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
		if (eligible.isEmpty()) {
			return null;
		} else {
			int eligibleIndex = new Random().nextInt(eligible.size());
			return eligible.get(eligibleIndex);
		}
	}

	private List<Dish> findEligibleDishes(UserProfile profile) {
		List<Dish> all = dishRepo.findAll();

		List<Dish> eligible = new ArrayList<>(all);
		eligible.removeAll(profile.getLiked());
		eligible.removeAll(profile.getDisliked());

		return eligible;
	}

	private List<Dish> findLikedDishes(UserProfile profile) {

		List<Dish> likedEligible = new ArrayList<>(profile.getLiked());

		return likedEligible;
	}

	@RequestMapping(value = "/dishes/liked/random", method = RequestMethod.GET)
	public Dish findRandomLiked() {
		UserProfile theOne = userProfileRepo.findOne(1L);
		List<Dish> likedDishes = findLikedDishes(theOne);
		int randomLikedIndex = new Random().nextInt(likedDishes.size());
		return likedDishes.get(randomLikedIndex);
	}
}
