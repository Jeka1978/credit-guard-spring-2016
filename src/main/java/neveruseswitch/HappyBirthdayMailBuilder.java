package neveruseswitch;

import org.springframework.stereotype.Component;

/**
 * Created by Evegeny on 11/12/2016.
 */
@Component("3")
public class HappyBirthdayMailBuilder implements MailBuilder {
    @Override
    public String buildBody() {
        return "happy birthday";
    }
}
