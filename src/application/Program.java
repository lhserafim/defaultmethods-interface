package application;

import services.BrazilInterestService;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Amount: ");
        double amount = sc.nextDouble();
        System.out.println("Months: ");
        int months = sc.nextInt();

        BrazilInterestService is = new BrazilInterestService(2.0);
        double payment = is.payment(amount,months);

        System.out.println("Payment after: " + months + " months:");
        System.out.println(String.format("%.2f",payment));

        sc.close();

    }
}
