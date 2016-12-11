package neveruseswitch;

import org.springframework.stereotype.Component;

/**
 * Created by Evegeny on 11/12/2016.
 */
@Component
public class HappyBirthdayMessageBuilder implements MessageBuilder {
    @Override
    public String buildBody() {
        return "happy birthday";
    }

    @Override
    public int mailCode() {
        return 3;
    }
}
