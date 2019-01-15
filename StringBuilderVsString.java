# SAP_Initial_Taskts

import java.util.Scanner;

public class StringBuilderVsString {

    public static StringBuilder zeroToN(int n) {
        StringBuilder stringBuilder = new StringBuilder(String.format("%s%d%s", "The numbers from 0-", n, " are "));

        for (int i = 0; i <= n; i++) {
            stringBuilder.append(i);
            if (i != n){
                stringBuilder.append(", ");
            }
        }
        return stringBuilder;
    }

    public static String zeroToNConcat(int n){
        String s = String.format("%s%d%s", "The numbers from 0-", n, " are ");
        for (int i = 0; i <= n; i++) {
            s+=i;
            if (i != n) {
                s += ", ";
            }
        }
        return s;
    }

    public static void main(String[] args) {
        int n;
        System.out.println("Enter a number : ");
        Scanner scanner = new Scanner(System.in);
        n = Integer.parseInt(scanner.nextLine());
        System.out.println(zeroToNConcat(n));
    }
}
