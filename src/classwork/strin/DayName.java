package classwork.strin;

public enum DayName {
    MONDAY("monday",1),
    TUESDAY("tuesday",2),
    WEDNESDAY("wednesday",3),
    THURSDAY("thursday",4),
    FRIDAY("friday",5),
    SATURDAY("saturday",6),
    SUNDAY("sunday",7);

    private final String name;
    private final Integer number;

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }


    DayName(String name, int number) {
        this.name = name;
        this.number = number;
    }
    public static String getNameByNumber(int number) {
        for (DayName value : values()) {
            if (value.number == number) {
                return value.name;
            }
        }
        return null;
    }
    public static Integer getNumberByName(String name) {
        for (DayName value : values()) {
            if (value.name.equals(name)){
                return value.number;
            }
        }
        return null;
    }
}
