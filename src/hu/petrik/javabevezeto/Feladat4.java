package hu.petrik.javabevezeto;

import java.util.Scanner;

public class Feladat4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Kérem adja meg a háromszög 'a' oldalát");
        double a = sc.nextDouble();
        sc.nextLine();
        System.out.println("Kérem adja meg a háromszög 'b' oldalát");
        double b = sc.nextDouble();
        sc.nextLine();
        System.out.println("Kérem adja meg a háromszög 'c' oldalát");
        double c = sc.nextDouble();
        sc.nextLine();

        if (a + b › c) {
            double kerulet = a+b+c;
            System.out.printf("A háromszög kerülete: %f",kerulet);
        }else {
            System.out.println("Hibás adatokat adott meg" );
        }

    }
}
