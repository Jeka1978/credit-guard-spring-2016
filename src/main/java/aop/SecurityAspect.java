package aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.Random;

/**
 * Created by Evegeny on 11/12/2016.
 */
@Component
@Aspect
public class SecurityAspect {

    @Around("@annotation(Secured)")
    public void handleSecuredMethods(ProceedingJoinPoint pjp) throws Throwable {
        Random random = new Random();
        if (random.nextInt(5) == 1) {
            throw new RuntimeException("not allowed here, try again...");
        }
        pjp.proceed();

    }
}
