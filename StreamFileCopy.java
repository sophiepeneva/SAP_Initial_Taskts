# SAP_Initial_Taskts

import java.io.*;
import java.util.Scanner;

public class StreamFileCopy {
    public static void copyFileUsingStream(File source, File dest) throws IOException {
        InputStream is = null;
        OutputStream os = null;
        try {
            is = new FileInputStream(source);
            os = new FileOutputStream(dest);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = is.read(buffer)) > 0) {
                os.write(buffer, 0, length);
            }
        } finally {
            try {
                is.close();
                os.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the file you would like to copy : ");
        String source = scanner.nextLine();
        System.out.println("Enter the file destination : ");
        String destination = scanner.nextLine();
        try {
            copyFileUsingStream(new File(source), new File(destination));
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
