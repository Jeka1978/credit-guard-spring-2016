package quoters;

import lombok.AllArgsConstructor;

import java.util.Random;

/**
 * Created by Evegeny on 06/12/2016.
 */
@AllArgsConstructor
public class IntegerFactory {

    private int max;
    public int getRandomInt() {
        Random random = new Random();
        return random.nextInt(max);
    }
}
