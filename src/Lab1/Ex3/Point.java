package Lab1.Ex3;

import java.lang.Math;

public class Point {
    private double x;
    private double y;
    private double d;

    public Point(double X, double Y) {
        x = X;
        y = Y;
    }

    public double distance(Point B) {
        double xB = B.x;
        double yB = B.y;
        d = Math.sqrt(Math.pow((x - xB), 2) + Math.pow((y - yB), 2));
        return d;
    }
}