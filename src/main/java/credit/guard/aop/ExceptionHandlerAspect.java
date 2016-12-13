package credit.guard.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * Created by Evegeny on 13/12/2016.
 */
//@Component
//@Aspect
public class ExceptionHandlerAspect {

    @Around("execution(String credit.guard..*.*(..))")
    public String handleFormatExcettion(ProceedingJoinPoint pjp) {
      return null;
    }
}
