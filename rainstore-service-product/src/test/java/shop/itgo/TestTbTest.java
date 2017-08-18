package shop.itgo;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import shop.itgo.core.dao.TestTbDAO;
import shop.itgo.core.pojo.TestTb;
import shop.itgo.core.service.TestTbService;

/**
 * Junit + Spring
 * 
 * @author Administrator
 * 这样就不用写代码来加载applicationContext.xml和getBean了
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
public class TestTbTest {
	
	@Autowired
	private TestTbDAO testTbDAO;
	
	@Autowired
	private TestTbService testTbService;

	
	@Test
	public void testAdd()
	{
		TestTb testTb = new TestTb();
		testTb.setName("范冰冰");
		testTb.setBirthday(new Date());
		testTbDAO.add(testTb);
	}
	@Test
	public void testAdd2()
	{
		TestTb testTb = new TestTb();
		testTb.setName("范冰冰2");
		testTb.setBirthday(new Date());
		testTbService.add(testTb);
	}

}

