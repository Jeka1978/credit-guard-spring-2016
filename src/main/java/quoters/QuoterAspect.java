package quoters;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * Created by Evegeny on 11/12/2016.
 */
@Component
@Aspect
public class QuoterAspect {

    @Before("execution(* quoters..*.say*(..))")
    public void handleSayMethods(JoinPoint jp){
        Class<?> originalClass = jp.getTarget().getClass();
        System.out.print("This is quote of "+originalClass.getSimpleName()+":");
    }










}
