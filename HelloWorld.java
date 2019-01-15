# SAP_Initial_Taskts

public class HelloWorld {

    public static String greet(){
        return "Hello world";
    }

    public static int[] generateArrToHundredWithFor(){
        int[] arr = new int[100];

        for (int i = 0; i < 100; i++) {
            arr[i]=i;
        }
        return arr;
    }

    public static void main(String[] args) {

        System.out.println(greet());

        int[] arr = generateArrToHundredWithFor();

        int i = 0;
        while (i < 100) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        i = 0;
        do {
            System.out.print(i + " ");
            i++;
        } while (i < 100);
    }
}
