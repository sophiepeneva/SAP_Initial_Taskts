# SAP_Initial_Taskts

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Dates {

    public static void main(String[] args) throws ParseException{
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date first, second;
        first = format.parse(args[0]);
        second = format.parse(args[1]);
        long diff = second.getTime() - first.getTime();
        System.out.println(TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS));
    }
}
