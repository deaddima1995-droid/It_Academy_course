package classwork.strin;

import java.io.Serializable;

public class Box implements Serializable {
    private final int x;
    private final int y;
    private final int z;
    private final int volume;

    public int getVolume() {
        return volume;
    }

    public Box(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
        volume = x * y * z;
    }

    @Override
    public String toString() {
        return "Box{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                ", volume=" + volume +
                '}';
    }
}
