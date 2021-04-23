package justinguckes.arbeitsauftrag.aufgabe2;

import java.util.Scanner;

public class Aufgabe2 {

    public static void main(String[] args) {
        int num1, num2;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Zahl 1: ");
        num1 = scanner.nextInt();
        System.out.print("Zahl 2: ");
        num2 = scanner.nextInt();

        scanner.close();
        if (num1 == 0 || num2 == 0) {
            System.out.println("Durch 0 ist nicht teilbar");
            return;
        }
        System.out.println("Ergebnis: " + Aufgabe2.calculateGGT(num1, num2));
    }

    /**
     * Gibt den größten gemeinsamen teiler zurück
     * 
     * @param num1 Zahl 1
     * @param num2 Zahl 2
     */
    public static int calculateGGT(int num1, int num2) {
        int z1 = Math.max(num1, num2), z2 = Math.min(num1, num2), rest;

        do {
            rest = z1 % z2;

            z1 = z2;
            z2 = rest;
        } while (rest > 0);

        return z1;
    }

}
