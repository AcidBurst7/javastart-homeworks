package com.javastart.banksystem.services;

import com.javastart.banksystem.entity.Account;
import com.javastart.banksystem.entity.Bill;

public class DepositService {
    public void deposit(Account account, int amount) {
        Bill accountBill = account.getBill();
        int sumFrom = accountBill.getAmount();
        String personName = account.getPerson().getFirstname();

        if (amount > 0) {
            account.getBill().setAmount(sumFrom + amount);

            System.out.println("Сумма в размере " + amount + " переведена на счет " + personName + ".Сумма у клиента " + personName + " на счету " + accountBill.getAmount());
        } else {
            System.out.println("Укажите положительную сумму для перевода");
        }
    }
}
