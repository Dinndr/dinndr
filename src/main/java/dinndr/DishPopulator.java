package dinndr;

import javax.annotation.Resource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DishPopulator implements CommandLineRunner{

	
	@Resource
	private DishRepo dishRepo;
	
	@Override
	public void run(String... args) throws Exception {
		
		Dish spaghetti = new Dish("Spaghetti");
		spaghetti = dishRepo.save(spaghetti);
	}

	
	
}
