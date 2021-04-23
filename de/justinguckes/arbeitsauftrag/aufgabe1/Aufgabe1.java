package justinguckes.arbeitsauftrag.aufgabe1;

import java.security.InvalidAlgorithmParameterException;
import java.util.Scanner;

public class Aufgabe1 {

    public static void main(String[] args) {

        double a, b, c = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("A: ");
        a = scanner.nextDouble();

        System.out.print("B: ");
        b = scanner.nextDouble();

        System.out.print("C: ");
        c = scanner.nextDouble();

        try {

            double[] result = Aufgabe1.PQ(a, b, c);
            System.out.println("X1: " + result[0] + " X2: " + result[1]);
        } catch (InvalidAlgorithmParameterException e) {
            System.out.println("Für diese Werte gibt es keine Lösung!");
        }
        scanner.close();
    }

    /**
     * Löst die gleichung mithilfe der PQ formel
     * 
     * @param a A
     * @param b B
     * @param c C
     * @return einen Array mit 2 stellen wo index [0] x1 represntäeirt und index [1]
     *         x2
     * @throws InvalidAlgorithmParameterException
     */

    public static double[] PQ(double a, double b, double c) throws InvalidAlgorithmParameterException {

        double p = b / a;
        double q = c / a;

        double diskriminante = Math.pow((-p / 2), 2) - q;

        if (diskriminante < 0) {
            throw new InvalidAlgorithmParameterException();
        }

        double x1 = -(p / 2) + Math.sqrt(diskriminante);
        double x2 = -(p / 2) - Math.sqrt(diskriminante);

        return new double[] { x1, x2 };
    }

}
