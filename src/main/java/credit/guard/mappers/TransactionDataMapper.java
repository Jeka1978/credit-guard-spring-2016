package credit.guard.mappers;

import credit.guard.data.TransactionData;

import java.util.Map;

/**
 * Created by Evegeny on 13/12/2016.
 */
public interface TransactionDataMapper {
    TransactionData build(Map<String,String> map);
    String getIdentifier();
}
