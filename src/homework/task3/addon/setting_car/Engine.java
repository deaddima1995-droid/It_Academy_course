package homework.task3.addon.setting_car;

public enum Engine {
    LOW("1.8"),
    COMMON("2.5"),
    HIGH("3.0");

    @Override
    public String toString() {
        return capacity;
    }

    Engine(String capacity) {
        this.capacity = capacity;
    }

    private String capacity;
}
