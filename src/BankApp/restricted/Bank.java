package BankApp.restricted;

import BankApp.TransactionLog;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Map;
import java.util.TreeMap;

public class Bank {
    private String name;
    private Account account;

    public Bank(String name){
        this.name = name;
    }


    private Map<String, Account> accounts = new TreeMap<>();


    public String getName() {
        return name;
    }

    public void registerAccount(String accNumber, Account regAcc) {
            accNumber = "34 1111 " + accNumber;
            accounts.put(accNumber, regAcc);

    }

    public void recalculatePercents() {
        for (String s : accounts.keySet()) {
            getAccByNumber(s).applyPercents();
        }
        TransactionLog
                log = new TransactionLog(LocalDateTime.now(), "Recalculating percents", "Percents has been recalculated for " + name);
        TransactionLog.logs.put(LocalDateTime.now(), log);

    }

    public void topUp(String accountNumber, BigDecimal amount) {
        getAccByNumber(accountNumber).topUp(amount);
    }


    public BigDecimal withDraw(String accountNumber, BigDecimal amount) {
       getAccByNumber(accountNumber).withdraw(amount);
       return getAccByNumber(accountNumber).getBalance();
    }

    public void sendMoney(String fromAccountNum, String toAccountNum, BigDecimal amount) {
           getAccByNumber(fromAccountNum).withdraw(amount);
            getAccByNumber(toAccountNum).topUp(amount);
            System.out.println("You have sent money from " + fromAccountNum + " to " + toAccountNum);
            System.out.println("Money remain on your account: " + getAccByNumber(fromAccountNum).getBalance());
            System.out.println("Updated reciever account balance: " + getAccByNumber(toAccountNum).getBalance());

        TransactionLog log = new TransactionLog(LocalDateTime.now(), "Money transfer", "Money has been sent from " + fromAccountNum + " to " + toAccountNum + ". Transaction amount: " + amount);
        TransactionLog.logs.put(LocalDateTime.now(), log);
       }

    public void applyPercentsOnAcc(String accountNum){
        getAccByNumber(accountNum).applyPercents();
        System.out.println(accountNum + " balance with percents: " + getAccByNumber(accountNum).getBalance());
    }

    public void setPercentsOnAcc(String accountNum, BigDecimal percents){
        getAccByNumber(accountNum).setPercents(percents);
        System.out.println("Percents " + percents + " set on " + accountNum);
    }

    public void setCreditLimitOnCreditAcc(String accountNum, BigDecimal limit){
        if(getAccByNumber(accountNum) instanceof CreditAccount){
            ((CreditAccount) getAccByNumber(accountNum)).setCreditLimit(limit);
        } else {
            System.out.println("Account " + accountNum + " is not a Credit Account!");
        }
    }

    public Account getAccByNumber(String accountNum){
        if(accounts.get(accountNum) == null){
            TransactionLog log = new TransactionLog(LocalDateTime.now(), "Exception", "Incorrect accounts exception has been thrown on " + name);
            TransactionLog.logs.put(LocalDateTime.now(), log);
            throw new AccountNotFoundException("Incorrect account!");
        } else {
            return accounts.get(accountNum);
        }
    }


}
