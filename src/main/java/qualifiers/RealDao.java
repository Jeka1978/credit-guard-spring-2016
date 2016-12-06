package qualifiers;

import org.springframework.stereotype.Repository;

import static qualifiers.DBType.MONGO;

/**
 * Created by Evegeny on 06/12/2016.
 */
@CreditGuardRepo(MONGO)
public class RealDao implements Dao {
    @Override
    public void saveData() {
        System.out.println("Saving data to Mongo");
    }
}
