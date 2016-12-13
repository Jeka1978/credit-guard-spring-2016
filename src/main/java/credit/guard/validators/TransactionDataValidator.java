package credit.guard.validators;

import credit.guard.data.TransactionData;

/**
 * Created by Evegeny on 13/12/2016.
 */
public interface TransactionDataValidator {
    String validate(TransactionData data);
}
