package com.TKA24_SEPT_98;

public class PaymentMain {
    public static void main(String[] args) {

        Payment p1 = new CreditCardPayment(101, 5000);
        System.out.println("Credit Card Payment : ");
        p1.makePayment();
        p1.generateReceipt();

        Payment p2 = new UPIPayment(102, 3000);
        System.out.println("\nUPI Payment : ");
        p2.makePayment();
        p2.generateReceipt();

        Payment p3 = new NetBankingPayment(103, 7000);
        System.out.println("\nNet Banking Payment : ");
        p3.makePayment();
        p3.generateReceipt();

        Payment p4 = new WalletPayment(104, 2000);
        System.out.println("\nWallet Payment : ");
        p4.makePayment();
        p4.generateReceipt();
    }
}