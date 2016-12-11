package aop;

import org.springframework.stereotype.Service;

/**
 * Created by Evegeny on 11/12/2016.
 */
@Service
public class ImportantServiceImpl implements ImportantService {
    @Override
    @Secured
    public void doWork() {
        System.out.println("Very important work...");
    }
}
