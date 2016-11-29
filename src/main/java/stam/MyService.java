package stam;

import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * Created by Evegeny on 29/11/2016.
 */
@Component
@EnableScheduling
public class MyService {
    @Scheduled(cron = "1/2 * * * * ?")
    public void doWork(){
        System.out.println("Working");
    }
}
