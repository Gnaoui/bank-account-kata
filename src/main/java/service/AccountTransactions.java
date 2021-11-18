package service;


import model.AccountStatement;

public class AccountTransactions {

    private DateFormatter dateFormatter;
    private Transactions transactions;
    private StatementPrinter statementPrinter;

    /**
     * Constructer
     * @param dateFormatter
     * @param transactions
     * @param statementPrinter
     */
    public AccountTransactions(DateFormatter dateFormatter, Transactions transactions, StatementPrinter statementPrinter) {
        this.dateFormatter = dateFormatter;
        this.transactions = transactions;
        this.statementPrinter = statementPrinter;
    }

    /**
     * Fonction deposit permettant d'ajouter un amount au compte
     * @param amount
     */
    public void deposit(int amount) {
        AccountStatement deposit = new AccountStatement(dateFormatter.dateAsString(), amount);
        transactions.add(deposit);
    }

    /**
     * Function pour debiter le compte
     * @param amount
     */
    public void withdrawal(int amount) {
        AccountStatement deposit = new AccountStatement(dateFormatter.dateAsString(), -amount);
        transactions.add(deposit);
    }

}
