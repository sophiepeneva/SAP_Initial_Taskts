# SAP_Initial_Taskts

import java.util.Scanner;

public class Calculator {

    public static int doCalculation(int a, int b, String action) {
        if (action.contains("add")) {
            return a + b;
        }
        if (action.contains("multiply")) {
            return a * b;
        }
        return a - b;
    }

    public static boolean validateCommand(String command){
        return (command.equals("add")||command.equals("multiply")||command.equals("subtract"));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int a = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter the second number : ");
        int b = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter the operation (add, subtract, multiply) : ");
        String command = scanner.nextLine();
        if(validateCommand(command)){
            System.out.println(doCalculation(a,b,command));
        }
    }
}
