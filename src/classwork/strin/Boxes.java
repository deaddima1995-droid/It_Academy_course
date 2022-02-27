package classwork.strin;

import java.util.ArrayList;
import java.util.List;

public class Boxes {

    private final List<Box> boxList = new ArrayList<>();

    public void saveBox(Box box) {
        this.boxList.add(box);
    }

    public List<Box> getBoxByValue(int value) {
        List<Box> out = new ArrayList<>();
        for (Box box: boxList) {
            if (box.getVolume() == value) {
                out.add(box);
            }
        }
        return out;
    }

    @Override
    public String toString() {
        return "Boxes{" +
                "boxList=" + boxList +
                '}';
    }
}
