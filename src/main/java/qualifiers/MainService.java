package qualifiers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * Created by Evegeny on 06/12/2016.
 */
@Service
public class MainService {
    @CreditGuardRepo(DBType.MONGO)
    private Dao dao;

    @Scheduled(cron = "1/2 * * * * ?")
    public void doWork(){
        System.out.println("I'm the main service");
        dao.saveData();
    }
}
