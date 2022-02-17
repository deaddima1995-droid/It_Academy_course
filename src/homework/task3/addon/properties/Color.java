package homework.task3.addon.properties;

public enum Color {
    RED("Красный"),
    GREEN("Зелёный"),
    BLUE("Синий"),
    WHITE("Белый"),
    GREY("Серый");

    Color(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return color;
    }

    private String color;
}
