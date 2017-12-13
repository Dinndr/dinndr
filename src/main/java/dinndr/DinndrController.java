package dinndr;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DinndrController {
	
	@Resource
	public DishRepo dishRepo;
	
	@RequestMapping("/viewdish")
	public String showDish (Model model) {
		model.addAttribute("modelDish", dishRepo.findOne(1L));
		return "singledish";
	}

	@RequestMapping("/dishes")
	public String fetchDishes(Model model) {
		model.addAttribute("dishes", dishRepo.findAll());
		return "dishes";
	}
	
}
