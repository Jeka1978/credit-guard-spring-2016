package neveruseswitch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * Created by Evegeny on 06/12/2016.
 */
@Service
public class MailSender {

    @Autowired
    private MailDao mailDao;

    @Autowired
    private Map<String, MailBuilder> map;



    @Scheduled(cron = "1/1 * * * * ?")
    public void sendMail(){
        String mailCode = String.valueOf(mailDao.mailCode());
        MailBuilder mailBuilder = map.get(mailCode);
        if (mailBuilder == null) {
            throw new IllegalStateException("mailcode " + mailCode + " not supported yet");
        }
        String body = mailBuilder.buildBody();
        send(body);



    }

    private void send(String body) {
        System.out.println("sending... "+body);
    }
}
