# SAP_Initial_Taskts

import java.io.*;
import java.util.Scanner;

public class ReaderWriter {
    public static String readFile(String filename){
        return FileRead.readFile(filename);
    }

    public static void writeToFile(String filename, String text){
        try(Writer writer = new FileWriter(filename)) {
            writer.write(text);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String modifyText(String text) {
        return text.toUpperCase();
    }

    public static void main(String[] args) {
        System.out.println("Enter the name of the file you would like to copy and modify : ");
        Scanner scanner = new Scanner(System.in);
        String source = scanner.nextLine();
        System.out.println("Enter the name of the new file  : ");
        String destination = scanner.nextLine();
        String text = readFile(source);
        String modifiedText = modifyText(text);
        writeToFile(destination,modifiedText);
    }
}
