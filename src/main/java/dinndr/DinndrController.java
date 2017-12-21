package dinndr;

import java.util.List;
import java.util.Random;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class DinndrController {

	@Resource
	private DishRepo dishRepo;

	@Resource
	private TagRepo tagRepo;

	@RequestMapping("/viewdish")
	public String showDish(Model model) {
		List<Dish> all = dishRepo.findAll();
		int index = new Random().nextInt(all.size());
		Dish random = all.get(index);
		List<Tag> allTags = tagRepo.findAll();
		Tag randomTag = allTags.get(index);
		model.addAttribute("modelDish", random);
		model.addAttribute("modelDishRepo", all);
		model.addAttribute("modelTagRepo", randomTag);

		List<Dish> allNext = dishRepo.findAll();
		int indexNext = new Random().nextInt(allNext.size());
		Dish randomNext = all.get(indexNext);
		model.addAttribute("modelNextDish", randomNext);
		return "singledish";
	}

	@RequestMapping("/dishes")
	public String fetchDishes(Model model) {
		model.addAttribute("dishes", dishRepo.findAll());
		return "dishes";
	}
	

	@RequestMapping("/slideshow")
	public String showSlideshow(Model model) {
		List<Dish> all = dishRepo.findAll();
		int index = new Random().nextInt(all.size());
		Dish random = all.get(index);
		model.addAttribute("modelDish", random);

		List<Dish> allNext = dishRepo.findAll();
		int indexNext = new Random().nextInt(allNext.size());
		Dish randomNext = all.get(indexNext);
		model.addAttribute("modelNextDish", randomNext);
		return "slideshow";
	}

}