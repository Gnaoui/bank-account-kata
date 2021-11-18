package service;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.runner.RunWith;
import org.mockito.BDDMockito;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class PrintStatementFeature {

    @Mock
    DateFormatter dateFormatter;

    @Mock
    StatementPrinter statementPrinter;

    private AccountTransactions accountTransactions;

    @Before
    public void initialise() {
        Transactions transactions = new Transactions();
        StatementPrinter statementPrinter = new StatementPrinter();
        accountTransactions = new AccountTransactions(dateFormatter, transactions, statementPrinter);
    }

    @Test
    public void should_print_statement_containing_all_transactions() {
        BDDMockito.given(dateFormatter.dateAsString()).willReturn("2021-11-10 10:30");
        accountTransactions.deposit(1000);
        accountTransactions.withdrawal(100);
        accountTransactions.deposit(500);
        accountTransactions.printStatement();
    }

    @Test
    public void print_line_test() {
        statementPrinter.printLine("Operation | Date             | Amount | Balance");
        statementPrinter.printLine("Deposit | 2021-11-18 23:30 | 500,00 | 1400,00");
        statementPrinter.printLine("Withdraw | 2021-11-18 18:30 | -100,00 | 900,00");
        statementPrinter.printLine("Deposit | 2021-11-16 18:30 | 1000,00 | 1000,00");

    }
}
