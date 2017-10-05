package learn.springaop.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import learn.springaop.entity.Person;

@Component
@Aspect
public class HonorificAspect {
	
	@Before("execution(* learn.springaop.service.IntroductionService.sayHelloTo(*))")
	public void addCitation(JoinPoint joinPoint){
		Object[] args = joinPoint.getArgs();
		Person person = (Person) args[0];
		person.setHonorific("Mr.");
		person.setLastName("Singh");
	}
}
