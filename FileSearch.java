# SAP_Initial_Taskts

import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class FileSearch {

    public static  List<String> paths = new ArrayList<>();

    public static void getFileDirectory( String path, String filename) {

        File root = new File(path);
        File[] list = root.listFiles();

        if (list == null){
            return;
        }

        for (File f : list) {
            if (f.isDirectory()) {
                getFileDirectory(f.getAbsolutePath(),filename);
            } else {
                if(f.getAbsoluteFile().toString().contains(filename)) {
                    paths.add(path);
                }
            }
        }
    }

    public static char pS = File.separatorChar;

    public static void main(String[] args) {
        String filename;
        Scanner scanner = new Scanner(System.in);
        filename = scanner.nextLine();
        String lastDir = String.format("%s%c%s%c%s%c%s%c%s","C:",pS,"Users",pS,"C5281082",pS,"IdeaProjects",pS,"template11.19");
        FileSearch.getFileDirectory(lastDir,filename);
       for (String s : paths){
           System.out.println(s);
       }
    }
}
