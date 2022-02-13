package classwork.Lesson5;

public class PairService {
    public static void printKeyValue(Pair<?,?> pair) {
        System.out.println(pair.toString());
    }

    public static Pair<?,?> more(Pair<?,? extends Number> pair,Pair<?,? extends Number> pair2 ) {
        if (pair.getValue().doubleValue() > pair.getValue().doubleValue()) {
            return pair;
        }
        return pair2;
    }
}
