package dinndr;

import javax.annotation.Resource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LikedController {

	@Resource
	private UserProfileRepo userProfileRepo;

	@Resource
	private DishRepo dishRepo;

	private Log log = LogFactory.getLog(getClass());

	@RequestMapping(value = "/dishes/{id}/liked", method = RequestMethod.PUT)
	public void assignLiked(@PathVariable Long id) {

		UserProfile theOne = userProfileRepo.findOne(1L);
		Dish likedDish = dishRepo.findOne(id);
		theOne.getLiked().add(likedDish);
		theOne = userProfileRepo.save(theOne);
		log.info("We liked -> " + theOne.getLiked());
	}

}
