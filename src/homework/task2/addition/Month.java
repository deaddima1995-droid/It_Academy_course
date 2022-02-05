package homework.task2.addition;

public enum Month {
    JANUARY("January",1),
    FEBRUARY("February",2),
    MARCH("March",3),
    APRIL("April",4),
    MAY("May",5),
    JUNE("June",6),
    JULY("July",7),
    AUGUST("August",8),
    SEPTEMBER("September",9),
    OCTOBER("October",10),
    NOVEMBER("November",11),
    DECEMBER("December",12);

    private final Integer number;
    private final String name;
    Month(String name, int number) {
        this.number = number;
        this.name = name;
    }

    public static Integer getNumberByName(String name) {
        for (Month month: values()) {
            if(month.name.equals(name)) {
                return month.number;
            }
        }
        return null;
    }

    public static String getNameByNumber(int number) {
        for (Month month: values()) {
            if(month.number == number) {
                return month.name;
            }
        }
        return null;
    }
}
