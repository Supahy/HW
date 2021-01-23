package BankApp.restricted;

public class ReachedCreditLimitException extends RuntimeException {
    public ReachedCreditLimitException(String massage){
        super(massage);
    }
}
