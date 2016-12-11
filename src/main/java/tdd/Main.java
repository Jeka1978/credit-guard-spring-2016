package tdd;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Evegeny on 11/12/2016.
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("tdd");
        context.getBean(TaxCalculator.class).withMaam(100);
    }
}
