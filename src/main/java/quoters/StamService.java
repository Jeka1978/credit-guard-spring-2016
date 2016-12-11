package quoters;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * Created by Evegeny on 11/12/2016.
 */
@Component
public class StamService {

    @PostConstruct
    public void saySomething(){
        System.out.println("Something...");
    }
}
