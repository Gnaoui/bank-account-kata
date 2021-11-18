package service;

import model.AccountStatement;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class StatementPrinter {

    public void print(List<AccountStatement> accountStatementList) {
        printHeader();
        printStatementLinesFor(accountStatementList);
    }

    private void printHeader() {
    }

    private void printStatementLinesFor(List<AccountStatement> accountStatementList) {
    }

    private List<String> statementLines(List<AccountStatement> accountStatementList) {
        return null;
    }

    private String statementLine(AtomicInteger runningBalance, AccountStatement t) {
        return "";
    }

    private String formatDecimal(int amount) {
        return "";
    }

    public void printLine(String line) {
       // System.out.println(line);
    }
}
