package application;

import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int div, teste, q4;
        double q5;
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Product[] vect = new Product[n];

        for (int i = 0; i < vect.length; i++) {
            sc.nextLine();
            String name = sc.nextLine();
            double price = sc.nextDouble();
            vect[i] = new Product(name,price);
        }

        double sum = 0.0;
        for (int i = 0; i < n; i++) {
            sum = sum + vect[i].getPrice();
        }

        double avg = sum / vect.length;

        System.out.println("Average price = %.2f%n" + avg);

        sc.close();
    }
}