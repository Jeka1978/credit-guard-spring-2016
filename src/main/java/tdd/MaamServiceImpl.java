package tdd;

import org.springframework.stereotype.Component;

/**
 * Created by Evegeny on 11/12/2016.
 */
@Component
public class MaamServiceImpl implements MaamService {
    @Override
    public double getMaam() {
        return 0.18;
    }
}
