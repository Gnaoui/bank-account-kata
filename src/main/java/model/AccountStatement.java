package model;

public class AccountStatement {

    private String date;
    private int amount;

    public AccountStatement(String date, int amount) {
        this.date = date;
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date){
        this.date=date;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "date='" + date +
                ", amount=" + amount + "\'" +"}";
    }

}
