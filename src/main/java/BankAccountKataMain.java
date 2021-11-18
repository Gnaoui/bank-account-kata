import service.AccountTransactions;
import service.DateFormatter;
import service.StatementPrinter;
import service.Transactions;

public class BankAccountKataMain {
    public static void main(String[]args){
        DateFormatter dateFormatter = new DateFormatter();
        Transactions transactions = new Transactions();
        StatementPrinter statementPrinter = new StatementPrinter();
        AccountTransactions accountTransactions = new AccountTransactions(dateFormatter, transactions, statementPrinter);

        accountTransactions.deposit(2000);
        accountTransactions.withdrawal(200);
        accountTransactions.withdrawal(175);
        accountTransactions.deposit(100);
        accountTransactions.withdrawal(33);
        accountTransactions.deposit(220);

        //Log History
        accountTransactions.printStatement();
    }
}
