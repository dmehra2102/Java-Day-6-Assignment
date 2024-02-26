import java.util.ArrayList;

public class Weekdays {
    private ArrayList<String> weekdaysArray;

    class DayOutsideRangeException extends Exception{
        public DayOutsideRangeException(String message){
            super(message);
        }
    }

    Weekdays(){
        weekdaysArray = new ArrayList<String>();
        weekdaysArray.add("Sunday");
        weekdaysArray.add("Monday");
        weekdaysArray.add("Tuesday");
        weekdaysArray.add("Wednesday");
        weekdaysArray.add("Thursday");
        weekdaysArray.add("Friday");
        weekdaysArray.add("Saturday");
    }

    void printDay(int dayIndex) throws DayOutsideRangeException{
        if(dayIndex < 0 && dayIndex > 6){
            throw new DayOutsideRangeException("Day index range must be between 0 to 6");
        }else{
            System.out.println(weekdaysArray.get(dayIndex));
        }
    }
}
