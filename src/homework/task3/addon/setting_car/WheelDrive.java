package homework.task3.addon.setting_car;

public enum WheelDrive {
    FRONT_DRIVE("Передний привод"),
    BACK_DRIVE("Задний привод"),
    FULL_DRIVE("Полный привод");

    private String type;

    WheelDrive(String type) {
        this.type = type;
    }
}
