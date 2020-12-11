package BankApp.restricted;

public class AccountNotFoundException extends RuntimeException {
    public AccountNotFoundException(String massage){
        super(massage);
    }
}
