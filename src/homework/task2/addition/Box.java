package homework.task2.addition;

public class Box {
    private Integer length;
    private Integer width;
    private Integer height;
    private String type;

        public Box(Integer length, Integer width, Integer height) {
            this.length = length;
            this.width = width;
            this.height = height;
            if (height == null || height == 0) {
                this.type = "Envelope";
                return;
            }
            if (length != width || length != height || width != height) {
                this.type = "Box";
                return;
            }
            this.type = "Cube";
        }

        public Box(Integer length, Integer width) {
            this.length = length;
            this.width = width;
            this.height = null;
            this.type = "Envelope";
        }
        public String getTypeOfBox() {
            return this.type;
        }
}
