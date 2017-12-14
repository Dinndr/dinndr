package dinndr;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DinndrController {

	@Resource
	private DishRepo dishRepo;

	@RequestMapping("/viewdish")
	public String showDish(Model model) {
		List<Dish> all = dishRepo.findAll();
		int index = new Random().nextInt(all.size());
		Dish random = all.get(index);
		model.addAttribute("modelDish", random);
		return "singledish";
	}

	@RequestMapping("/dishes")
	public String fetchDishes(Model model) {
		model.addAttribute("dishes", dishRepo.findAll());
		return "dishes";
	}

}
