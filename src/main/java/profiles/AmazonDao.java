package profiles;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

/**
 * Created by Evegeny on 11/12/2016.
 */
@Repository
@Windows(false)
public class AmazonDao implements Dao {
    @Override
    public void save() {
        System.out.println("saving to amazon cloud");
    }
}
