# SAP_Initial_Taskts

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ThreadFileCopy implements Runnable {

    private int sleep;

    ThreadFileCopy(int sleep){
        if(sleep>=0){
            this.sleep = sleep;
        }
    }

    public void writeToFile(String content){
        try(BufferedWriter writer = new BufferedWriter(new FileWriter("copiedFile.txt"))) {
            writer.write(content);
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        String fileContent = FileRead.readFile("threadTest.txt");
        writeToFile(fileContent);
        try {
            Thread.sleep( 1000 * sleep);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Thread thread = Thread.currentThread();
        System.out.println(thread.getName());
    }

    public static void main(String[] args) {
        Thread myThread = new Thread(new ThreadFileCopy(6),"First thread");
        myThread.start();
        Thread mySecondThread = new Thread(new ThreadFileCopy(0),"Second thread");
        mySecondThread.start();
    }
}
