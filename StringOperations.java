# SAP_Initial_Taskts

public class StringOperations {

    private static int getCount(String s, char c){
        int counter = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)==c){
                counter++;
            }
        }
        return counter;
    }

    public static int countCapitalAs(String s){
        return getCount(s,'A');
    }

    public static String replaceAWithAA(String s){
        return (s.replaceAll("A","AA"));
    }

    public static int countWords(String s){

        return getCount(s,' ') + 1;
    }

    public static String reverse(String s){
        String reversed = "";
        for (int i = s.length()-1; i >-1 ; i--) {
            reversed+=s.charAt(i);
        }
        return reversed;
    }

    public static String[] getStringArray(String s, String splitter){
        return s.split(splitter,countWords(s));
    }

    public static void main(String[] args) {

        String s = "A dog has A tAil";
        System.out.println(countCapitalAs(s));
        System.out.println(replaceAWithAA(s));
        System.out.println(reverse(s));
        System.out.println(getStringArray(s," ")[1]);
    }
}
