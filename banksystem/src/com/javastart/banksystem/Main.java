package com.javastart.banksystem;

import com.javastart.banksystem.entity.Account;
import com.javastart.banksystem.entity.Bill;
import com.javastart.banksystem.entity.Person;
import com.javastart.banksystem.services.DepositService;
import com.javastart.banksystem.services.PaymentService;
import com.javastart.banksystem.services.TransferService;

/**
 *
 * В данном домашнем задании нужно написать небольшую банковскую систему.
 * Минимальная банковская система будет состоять из классов (сущностей): Bill (счет) Account (аккаунт)
 * Person (личность человека) Deposit (пополнение счета) Payment (платеж).
 *
 * Связи между сущностями будут такие: Account имеет поле типа Person, так же Account имеет поле типа Bill
 * Adjustment и Payment имеют по одному полю Bill
 *
 * Класс Person будет иметь следующие поля: имя, фамилия, номер телефона.
 * Класс Account будет иметь поля: Bill и Person.
 * Класс Bill будет содеражать поле с числовым значением внутри: например Integer amount
 * Класс Payment будет содержать поле Bill
 * Класс Deposit будет содержать поле Bill
 *
 * Сценарии:
 * Созадние нескольких аккаунтов и счетов
 * В классах-сервисах (Напримет класс PaymentService) совершенить платежа (уменьшение счета)
 * И депозит (DepositService) (увеличение счета)
 *
 * Перевод денег с одного аккаунта на другой
 * Создать дополнительный класс TransferService, создать в нем метод transfer и реализовать логику перевода денег с одного аккаунта на другой
 *
 * В методе main не должно происходить никакой логики, кроме вызовов сервисов.
 * Сервисы будут выполнять все действия, в методе main можно только создавать изначальные объекты и вызывать сервисы
 *
 * Так же стоит предусмотреть критические случаи, например не оставлять отрицательную сумму на счету
 */

public class Main {
    public static void main(String[] args) {
        Person sara = new Person("Sara", "Connor", "89001231212");
        Person john = new Person("John", "Connor", "89001231213");
        Person winston = new Person("Winston", "Crayn", "89001231210");

        Bill saraBill = new Bill(100000);
        Bill johnBill = new Bill(100);
        Bill winstonBill = new Bill(300000);

        Account saraAccount = new Account(sara, saraBill);
        Account johnAccount = new Account(john, johnBill);
        Account winstonAccount = new Account(winston, winstonBill);

        PaymentService paymentService = new PaymentService();
        paymentService.pay(saraAccount, 1000);
        paymentService.pay(johnAccount, 1000);
        paymentService.pay(winstonAccount, 1000000000);

        DepositService depositService = new DepositService();
        depositService.deposit(johnAccount, 1000);

        TransferService transferService = new TransferService();
        transferService.transfer(johnAccount, winstonAccount, 1200);
        transferService.transfer(saraAccount, johnAccount, 150);
    }
}
