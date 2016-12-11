package exceptionsAop;

import exceptionsAop.daos.Dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

/**
 * Created by Evegeny on 11/12/2016.
 */
@Service
public class MyService {
    @Autowired
    private Dao dao;

    @Scheduled(cron = "1/1 * * * * ?")
    public void doWork(){
        System.out.println("Working...");
        try {
            dao.save();
        } catch (Exception e) {

            System.out.println("error handled");
        }
    }
}
