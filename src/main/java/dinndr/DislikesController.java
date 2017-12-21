package dinndr;

import javax.annotation.Resource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DislikesController {

	@Resource
	private UserProfileRepo userProfileRepo;

	@Resource
	private DishRepo dishRepo;

	private Log log = LogFactory.getLog(getClass());

	@RequestMapping(value = "/dishes/{id}/disliked", method = RequestMethod.PUT)
	public void assignDisliked(@PathVariable Long id) {

		UserProfile theOne = userProfileRepo.findOne(1L);
		Dish dislikedDish = dishRepo.findOne(id);
		theOne.getDisliked().add(dislikedDish);
		theOne = userProfileRepo.save(theOne);
		log.info(theOne.getDisliked());
		log.info("fuu");
	}

}
