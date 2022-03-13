package homework.project.data.car.car_data;

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
