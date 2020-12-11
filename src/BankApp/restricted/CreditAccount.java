package BankApp.restricted;

import BankApp.TransactionLog;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class CreditAccount extends Account{

    private BigDecimal creditLimit;

    public CreditAccount(String number) {
        super(number);
        this.creditLimit = BigDecimal.valueOf(-5000);
    }

    @Override
    public void topUp(BigDecimal amount){
        setBalance(getBalance().add(amount));
        TransactionLog
                log = new TransactionLog(LocalDateTime.now(), "Top up", "Account " + getNumber() + " topped up. Balance before: " + (getBalance().subtract(amount)) + " Updated balance: " + getBalance());
        TransactionLog.logs.put(LocalDateTime.now(), log);
    }

    @Override
    public BigDecimal withdraw(BigDecimal amount){
        if((getBalance().subtract(amount)).compareTo(creditLimit) < 0){
            TransactionLog log = new TransactionLog(LocalDateTime.now(), "Exception", "ReachedCreditLimit exception thrown on " + getNumber());
            TransactionLog.logs.put(LocalDateTime.now(), log);
            throw new ReachedCreditLimitException("Reached credit limit!  Your current balance is: " + getBalance() + ". Your credit limit: " + getCreditLimit());
        } else {
            setBalance(getBalance().subtract(amount));
            TransactionLog log = new TransactionLog(LocalDateTime.now(), "Withdraw", "Account " + getNumber() + " withdrawn. Balance before: " + (getBalance().add(amount)) + " Updated balance: " + getBalance());
            TransactionLog.logs.put(LocalDateTime.now(), log);
            return getBalance();
        }
    }

    public BigDecimal getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(BigDecimal creditLimit) {
        this.creditLimit = creditLimit;
        TransactionLog log = new TransactionLog(LocalDateTime.now(), "Credit Limit set", "Credit limit has been set on " + getNumber() + ". Current balance: " + getBalance());
        TransactionLog.logs.put(LocalDateTime.now(), log);
    }
}
