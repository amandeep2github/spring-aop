package learn.springaop.service;

import org.springframework.stereotype.Service;

import learn.springaop.entity.Person;

@Service
public class IntroductionService {
	public String sayHelloTo(Person person){
		return String.format("Hello %s %s %s", person.getHonorific(), person.getFirstName(), person.getLastName());
	}
}
