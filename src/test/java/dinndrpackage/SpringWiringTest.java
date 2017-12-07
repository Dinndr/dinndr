package dinndrpackage;

import static org.junit.Assert.*;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringWiringTest {
	
	@Resource
	private DishRepo dishRepo;
	
	@Resource
	private Dish dish;
	
	@Resource
	private DinndrController dinndrController;

	@Test
	public void contextLoads() {
	}
	
	@Test
	public void shouldCreateDish() {
		assertNotNull(dish);
	}
	
	@Test
	public void shouldCreateDishRepo() {
		assertNotNull(dishRepo);
	}
	
	@Test
	public void shouldCreateDinndrController() {
		assertNotNull(dinndrController);
	}
	
	@Test
	public void dishShouldHaveIdOfZero() {
		long underTest = dish.getId();
		assertEquals(0L, underTest);
	}
	
	@Test
	public void dishShouldHaveName() {
		String underTest = dish.getName();
		assertEquals(null, underTest);
	}
	
	
	
	
	
	
	
	

}
