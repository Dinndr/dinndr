package dinndr;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DinndrController {

	@Resource
	private DishRepo dishRepo;

	// @RequestMapping("/dish")
	// public String fetchDish(@RequestParam("id") long id, Model model) {
	// model.addAttribute("dish", dishRepo.findOne(id));
	// return "dish";
	// }

	@RequestMapping("/dishes")
	public String fetchDishes(Model model) {
		model.addAttribute("dishes", dishRepo.findAll());
		return "dishes";
	}

}
