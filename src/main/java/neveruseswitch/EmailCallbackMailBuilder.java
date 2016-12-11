package neveruseswitch;

import org.springframework.stereotype.Component;

/**
 * Created by Evegeny on 11/12/2016.
 */
@Component("2")
public class EmailCallbackMailBuilder implements MailBuilder {
    @Override
    public String buildBody() {
        return "don't call us we call you";
    }
}
