package BankApp;

import BankApp.restricted.*;

import java.math.BigDecimal;

public class BankingApplication {

    static {
        initBanking();
    }

    public static void main(String[] args) {
        NationalBank.getByName("Pekao").topUp("34 1111 1111 2222", BigDecimal.valueOf(1000));
        NationalBank.getByName("Pekao").sendMoney("34 1111 1111 2222", "34 1111 6666 7777", BigDecimal.valueOf(400));
        NationalBank.getByName("Pekao").setPercentsOnAcc("34 1111 1111 2222", BigDecimal.valueOf(4));
        NationalBank.getByName("Pekao").recalculatePercents();

       NationalBank.getByName("Pekao").setPercentsOnAcc("34 1111 6666 7777", BigDecimal.valueOf(4));
       NationalBank.getByName("Pekao").applyPercentsOnAcc("34 1111 6666 7777");

        System.out.println("================");

        NationalBank.getByName("Millenium").setCreditLimitOnCreditAcc("34 1111 7777 8888", BigDecimal.valueOf(-2000));
        NationalBank.getByName("Millenium").topUp("34 1111 7777 8888", BigDecimal.valueOf(1000));
        System.out.println(NationalBank.getByName("Millenium").getAccByNumber("34 1111 7777 8888").getBalance());
        NationalBank.getByName("Millenium").setPercentsOnAcc("34 1111 7777 8888", BigDecimal.valueOf(10));
        System.out.println(NationalBank.getByName("Millenium").getAccByNumber("34 1111 7777 8888").getBalance());
        NationalBank.getByName("Millenium").withDraw("34 1111 7777 8888", BigDecimal.valueOf(2000));
        System.out.println(NationalBank.getByName("Millenium").getAccByNumber("34 1111 7777 8888").getBalance());
        NationalBank.getByName("Millenium").applyPercentsOnAcc("34 1111 7777 8888");


        System.out.println("================");

        NationalBank.getByName("Pekao").setCreditLimitOnCreditAcc("34 1111 5555 6666", BigDecimal.valueOf(2000));
        NationalBank.getByName("Pekao").topUp("34 1111 5555 6666", BigDecimal.valueOf(500));
        try {
            NationalBank.getByName("Pekao").sendMoney("34 1111 5555 6666", "34 1111 6666 7777", BigDecimal.valueOf(3000));
        } catch (ReachedCreditLimitException e) {
            System.out.println(e.getMessage());
        }

        try{
            NationalBank.getByName("PKO");
        } catch (BankNotFoundException e){
            System.out.println(e.getMessage());
        }

        try{
            NationalBank.getByName("Pekao").getAccByNumber("34 2222 0000 0000");
        } catch (AccountNotFoundException e){
            System.out.println(e.getMessage());
        }

        try{
            NationalBank.getByName("Pekao").sendMoney("34 1111 1111 2222", "34 1111 5555 6666", BigDecimal.valueOf(5000));
        } catch (NonSufficientFundsException e){
            System.out.println(e.getMessage());
        }

        System.out.println("================");

        System.out.println(TransactionLog.logs);





    }

    private static void initBanking() {
        // create accounts
        CreditAccount credAcc1 = new CreditAccount("5555 6666");
        CreditAccount credAcc2 = new CreditAccount("6666 7777");
        CreditAccount credAcc3 = new CreditAccount("7777 8888");
        DebitAccount debAcc1 = new DebitAccount("1111 2222");
        DebitAccount debAcc2 = new DebitAccount("2222 3333");
        DebitAccount debAcc3 = new DebitAccount("3333 4444");


        // create banks with accounts
        Bank pekao = new Bank("Pekao");
        Bank millenium = new Bank("Millenium");
        pekao.registerAccount("5555 6666", credAcc1);
        pekao.registerAccount("6666 7777", credAcc2);
        pekao.registerAccount("1111 2222", debAcc1);
        millenium.registerAccount("7777 8888", credAcc3);
        millenium.registerAccount("2222 3333", debAcc2);
        millenium.registerAccount("3333 4444", debAcc3);

        // register banks in NationalBank

        NationalBank.registerBank("Pekao", pekao);
        NationalBank.registerBank("Millenium", millenium);


    }
}
