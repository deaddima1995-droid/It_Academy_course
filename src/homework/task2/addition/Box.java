package homework.task2.addition;

public class Box {
    private final Integer length;
    private final Integer width;
    private final Integer height;
    private final String type;

        public Box(Integer length, Integer width, Integer height) {

            this.length = length;
            this.width = width;
            this.height = height;

            if (height == null || height == 0) {
                this.type = "Envelope";
                return;
            }
            if (!length.equals(width) || !length.equals(height)) {
                this.type = "Box";
                return;
            }
            this.type = "Cube";
        }

    public String getType() {
        return this.type;
    }

    public Integer getLength() {
        return length;
    }

    public Integer getWidth() {
        return width;
    }

    public Integer getHeight() {
        return height;
    }
}
