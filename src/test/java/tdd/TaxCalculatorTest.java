package tdd;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * Created by Evegeny on 11/12/2016.
 */
@RunWith(SpringRunner.class)
@ContextConfiguration(classes = MockConfig.class)
@DirtiesContext(classMode = DirtiesContext.ClassMode.BEFORE_EACH_TEST_METHOD)
//@RunWith(SpringJUnit4ClassRunner.class)  before spring 4.3
public class TaxCalculatorTest {
    @Autowired
    private TaxCalculator taxCalculator;

    @Before
    public void init(){
        System.out.println(MockConfig.x);
    }


    @Test
    public void withMaam() throws Exception {
        double answer = taxCalculator.withMaam(100);
        Assert.assertEquals(117,answer,0.00001);
    }

    @Test
    public void test1(){
        double answer = taxCalculator.withMaam(1000);
        Assert.assertEquals(1170,answer,0.00001);

    }

}