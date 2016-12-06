package neveruseswitch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

/**
 * Created by Evegeny on 06/12/2016.
 */
@Service
public class MailSender {

    @Autowired
    private MailDao mailDao;

    @Scheduled(cron = "1/1 * * * * ?")
    public void sendMail(){
        int mailCode = mailDao.mailCode();
        switch (mailCode) {
            case 1:
                //60 lines of code
                System.out.println("sending Welcome");
                break;
            case 2:
                //130 lines of code
                System.out.println("sending: email callback");
                break;
        }










    }
}
