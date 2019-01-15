# SAP_Initial_Taskts

import java.util.LinkedList;
import java.util.Queue;

public class RequestProcessor {

    private static Queue<String> queue = new LinkedList<>();

    public static void addRequest(String request){
        queue.add(request);
    }

    public static synchronized void processAllRequests(){
        while(!queue.isEmpty()){
            System.out.println("Processing request : " + queue.peek());
            queue.remove();
        }
    }

    public static void main(String[] args) {
        RequestProcessor.addRequest("Request 1");
        RequestProcessor.addRequest("Request 2");
        RequestProcessor.addRequest("Request 3");
        RequestProcessor.processAllRequests();
    }
}
