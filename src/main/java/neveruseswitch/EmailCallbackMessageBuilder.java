package neveruseswitch;

import org.springframework.stereotype.Component;

/**
 * Created by Evegeny on 11/12/2016.
 */
@Component
public class EmailCallbackMessageBuilder implements MessageBuilder {
    @Override
    public String buildBody() {
        return "don't call us we call you";
    }

    @Override
    public int mailCode() {
        return 2;
    }
}
