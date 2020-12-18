package BankApp.restricted;

import BankApp.TransactionLog;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class DebitAccount extends Account {


    public DebitAccount(String number) {
        super(number);
    }

    @Override
    public void topUp(BigDecimal amount){
        setBalance(getBalance().add(amount));
        TransactionLog log = new TransactionLog(LocalDateTime.now(), "Top up", "Account " + getNumber() + " topped up. Balance before: " + (getBalance().subtract(amount)) + " Updated balance: " + getBalance());
    }

    @Override
    public BigDecimal withdraw(BigDecimal amount) {
        if (getBalance().subtract(amount).compareTo(amount) < 0) {
            TransactionLog log = new TransactionLog(LocalDateTime.now(), "Exception", "NonSufficientFunds exception thrown on " + getNumber());
            logs.put(LocalDateTime.now(), log);
            throw new NonSufficientFundsException("Non sufficient funds! Your current balance is: " + getBalance());
        } else {
            setBalance(getBalance().subtract(amount));
            TransactionLog log = new TransactionLog(LocalDateTime.now(), "Withdraw", "Account " + getNumber() + " withdrawn. Balance before: " + (getBalance().add(amount)) + " Updated balance: " + getBalance());
            logs.put(LocalDateTime.now(), log);
            return getBalance();
        }
    }



}
