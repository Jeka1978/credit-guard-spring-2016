package aop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * Created by Evegeny on 11/12/2016.
 */
@Component
public class JobRunner {
    @Autowired
    private ImportantService importantService;

    @Scheduled(cron = "1/2 * * * * ?")
    public void startWork(){
        importantService.doWork();
    }
}
