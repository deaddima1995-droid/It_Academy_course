package classwork.lessong;

import classwork.strin.Box;

import java.util.*;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class Mains implements Printable{
    private static final Function<Integer, String> INTEGER_STRING_FUNCTION = n -> String.valueOf(n);

    public static void main(String[] args) {
        INTEGER_STRING_FUNCTION.apply(10);
    }

    @Override
    public void print() {

    }
}
