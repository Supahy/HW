package DaysOfWeekEnums;

import java.util.ArrayList;
import java.util.List;

public enum DaysOfWeek {
    MON("Monday", "Poniedzialek", true),
    TUE("Tuesday", "Wtorek", true),
    WED("Wednesday", "Sroda", true),
    THU("Thursday", "Czwartek", true),
    FRI("Friday", "Piatek", true),
    SAT("Saturday", "Sobota", false),
    SUN("Sunday", "Niedziela", false);

    private final String englishName;
    private final String polishName;
    private final boolean workingDay;

    DaysOfWeek(String englishName, String polishName, boolean workingDay) {
        this.englishName = englishName;
        this.polishName = polishName;
        this.workingDay = workingDay;
    }

    public String getEnglishName() {
        return englishName;
    }

    public String getPolishName() {
        return polishName;
    }

    public boolean isWorkingDay() {
        return workingDay;
    }

    public static boolean isWeekend(DaysOfWeek day) {
        return !day.isWorkingDay();
    }

    public static ArrayList<DaysOfWeek> getWeekends() {
        ArrayList<DaysOfWeek> weekends = new ArrayList<>();
        for (DaysOfWeek day : DaysOfWeek.values()) {
            if (isWeekend(day)) {
                weekends.add(day);
            }
        }
        return weekends;
    }

    public static ArrayList<DaysOfWeek> getWorkingDays() {
        ArrayList<DaysOfWeek> workingDays =
                new ArrayList<>();
        for (DaysOfWeek day : DaysOfWeek.values()) {
            if (!isWeekend(day)) {
                workingDays.add(day);
            }
        }
        return workingDays;
    }

    public static DaysOfWeek fromEnglishName(String name) {

        for (DaysOfWeek day : values()) {
            if (name.equalsIgnoreCase(day.getEnglishName())) {
                return day;
            }
        }
        return null;
    }

    public static DaysOfWeek fromPolishName(String name) {
        for (DaysOfWeek day : values()) {
            if (name.equalsIgnoreCase(day.getPolishName())) {
                return day;
            }
        }
        return null;
    }
}
