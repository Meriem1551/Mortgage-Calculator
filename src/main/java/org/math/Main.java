package org.math;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Principal: ");
        int Principal = scanner.nextInt();
        System.out.print("Annual Interest Rate: ");
        float annualInterestRate = scanner.nextFloat();
        float monthlyInterestRate = annualInterestRate / PERCENT /MONTHS_IN_YEAR;
        System.out.print("Period (Years) ");
        byte period = scanner.nextByte();
        long num_of_payment = period * MONTHS_IN_YEAR;
        double result = Principal
                * (monthlyInterestRate * Math.pow((1 + monthlyInterestRate), num_of_payment)
                /(Math.pow((1 + monthlyInterestRate), num_of_payment) - 1));
        String Montgage = NumberFormat.getCurrencyInstance().format(result);
        System.out.print("Montgage: " + Montgage);
    }
}