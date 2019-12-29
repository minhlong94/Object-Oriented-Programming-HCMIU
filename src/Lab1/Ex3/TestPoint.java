package Lab1.Ex3;

import java.util.Scanner;

public class TestPoint {
    public static void main(String[] args) {
        double x, y;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Point A: ");
        x = scanner.nextDouble();
        y = scanner.nextDouble();
        Point A = new Point(x, y);

        System.out.print("Point B: ");
        x = scanner.nextDouble();
        y = scanner.nextDouble();
        Point B = new Point(x, y);

        double d = A.distance(B);
        System.out.printf("Distance = %.4f\n", d);
    }
}