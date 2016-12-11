package neveruseswitch;

import org.springframework.stereotype.Repository;

import java.util.Random;

/**
 * Created by Evegeny on 06/12/2016.
 */
@Repository
public class MailDaoImpl implements MailDao {

    private Random random =new Random();

    @Override
    public int mailCode() {
        int mailCode = random.nextInt(3) + 1;
        return mailCode;
    }
}
