package neveruseswitch;

import org.springframework.stereotype.Component;

/**
 * Created by Evegeny on 11/12/2016.
 */
@Component("1")
public class WelcomeMailBuilder implements MailBuilder {
    @Override
    public String buildBody() {
        // 60 lines of code
        return "Welcome";
    }
}
