# SAP_Initial_Taskts

public class Simulations {
    public static int endlessRecursion(int n){
        return endlessRecursion(n-1);
    }

    public static void main(String[] args) {
        //int a = endlessRecursion(8);

        long[][] ary = new long[Integer.MAX_VALUE][Integer.MAX_VALUE];

        String[] arr = new String[10000000];
        for (int i = 0; i < 10000000; i++) {
            arr[i]=i +"";
        }
    }
}
