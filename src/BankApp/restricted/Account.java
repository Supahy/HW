package BankApp.restricted;

import BankApp.TransactionLog;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public abstract class Account {
    private String number;
    private BigDecimal balance;
    private BigDecimal percents = BigDecimal.valueOf(1);

    public Account(String number){
        this.number = number;
        this.balance = BigDecimal.valueOf(0);
    }

    void topUp(BigDecimal amount) {
        balance = balance.add(amount);
    }

    BigDecimal withdraw(BigDecimal amount) {
        balance = balance.subtract(amount);
        return balance;
    }

    String getNumber() {
        return number;
    }

    void applyPercents(){
        BigDecimal temp = balance;
        temp = temp.divide(BigDecimal.valueOf(100));
        temp = temp.multiply(percents);
        balance = balance.add(temp);
        System.out.println("Percents has been applied on " + getNumber() + ". Current balance: " + getBalance());

        TransactionLog log = new TransactionLog(LocalDateTime.now(), "Percents applying", "Percents has been applied on " + getNumber() + ". Current balance: " + getBalance());
        TransactionLog.logs.put(LocalDateTime.now(), log);
    }

    public BigDecimal getPercents() {
        return percents;
    }

     void setPercents(BigDecimal percents) {
        this.percents = percents;
         TransactionLog log = new TransactionLog(LocalDateTime.now(), "Percentage set", "Percents has been set on " + getNumber() + ". Current balance: " + getBalance());
         TransactionLog.logs.put(LocalDateTime.now(), log);
    }

    public BigDecimal getBalance() {
        return balance;
    }

    void setBalance(BigDecimal balance) {
        this.balance = balance;
    }


}
