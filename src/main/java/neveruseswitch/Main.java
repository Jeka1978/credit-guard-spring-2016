package neveruseswitch;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Evegeny on 06/12/2016.
 */
public class Main {
    public static void main(String[] args) {
        new AnnotationConfigApplicationContext(Config.class);
    }
}
