package homework.task3.addon.properties;

public enum Option {
    CONDITIONER("Кондиционер"),
    AUDIO("Аудио"),
    BLUETOOTH("Блютуз"),
    HEATED_SEATS("Подогрев сидений"),
    HEATED_WHEEL("Подогрев руля");

    @Override
    public String toString() {
        return option;
    }

    private String option;

    Option(String option) {
        this.option = option;
    }
}
