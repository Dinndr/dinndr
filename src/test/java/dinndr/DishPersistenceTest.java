package dinndr;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.data.repository.CrudRepository;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@DataJpaTest
public class DishPersistenceTest {

	@Resource
	private CrudRepository<Dish, Long> repo;
	
	@Resource
	private TestEntityManager entityManager;
	
	@Test
	public void shouldSaveADish() {
		Dish dish = new Dish("Lasagna", null, null, null, null, null, null, null, null, null);
		
		dish = repo.save(dish);
		long generatedId = dish.getId();
		
		entityManager.flush();
		entityManager.detach(dish);
		
		Dish result = repo.findOne(generatedId);
		assertThat(result.getId(), is(generatedId));
		assertThat(result.getName(), is("Lasagna"));
	}
}
