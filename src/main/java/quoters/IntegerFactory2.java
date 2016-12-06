package quoters;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.FactoryBean;

import java.util.Random;

/**
 * Created by Evegeny on 06/12/2016.
 */
@AllArgsConstructor
public class IntegerFactory2 implements FactoryBean<Integer> {



    @Override
    public Integer getObject() throws Exception {
        Random random = new Random();
        return random.nextInt(10);
    }

    @Override
    public Class<?> getObjectType() {
        return Integer.class;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
