package com.KonstKudryavtsev;

public class SquareEquationCalculator {
    public static double[] calculate(double a, double b, double c) {
        double d = b*b - 4*a*c;

        if (d < 0) {
            System.out.println("There are no solutions in real numbers for this one!");
            return null;
        }

        double solution;

        if (d == 0) {
            solution = (-b + (int)Math.sqrt(d)) / 2*a;
            return new double[]{solution};
        }

        double []resultArr = new double[2];

        if (d > 0) {
            double sqRootD = Math.sqrt(d);
            solution = (-b + sqRootD) / (2*a);
            double anotherSolution = (-b - sqRootD) / (2*a);
            resultArr[0] = solution;
            resultArr[1] = anotherSolution;
        }

        return resultArr;
    }
}