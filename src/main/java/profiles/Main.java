package profiles;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Evegeny on 11/12/2016.
 */
public class Main {
    public static void main(String[] args) {
        new AnnotationConfigApplicationContext("profiles");
    }
}
