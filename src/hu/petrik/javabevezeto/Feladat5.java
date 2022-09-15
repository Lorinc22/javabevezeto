package hu.petrik.javabevezeto;

import java.util.Scanner;

public class Feladat5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner  sc = new Scanner(System.in);
        System.out.println("Kérem adja meg a téglalap 'a' oldalát (cm):");
        double a = sc.nextDouble();
        sc.nextLine();
        System.out.println("Kérem adja meg a téglalap 'b' oldalát (cm):");
        double b = Double.parseDouble(sc.nextLine().replace());
        System.out.println("Kérem adja meg az elvégezendő műveletet (K-kerület, T - terület):");
        String muvelet = sc.nextLine();
        if (muvelet.equals("K")){
            double kerulet = 2 * (a+b);
            System.out.printf("A téglalap kerülete %f (cm)" , kerulet);
        }
        else if (muvelet.equals("T")) {
            double terulet = a*b ;
            System.out.printf("A téglalap kerülete %f" , terulet);
        }
        else {
            System.out.println("Rossz műveletet adott");
        }
        if (a == b ){
            System.out.println("Ez egy négyzet");
        }
    }
}
