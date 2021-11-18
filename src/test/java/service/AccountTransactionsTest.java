package service;

import model.AccountStatement;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.BDDMockito;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class AccountTransactionsTest {

    private static final String SYSTEM_DATE = "2021-11-18 18:30";

    @Mock
    Transactions transactions;
    @Mock
    DateFormatter dateFormatter;

    @Mock
    StatementPrinter statementPrinter;

    private AccountTransactions accountTransactions;

    @Before
    public void initialise() {
        BDDMockito.given(dateFormatter.dateAsString()).willReturn(SYSTEM_DATE);
        accountTransactions = new AccountTransactions(dateFormatter, transactions, statementPrinter);
    }

    @Test
    public void deposit_transaction_test() {
        AccountStatement depositAccountStatement = new AccountStatement(SYSTEM_DATE, 500);
        accountTransactions.deposit(500);
        Mockito.verify(transactions).add(Matchers.refEq(depositAccountStatement));
    }
}
