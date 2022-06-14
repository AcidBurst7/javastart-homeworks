package com.javastart.banksystem.services;

import com.javastart.banksystem.entity.Account;
import com.javastart.banksystem.entity.Bill;

public class PaymentService {
    public void pay(Account account, int amount) {
        Bill accountBill = account.getBill();
        int sumFrom = accountBill.getAmount();
        String personName = account.getPerson().getFirstname();

        if (sumFrom >= amount) {
            accountBill.setAmount(sumFrom - amount);

            System.out.println("Сумма в размере " + amount + " переведена со счета " + personName + ". Сумма у клиента " + personName + " на счету " + accountBill.getAmount());
        } else {
            System.out.println("Сумма в размере " + amount + " не переведена со счета " + personName + ". Недостаточно средств на счету");
        }
    }
}
