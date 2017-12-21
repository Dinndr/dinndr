package dinndr;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NextDishController {

	@RequestMapping(value = "/dishes/next", method = RequestMethod.GET)
	public Dish findNextDish() {
		return new Dish("test", null, null, null, null ) ;
	}

}
