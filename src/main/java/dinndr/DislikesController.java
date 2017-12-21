package dinndr;


import java.util.ArrayList;
import java.util.Collection;

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

	
	
	
	Collection<Dish> liked = new ArrayList<>();

	Collection<Dish> disliked = new ArrayList<>();	
	
	private Log log = LogFactory.getLog(getClass());
	@RequestMapping(value="/dishes/{id}/disliked", method = RequestMethod.PUT)
    public void assignDisliked(@PathVariable Long id){
		
		UserProfile theOne = userProfileRepo.findOne(1L);
		Dish dislikedDish = dishRepo.findOne(id);
		disliked.add(dislikedDish);
		theOne = userProfileRepo.save(theOne);
		
		log.info("fuu");
    }

}
