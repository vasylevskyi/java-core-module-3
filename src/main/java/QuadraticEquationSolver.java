package main.java;


import java.util.Arrays;

public class QuadraticEquationSolver {

    public double[] solve(int a, int b, int c) {
        double diskriminant = (double) b * b - 4 * a * c;
        double root1;
        double root2;
        if (diskriminant < 0) {
            double[] result = new double[0];
            return result;
        } else if (diskriminant == 0) {
            double[] result = new double[1];
            result[0] = (-b + Math.sqrt(diskriminant)) / (2 * a);
            return result;
        } else {
            double[] result = new double[2];
            result[0] = (-b + Math.sqrt(diskriminant)) / (2 * a);
            result[1] = (-b - Math.sqrt(diskriminant)) / (2 * a);
            return result;
        }
    }

    public static void main(String[] args) {
        QuadraticEquationSolver roots = new QuadraticEquationSolver();
        System.out.println(Arrays.toString(roots.solve(1, -2, -3)));
        System.out.println(Arrays.toString(roots.solve(1, 12, 36)));
        System.out.println(Arrays.toString(roots.solve(5, 3, 7)).replace("0.0", ""));
    }
}
