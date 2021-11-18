package service;


import model.AccountStatement;

import java.util.ArrayList;
import java.util.List;

public class Transactions {
    private List<AccountStatement> accountStatementList = new ArrayList<>();

    /**
     * Fonction permettant d'ajouter accountStatement au List des statements
     *
     * @param accountStatement
     */
    public void add(AccountStatement accountStatement) {
        accountStatementList.add(accountStatement);
    }

    public List<AccountStatement> all() {
        return null;
    }

}
