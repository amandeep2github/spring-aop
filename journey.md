05/10/17:
Caused by: java.lang.IllegalArgumentException: ProceedingJoinPoint is only supported for around advice

Caused by: java.lang.IllegalArgumentException: Pointcut is not well-formed: expecting '(' at character position 44
learn.springaop.service.IntroductionService.*(..)

Caused by: org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'org.springframework.context.event.internalEventListenerProcessor': Initialization of bean failed; nested exception is java.lang.IllegalArgumentException: error at ::0 can't find referenced pointcut sayHelloTo

Caused by: java.lang.IllegalArgumentException: Pointcut is not well-formed: expecting '(' at character position 9
execution=(learn.springaop.service.IntroductionService.sayHelloTo(..))

Caused by: java.lang.IllegalArgumentException: Pointcut is not well-formed: expecting 'name pattern' at character position 65
execution(learn.springaop.service.IntroductionService.sayHelloTo(..))
                                                                 ^
                                                                 
                                                                 Caused by: java.lang.IllegalArgumentException: Pointcut is not well-formed: expecting 'name pattern' at character position 65
execution(learn.springaop.service.IntroductionService.sayHelloTo())

