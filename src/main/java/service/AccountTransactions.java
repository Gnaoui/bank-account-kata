package service;


import model.AccountStatement;

public class AccountTransactions {

    private DateFormatter dateFormatter;
    private Transactions transactions;
    private StatementPrinter statementPrinter;

    public AccountTransactions(DateFormatter dateFormatter, Transactions transactions, StatementPrinter statementPrinter) {
        this.dateFormatter = dateFormatter;
        this.transactions = transactions;
        this.statementPrinter = statementPrinter;
    }

    public void deposit(int amount) {
    }


}
