# SAP_Initial_Taskts

import java.util.Scanner;

public class Dictionary {
    private static final String FILENAME = "dictionary.txt";

    public static String readFromFile() {
        return FileRead.readFile(FILENAME);
    }

    public static String transalte(String dictionary, String word) {
        String[] wordByWord = StringOperations.getStringArray(dictionary, "\n");
        for (int i = 0; i < wordByWord.length; i++) {
            String[] row = StringOperations.getStringArray(wordByWord[i], " ");
            if (row[0].equals(word)) {
                return row[1];
            }
        }
        return "The word is not in the dictionary.";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word you'd like to have translated : ");
        String word = scanner.nextLine();
        String dictionaryContent = readFromFile();
        System.out.println(transalte(dictionaryContent,word));
    }
}
