package justinguckes.arbeitsauftrag.aufgabe3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Aufgabe3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Maximum: ");
        System.out.println("Ergebnis: " + Aufgabe3.eratosthenes(scanner.nextInt()));
        scanner.close();
    }

    /**
     * Gibt alle Primzahlen bis zum Maximum zurück mithilfe des Siebes von
     * Eratosthenes
     * 
     * @param max Maximum
     */
    public static List<Integer> eratosthenes(int max) {
        List<Integer> values = new ArrayList<>();

        // Array mit allen werten bis zum max füllen
        for (int i = 2; i < max; i++)
            values.add(i);

        for (int i = 0; i < max; i++) {
            // Wenn die Zahl nicht mehr im Array steht kann man sie skippen
            if (!values.contains(i))
                continue;

            int currentNumber = i;

            // Alle vielfache entfernen
            while (currentNumber < max) {
                currentNumber += i;
                values.remove(Integer.valueOf(currentNumber));
            }
        }

        return values;

    }
}
