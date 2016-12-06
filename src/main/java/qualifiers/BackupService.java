package qualifiers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

/**
 * Created by Evegeny on 06/12/2016.
 */
@Service
public class BackupService {
    @CreditGuardRepo(DBType.ORACLE)
    private Dao dao;

    @Scheduled(cron = "1/4 * * * * ?")
    public void doBackup(){
        System.out.println("I'm the backup service");
        dao.saveData();
    }
}
