package BankApp;

public class BankNotFoundException extends RuntimeException{
    public BankNotFoundException(String massage){
        super(massage);
    }
}
