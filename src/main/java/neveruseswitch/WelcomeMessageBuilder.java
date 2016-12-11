package neveruseswitch;

import org.springframework.stereotype.Component;

/**
 * Created by Evegeny on 11/12/2016.
 */
@Component
public class WelcomeMessageBuilder implements MessageBuilder {
    @Override
    public String buildBody() {
        // 60 lines of code
        return "Welcome";
    }

    @Override
    public int mailCode() {
        return 1;
    }
}
