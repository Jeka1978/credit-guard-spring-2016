package credit.guard;

import credit.guard.consts.CGConst;
import credit.guard.mappers.TransactionDataParser;
import credit.guard.data.TransactionData;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by Evegeny on 13/12/2016.
 */
@RunWith(SpringRunner.class)
@ContextConfiguration(classes = TestMappersConfig.class)
public class TransactionDataParserTest {
    @Autowired
    private TransactionDataParser parser;
    @Test
    public void testAshraitObject() throws Exception {
        String text = "keyword="+ CGConst.XML+";company=IDI;card=442342342342;id=12";

        TransactionData data = parser.parse(text);

        Assert.assertEquals("IDI",data.getCompany());
        Assert.assertEquals("442342342342",data.getCardNumber());
        Assert.assertEquals("12",data.getId());

    }
    @Test
    public void testJsonObject() throws Exception {
        String text = "keyword="+ CGConst.JSON+";company=IDI;card=442342342342;id=12";

        TransactionData data = parser.parse(text);

        Assert.assertEquals("IDI",data.getCompany());
        Assert.assertEquals("442342342342",data.getCardNumber());
        Assert.assertEquals("12",data.getId());

    }

    @Test(expected = MapperNotFoundException.class)
    public void testThatExceptionIsOkWhenWeDontHaveMapper() throws Exception {
        String text = "keyword=asdassadas;company=IDI;card=442342342342;id=12";

        TransactionData data = parser.parse(text);

    }
}