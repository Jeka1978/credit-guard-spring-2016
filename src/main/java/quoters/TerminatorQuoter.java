package quoters;

import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Async;

import javax.annotation.PreDestroy;
import java.util.List;

/**
 * Created by Evegeny on 29/11/2016.
 */
@Setter
public class TerminatorQuoter implements Quoter {
    private List<String> messages;

    @Override
    public void sayQuote() {
        messages.forEach(System.out::println);
    }

    @PreDestroy
    private void killAll() throws InterruptedException {
        new Thread(() -> {
            System.out.println("You are terminated...");
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("You are terminated...");
        }).start();


    }
}
