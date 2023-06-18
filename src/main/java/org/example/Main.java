package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Bank bank = new Bank();
        System.out.println("Dzien dobry! Wybierz operacje: 1-wplata, 2 -wyplata , 3 - stankonta");
        Scanner scanner = new Scanner(System.in);
        double sc = scanner.nextDouble();

        if (sc == 1) {
            System.out.println("Ile chesz wplacic?");
            bank.wplata(scanner.nextDouble());
            bank.setBillance(bank.getBillance());
            System.out.println("Stan konta wynosi: " + bank.getBillance() + "PLN");

        } else if (sc == 2) {
            System.out.println("Ile chcesz wyplacic?");

        } else if (sc == 3) {
            System.out.println("Stan konta wynosi: " + bank.getBillance() + "PLN");

        } else {
            System.out.println("Wybierz operacje: 1-wplata, 2 -wyplata , 3 - stankonta");
            //double sc1 = scanner.nextDouble();
        }
        //System.out.println("Stan konta wynosi: " + bank.billance + "PLN");

        //System.out.println("Wprowadz sume, PLN: ");

//        if (sc > bank.billance) {
//            System.out.println("Nie masz tyle n koncie: ");
//
//        } else {
//            System.out.println("Po wyplacie na koncie zostanie: " + bank.wyplata(sc));
//
//        }


    }
}