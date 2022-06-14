package com.javastart.banksystem.services;

import com.javastart.banksystem.entity.Account;
import com.javastart.banksystem.entity.Bill;

public class TransferService {
    public void transfer(Account fromAccount, Account toAccount, int amount) {
        Bill accountBillFrom = fromAccount.getBill();
        int sumFrom = accountBillFrom.getAmount();

        Bill accountBillTo = toAccount.getBill();
        int sumTo = accountBillTo.getAmount();

        String personNameFrom = fromAccount.getPerson().getFirstname();
        String personNameTo = toAccount.getPerson().getFirstname();

        if (sumFrom >= amount) {
            accountBillTo.setAmount(sumTo + amount);
            accountBillFrom.setAmount(sumFrom - amount);

            System.out.println("Сумма в размере " + amount + " переведена со счета " + personNameFrom +
                    " на счет " + personNameTo + ".Сумма у клиента " + personNameTo + " на счету " + accountBillTo.getAmount());
        } else {
            System.out.println("Сумма в размере " + amount + " не переведена со счета " + personNameFrom + " на счет " + personNameTo + ". Недостаточно средств на счету. Сумма у клиента " + personNameFrom + " на счету " + accountBillFrom.getAmount());
        }
    }
}
