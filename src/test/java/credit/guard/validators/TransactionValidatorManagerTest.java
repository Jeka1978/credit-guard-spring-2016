package credit.guard.validators;

import credit.guard.data.TransactionData;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by Evegeny on 13/12/2016.
 */
@RunWith(SpringRunner.class)
@ContextConfiguration(classes = ValidatorConfig.class)
public class TransactionValidatorManagerTest {
    @Autowired
    private TransactionValidatorManager validatorManager;

    @Test
    public void testThatLettersCantBeInCreditCardNumber() throws Exception {

        TransactionData transactionData = TransactionData.builder()
                .cardNumber("eqwewqewqe")
                .id("12")
                .build();
        List<String> errors = validatorManager.validate(transactionData);
        Assert.assertNotEquals(0,errors.size());

    }

    @Test
    public void testThatWhenEveruthingValidNoErrorsWillBeInTheList() throws Exception {

        TransactionData transactionData = TransactionData.builder()
                .cardNumber("1233-2323")
                .id("12")
                .build();
        List<String> errors = validatorManager.validate(transactionData);
        Assert.assertEquals(0,errors.size());
    }
}