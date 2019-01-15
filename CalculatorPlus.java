# SAP_Initial_Taskts

public class CalculatorPlus {
    public static int add(int a, int b){
        return a+b;
    }

    public static double add(double a, double b){
        return a+b;
    }

    public static String add(String a, String b){
        return (Double.parseDouble(a) + Double.parseDouble(b)) + "";
    }

    public static int multiply(int a, int b){
        return a*b;
    }

    public static double multiply(double a, double b){
        return a*b;
    }

    public static String multiply(String a, String b){
        return (Double.parseDouble(a) * Double.parseDouble(b)) + "";
    }

    public static int subtract(int a, int b){
        return a-b;
    }

    public static double subtract(double a, double b){
        return a-b;
    }

    public static String subtract(String a, String b){
        return (Double.parseDouble(a) - Double.parseDouble(b)) + "";
    }
}
