# SAP_Initial_Taskts

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class UniqueWords {

    public static Set<String> getUnique(String text){
        Set<String> uniqueWords = new HashSet<>();
        String currentWord = "";
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ' || text.charAt(i) == ',' || text.charAt(i) == '.') {
                uniqueWords.add(currentWord);
                currentWord = "";
            } else {
                currentWord += text.charAt(i);
                if (i == text.length() - 1) {
                    uniqueWords.add(currentWord);
                }
            }
        }
        return uniqueWords;
    }

    public static void main(String[] args) {
        String fileText = FileRead.readFile("uniqueWords.txt");
        Set<String> uniqueWords = getUnique(fileText);
        Iterator iter = uniqueWords.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }
}
