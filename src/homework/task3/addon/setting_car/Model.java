package homework.task3.addon.setting_car;

public enum Model {
    GOLF("Golf"),
    PASSAT("Passat"),
    POLO("Polo"),
    CADDY("Caddy"),
    MULTIVAN("Multivan");



    private final String model;

    Model(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return model;
    }
}
