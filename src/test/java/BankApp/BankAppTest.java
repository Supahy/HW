package BankApp;

import BankApp.restricted.Account;
import BankApp.restricted.Bank;
import BankApp.restricted.CreditAccount;
import BankApp.restricted.DebitAccount;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.assertj.core.api.Assertions.*;

public class BankAppTest {
    @BeforeEach
    public void setUp(){
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

    @Test
    void nationalBank_getBankByName_returnsBank(){
        Bank bank = NationalBank.getByName("Pekao");
        assertThat(bank).isEqualTo(NationalBank.getByName("Pekao"));
    }

    @Test
    void sendMoney_moneyAppearsOnRecieverAcc_distractsOnSenderAcc(){

        Account fromAcc = NationalBank.getByName("Pekao").getAccByNumber("34 1111 1111 2222");
        NationalBank.getByName("Pekao").topUp("34 1111 1111 2222", BigDecimal.valueOf(1000));
        BigDecimal fromAccBalance = fromAcc.getBalance();
        Account toAcc = NationalBank.getByName("Pekao").getAccByNumber("34 1111 6666 7777");
        BigDecimal toAccBalance = toAcc.getBalance();
        NationalBank.getByName("Pekao").sendMoney("34 1111 1111 2222", "34 1111 6666 7777", BigDecimal.valueOf(400));
        assertThat(fromAcc.getBalance()).isEqualTo(fromAccBalance.subtract(BigDecimal.valueOf(400)));
        assertThat(toAcc.getBalance()).isEqualTo(toAccBalance.add(BigDecimal.valueOf(400)));
    }

    @Test
    void bankSettingPercents_applyingPercents_percentsHasBeenApplied(){
        Account account = NationalBank.getByName("Pekao").getAccByNumber("34 1111 1111 2222");
        NationalBank.getByName("Pekao").topUp("34 1111 1111 2222", BigDecimal.valueOf(1000));
        NationalBank.getByName("Pekao").setPercentsOnAcc("34 1111 1111 2222", BigDecimal.valueOf(4));
        NationalBank.getByName("Pekao").applyPercentsOnAcc("34 1111 1111 2222");

        assertThat(account.getBalance()).isEqualTo(BigDecimal.valueOf(1040));

    }
}
