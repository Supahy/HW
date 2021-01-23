package BankApp;


import BankApp.restricted.Bank;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class NationalBank {
    static private Bank bank;

    static Map<String, Bank> banks = new HashMap<>();


    static void registerBank(String bankName, Bank bank) {
        banks.put(bankName, bank);
    }

    static Bank getByName(String bankName) {
        if (banks.get(bankName) == null) {
            throw new BankNotFoundException("Incorrect bank exception");
        } else {
            return banks.get(bankName);
        }
    }
}