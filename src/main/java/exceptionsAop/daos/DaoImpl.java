package exceptionsAop.daos;

import exceptionsAop.DatabaseException;
import org.springframework.stereotype.Repository;

import java.util.Random;

/**
 * Created by Evegeny on 11/12/2016.
 */
@Repository
public class DaoImpl implements Dao {
    @Override
    public void save() {
        Random random = new Random();
        if (random.nextInt(5) == 2) {
            throw new DatabaseException("mysql was down!!!");
        }
        System.out.println("Saved...");
    }
}
