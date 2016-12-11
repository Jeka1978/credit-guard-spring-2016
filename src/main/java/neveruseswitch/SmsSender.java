package neveruseswitch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

/**
 * Created by Evegeny on 06/12/2016.
 */
@Service
public class SmsSender {

    @Autowired
    private MessageCodeDao messageCodeDao;

    @Autowired
    private MessageBuilderFactory builderFactory;


    @Scheduled(cron = "1/1 * * * * ?")
    public void sendMail(){
        int messageCode = messageCodeDao.messageCode();
        MessageBuilder messageBuilder = builderFactory.getMessageBuilder(messageCode);
        String body = messageBuilder.buildBody();
        send(body);



    }

    private void send(String body) {
        System.out.println("sending sms... "+body);
    }
}
