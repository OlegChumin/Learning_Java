package Java_Oleg.thinkinginjava.dateandtime;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CalendarSamples {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();

        int era = calendar.get(Calendar.ERA);
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DAY_OF_MONTH);

        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        int hour = calendar.get(Calendar.HOUR);
        int minute = calendar.get(Calendar.MINUTE);
        int second = calendar.get(Calendar.SECOND);

        System.out.println("era "+era+"   year "+year+  "   month "+month+ "   day "+day+ "   dayOfWeek "+dayOfWeek+ "   hour "+hour+ ":"+minute+":"+ second);
    }

    public static class CalendarVsDate {
        public static void main(String[] args) {


            Calendar calendar = new GregorianCalendar();
            Date date = calendar.getTime();
            System.out.println(date);
        }
    }
}
