package service;


import model.AccountStatement;

import java.util.ArrayList;
import java.util.Collections;
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

    /**
     * Fonction permettant de returner la lists des AccountStatement
     * @return
     */
    public List<AccountStatement> all() {
        return Collections.unmodifiableList(accountStatementList);
    }

}
