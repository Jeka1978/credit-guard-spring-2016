package quoters;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;

/**
 * Created by Evegeny on 29/11/2016.
 */
public class MyLoggerListener {
    @EventListener(ContextRefreshedEvent.class)
    public void printThatContextWasRefreshed(){
        System.out.println("STARTED!!!!!!!!!!!!!!!!!!!!");
    }
}
