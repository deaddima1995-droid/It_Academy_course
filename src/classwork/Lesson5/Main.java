package classwork.Lesson5;

public class Main {
    public static void main(String[] args) {
        Pair<String,Integer> pair1 = new Pair<>("Key",123);
        Pair<String,Double> pair2 = new Pair<>("key2",2d);
        PairService.printKeyValue(pair1);
        PairService.printKeyValue(pair2);
        Pair<?,?> result = PairService.more(pair1,pair2);
        System.out.println(result);
    }
}
