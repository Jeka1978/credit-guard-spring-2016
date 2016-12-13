package credit.guard.controllers;

import credit.guard.data.TransactionData;
import credit.guard.services.TransactionDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by Evegeny on 13/12/2016.
 */
@Controller
public class TransactionDataController {
    @Autowired
    private TransactionDataService service;

    public String response(String request) {
        TransactionData transactionData = service.createTransactionData(request);
        return transactionData.toString();
    }
}
