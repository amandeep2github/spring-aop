package learn.springaop.service;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import learn.springaop.entity.Person;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class IntroductionServiceTests {
	
	@Autowired
	private IntroductionService introService;

	@Test
	public void testSayHelloTo() {
		Person person = new Person("Amandeep");
		assertEquals("Hello Mr. Amandeep Singh", introService.sayHelloTo(person));
	}

}
