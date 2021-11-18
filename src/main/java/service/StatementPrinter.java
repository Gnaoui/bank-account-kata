package service;

import constants.Constant;
import model.AccountStatement;

import java.text.DecimalFormat;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class StatementPrinter {

    /**
     * Fonction global de print
     */
    public void print(List<AccountStatement> accountStatementList) {
        printHeader();
        printStatementLinesFor(accountStatementList);
    }

    /**
     * Fonction permettant de logger le header contanant la liste (operation, date, amount, balance)
     */
    private void printHeader() {
        printLine(Constant.STATEMENT_HEADER);
    }

    /**
     * Fonction permettant d'inverser les statements et appeller statementLines
     * @param accountStatementList
     */
    private void printStatementLinesFor(List<AccountStatement> accountStatementList) {
        List<String> statementLines = statementLines(accountStatementList);
        Collections.reverse(statementLines);
        statementLines.forEach((e)->printLine(e));
    }

    /**
     * Fonction permettant de formater et generer accountStatementList
     * @param accountStatementList
     * @return
     */
    private List<String> statementLines(List<AccountStatement> accountStatementList) {
        AtomicInteger runningBalance = new AtomicInteger(0);
        return accountStatementList
                .stream()
                .map(transaction -> statementLine(runningBalance, transaction))
                .collect(Collectors.toList());
    }

    /**
     * Fonction permettant d'aficher une une trasaction (Statement)
     * @param runningBalance
     * @param t
     * @return
     */
    private String statementLine(AtomicInteger runningBalance, AccountStatement t) {
        String operation =t.getAmount()>0 ? "Deposit" : "Withdraw";

        return operation + Constant.PIPE +t.getDate() +
                Constant.PIPE +
                formatDecimal(t.getAmount()) +
                Constant.PIPE +
                formatDecimal(runningBalance.addAndGet(t.getAmount()));
    }

    /**
     * Fonction permettant de formater un int au decimal
     * @param amount
     * @return
     */
    private String formatDecimal(int amount) {
        DecimalFormat decimalFormat = new DecimalFormat(Constant.DECIMAL_FORMAT_PATTERN);
        return decimalFormat.format(amount);
    }

    /**
     * Fonction pour afficher(S.O.P)
     * @param line
     */
    public void printLine(String line) {
        System.out.println(line);
    }
}
