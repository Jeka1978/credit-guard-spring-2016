package quoters;

import lombok.Setter;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Evegeny on 29/11/2016.
 */
@Setter
@Component
public class TalkingRobotImpl implements TalkingRobot {

    @Autowired
    private List<Quoter> quoters;

    @Autowired
    private StamService stamService;

    @Override
    @PostConstruct
    public void talk() {
        stamService.saySomething();
        for (Quoter quoter : quoters) {
            System.out.println(quoter.getClass());
        }
        quoters.forEach(Quoter::sayQuote);
    }


}
