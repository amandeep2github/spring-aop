package learn.springaop.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class CallTracerAspect {
    private int sequence;

    @Around("within(learn.springaop..*)")
    public Object callTracer(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        String clz = proceedingJoinPoint.getTarget().getClass().getSimpleName();
        String method = proceedingJoinPoint.getSignature().getName();
        System.out.printf("class %s, method %s, sequence %d\n",clz, method, ++sequence);
        Object retVal = proceedingJoinPoint.proceed(proceedingJoinPoint.getArgs());
        --sequence;
        return retVal;

    }
}
