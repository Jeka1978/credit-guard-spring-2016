package quoters;

import lombok.Setter;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;
import java.util.List;

/**
 * Created by Evegeny on 29/11/2016.
 */
@Setter
public class TalkingRobotImpl implements TalkingRobot {
    private List<Quoter> quoters;
    @Override
    @PostConstruct
    public void talk() {
        quoters.forEach(Quoter::sayQuote);
    }


}
