package dinndr;

import static org.junit.Assert.*;

import java.util.Collection;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import dinndr.DinndrController;
import dinndr.DishRepo;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringWiringTest {

	@Resource
	private DishRepo dishRepo;

	@Resource
	private DinndrController dinndrController;

	@Test
	public void contextLoads() {
	}

}
