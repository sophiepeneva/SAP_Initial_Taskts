# SAP_Initial_Taskts

public class WeekDays {

    public static String dayOfWeek(int day) {
        switch (day) {
            case 1:
                return "Monday";
            case 2:
                return "Tuesday";
            case 3:
                return "Wednesday";
            case 4:
                return "Thursday";
            case 5:
                return "Friday";
            case 6:
                return "Saturday";
            case 7:
                return "Sunday";
            default:
                return "Invalid day of the week";
        }

    }

    public static void main(String[] args) {
        for (int i = 1; i < 8; i++) {
            System.out.println(dayOfWeek(i));
        }
    }
}
