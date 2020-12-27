package DaysOfWeekEnums;

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

    public boolean isWeekend() {
        return !workingDay;
    }

    public static DaysOfWeek getWeekends() {
        for (DaysOfWeek day : DaysOfWeek.values()) {
            if (day.isWeekend()) {
                System.out.println(day);
            }
        }
        return null;
    }

    public static DaysOfWeek getWorkingDays() {
        for (DaysOfWeek day : DaysOfWeek.values()) {
            if (day.isWorkingDay()) {
                System.out.println(day);
            }
        }
        return null;
    }

    public static DaysOfWeek fromEnglishName(String name){
        for (DaysOfWeek day : values() ) {
            if(name.equalsIgnoreCase(day.getEnglishName())){
                System.out.println(day);
            }
        }
        return null;
    }

    public static DaysOfWeek fromPolishName(String name){
        for (DaysOfWeek day : values() ) {
            if(name.equalsIgnoreCase(day.getPolishName())){
                System.out.println(day);
            }
        }
        return null;
    }
}
