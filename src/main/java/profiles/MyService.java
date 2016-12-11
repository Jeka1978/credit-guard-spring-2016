package profiles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * Created by Evegeny on 11/12/2016.
 */
@Service
public class MyService {
    @Autowired
    private Dao dao;

    @PostConstruct
    public void doWork(){
        System.out.println("Working...");
        dao.save();
    }
}
