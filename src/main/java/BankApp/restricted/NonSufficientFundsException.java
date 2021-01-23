package BankApp.restricted;

import java.io.IOException;

public class NonSufficientFundsException extends RuntimeException{
    public NonSufficientFundsException(String massage){
        super(massage);
    }
}
