# SAP_Initial_Taskts

import java.util.Random;

public class MathPractice {
    public static int getAbs(int n) {
        return Math.abs(n);
    }

    public static double round(double n) {
        return Math.round(n);
    }

    public static double nextInt(double n) {
        return Math.ceil(n);
    }

    public static int smallest(int a, int b) {
        return Math.min(a, b);
    }

    public static int largest(int a, int b) {
        return Math.max(a, b);
    }

    public static double areaCircle(double radius) {
        return Math.pow(radius, 2) * Math.PI;
    }

    public static double squareRoot(int x) {
        return Math.sqrt(x);
    }

    public static int rand() {
        Random random = new Random();
        return random.nextInt(101);
    }

    public static void main(String[] args) {
        System.out.println(getAbs(-9));
        System.out.println(round(5.6));
        System.out.println(nextInt(3.4));
        System.out.println(smallest(1, 5));
        System.out.println(largest(1, 5));
        System.out.println(areaCircle(2));
        System.out.println(squareRoot(4));
        System.out.println(rand());
    }
}
