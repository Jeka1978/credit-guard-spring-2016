package quoters;

import lombok.Setter;

/**
 * Created by Evegeny on 29/11/2016.
 */
@Setter
public class ShakespearQuoter implements Quoter {
    private String message;
    @InjectRandomInt(min =3, max = 7)
    private int repeat;

    @Override
    public void sayQuote() {
        for (int i = 0; i < repeat; i++) {
            System.out.println(message);
        }
    }

    public void memntoMory() throws InterruptedException {
        System.out.println("memento mory");
        Thread.sleep(10000);
        System.out.println("memento finished");
    }
}
