package tdd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Evegeny on 11/12/2016.
 */
@Component
public class TaxCalculator {
    @Autowired
    private MaamService maamService;

    public double withMaam(double price) {
        double answer = maamService.getMaam() * price + price;
        System.out.println(answer);
        return answer;
    }
}
