package quoters;

import lombok.Setter;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * Created by Evegeny on 29/11/2016.
 */

@Component
@Order(2)
@Books
public class ShakespearQuoter implements Quoter {
    @Value("${shake}")
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
