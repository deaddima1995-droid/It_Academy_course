package homework.task2.addition;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Box {
    private Integer length;
    private Integer width;
    private Integer height;
    private String type;

        public Box(int length, int width, int height) {
            this.length = length;
            this.width = width;
            this.height = height;
            setType();
        }
        public Box(String configuration) {
            Pattern patternOfBox = Pattern.compile("Box\\[(\\d+)+,?(\\d+)?,?(\\d+)?\\]",Pattern.CASE_INSENSITIVE);
            Matcher matcherOfBox = patternOfBox.matcher(configuration);
            Integer[] data = new Integer[3];
            while (matcherOfBox.find()) {
                for (int i = 0; i < 3; i++) {
                    if (matcherOfBox.group(i + 1) == null) {
                        data[i] = null;
                        continue;
                    }
                    data[i] = Integer.parseInt(matcherOfBox.group(i + 1));
                }
            }
            this.length = data[0];
            this.width = data[1];
            this.height = data[2];
            setType();
        }
    private void setType() {
        if (length == null) {
            type = "Unknown";
            return;
        }
        if (height == null & width == null) {
            if (length == 0 ) {
                type = "Unknown";
                length = null;
                return;
            }
            width = height = length;
            type = "Cube";
            return;
        }
        if (length.equals(width) & length.equals(height) & length != 0) {
            type = "Cube";
            return;
        }
        if (height == 0 || length == 0 || width == 0) {
            type = "Envelope";
            return;
        }
        this.type = "Box";
    }
    public void discover () {
        System.out.println("Объект тип "+type+"\tx ="+length+"\ty ="+width+"\tz ="+height);
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
