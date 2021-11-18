package service;

import model.AccountStatement;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.TestInstance;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class TransactionsTest {
    private Transactions transactions;

    @Before
    public void initialise() {
        transactions = new Transactions();
    }

    @Test
    public void return_transactions_on_same_order_of_added_test() {
        AccountStatement deposit = new AccountStatement("2021-11-18 23:30", 100);
        AccountStatement withdrawal = new AccountStatement("2021-11-18 18:30", 50);
        transactions.add(deposit);
        transactions.add(withdrawal);
        List<AccountStatement> accountStatementList = transactions.all();

        Assertions.assertEquals(accountStatementList.size(), 2);
        Assertions.assertEquals(accountStatementList.get(0), deposit);
        Assertions.assertEquals(accountStatementList.get(1), withdrawal);
    }
}
