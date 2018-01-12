package dinndr;

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

	@Resource
	private TagRepo tagRepo;

	@RequestMapping("/singledish")
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

}