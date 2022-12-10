package javarush.enums;

public class SсkoolSchedule {

    private DayOfWeek dayOfWeek;

    public DayOfWeek getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(DayOfWeek dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }
}

class Scholar {
    private SсkoolSchedule schedule;
    private boolean goToSckool;


    public void wakeUp() {
        if (this.schedule.getDayOfWeek() == DayOfWeek.SUNDAY) {
            System.out.println("Can sleep...");
        } else {
            System.out.println("Have to go to Sckool! Wake Up...");
        }
    }
}
