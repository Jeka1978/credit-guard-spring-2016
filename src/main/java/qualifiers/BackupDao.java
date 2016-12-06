package qualifiers;

import org.springframework.stereotype.Repository;

/**
 * Created by Evegeny on 06/12/2016.
 */
@CreditGuardRepo(DBType.ORACLE)
public class BackupDao implements Dao {
    @Override
    public void saveData() {
        System.out.println("saving to Oracle");
    }
}
