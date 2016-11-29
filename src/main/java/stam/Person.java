package stam;

import lombok.Setter;
import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Component;

/**
 * Created by Evegeny on 29/11/2016.
 */
@Component
@Conditional(OnPersonCondition.class)
public class Person {


    public void setName(String name) {
    }

    public void setAge(int age) {
    }
}



