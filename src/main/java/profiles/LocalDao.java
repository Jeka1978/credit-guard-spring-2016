package profiles;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

/**
 * Created by Evegeny on 11/12/2016.
 */
@Repository
@Profile("local")
public class LocalDao implements Dao {
    @Override
    public void save() {
        System.out.println("saving locally");
    }
}
