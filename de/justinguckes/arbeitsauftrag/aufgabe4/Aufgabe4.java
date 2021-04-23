package justinguckes.arbeitsauftrag.aufgabe4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Aufgabe4 {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Maximum: ");
        int max = scanner.nextInt();
        for (int i = 0; i <= max; i++)
            list.add(i);

        System.out.println("Ergebnis: " + quicksort(list));
        scanner.close();
    }

    public static List<Integer> quicksort(List<Integer> values) {

        List<Integer> result = new ArrayList<>();

        if (values.size() == 0)
            return values;
        int pivot = values.get(0);

        List<Integer> greater = new ArrayList<>(), smaller = new ArrayList<>();
        values.forEach(element -> {
            if (element == pivot)
                return;
            if (element > pivot)
                greater.add(element);
            else
                smaller.add(element);
        });

        List<Integer> greaterSorted = quicksort(greater), smallerSorted = quicksort(smaller);

        result.addAll(greaterSorted);
        if (isPrime(pivot))
            result.add(pivot);
        result.addAll(smallerSorted);

        return result;

    }

    public static boolean isPrime(int num) {
        boolean isPrime = true;

        if (num <= 1)
            return false;

        for (int i = 2; i <= num / 2; i++) {
            if ((num % i) == 0) {
                isPrime = false;
                break;
            }
        }

        return isPrime;

    }
}
