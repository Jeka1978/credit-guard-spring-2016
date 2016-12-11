package exceptionsAop;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by Evegeny on 11/12/2016.
 */
@Component
@Aspect
public class DBExceptionHandlerAspect {
    @Value("${dbaMails}")
    private String[] mails;

    @Pointcut("execution(* exceptionsAop.daos..*.*(..))")
    public void allDaosMethods(){}

    @Pointcut("@annotation(aop.Secured)")
    public void allSecuredMethods(){}



    @AfterThrowing(value = "allDaosMethods()",throwing = "ex")
    public void handleDBExceptions(DatabaseException ex) {
        for (String mail : mails) {
            System.out.println("sending to "+mail+" "+ ex.getMessage());
        }
    }


}
