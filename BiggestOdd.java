# SAP_Initial_Taskts

import java.util.Random;

public class BiggestOdd {

    public static int firstOdd(int[] arr) {
        if (arr.length < 1){
            return -1;
        }
        int counter = 0;
        while (counter < arr.length && arr[counter] % 2 == 0) {
            counter++;
        }
        if (counter >= arr.length) {
            return -1;
        }
        if (arr[counter] % 2 == 0) {
            return -1;
        }
        return counter;
    }

    public static int biggestOdd(int[] arr) {
        int counter = firstOdd(arr);
        if (counter == -1) {
            return -1;
        }
        int max = counter;
        for (int i = counter; i < arr.length; i++) {
            if (arr[i] % 2 != 0 && arr[i] > arr[max]) {
                max = i;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = new int[10];
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            arr[i] = random.nextInt(40);
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        if (biggestOdd(arr) != -1){
            System.out.println(arr[biggestOdd(arr)]);
        }
        else {
            System.out.println("No odd numbers");
        }
    }
}
