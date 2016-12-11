package neveruseswitch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Evegeny on 06/12/2016.
 */
@Service
public class MessageBuilderFactory {

    private Map<Integer, MessageBuilder> map = new HashMap<>();

    @Autowired
    public MessageBuilderFactory(List<MessageBuilder> messageBuilders) {
        for (MessageBuilder messageBuilder : messageBuilders) {
            if (map.containsKey(messageBuilder.mailCode())) {
                throw new IllegalStateException("mailcode " + messageBuilder.mailCode() + " already in use");
            }
            map.put(messageBuilder.mailCode(), messageBuilder);
        }
    }

    public MessageBuilder getMessageBuilder(int code){
        MessageBuilder messageBuilder = map.get(code);
        if (messageBuilder == null) {
            throw new IllegalStateException("mailcode " + code + " not supported yet");
        }
        return messageBuilder;
    }


}
