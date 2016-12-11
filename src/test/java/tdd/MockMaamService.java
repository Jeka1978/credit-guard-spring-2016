package tdd;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * Created by Evegeny on 11/12/2016.
 */
//@Component
//    @Primary
public class MockMaamService implements MaamService{
    @Override
    public double getMaam() {

        return 0.17;
    }
}
