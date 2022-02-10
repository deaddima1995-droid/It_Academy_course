package homework.task2.addition;


public class Data {
    private int[] dataValue = new int[5];
    private int index = 0;
    private boolean flag;

    public void addData(int number) {
        index = (index == dataValue.length)?0:index;
        dataValue[index] = number;
        index++;
        if (!flag) {
            flag = index >= dataValue.length;
        }
    }
    public void averageValueOfData() {
        if (index == 0 ) {
            System.out.println(0);
            return;
        }
        double out = 0;
        String result;
        for (int value: dataValue) {
            out += value;
        }
        if (flag) {
            result = String.format("%.1f",out / dataValue.length);
            System.out.println(result);
            return;
        }
        result = String.format("%.1f",out / index);
        System.out.println(result);
    }
    public void writeArray() {
        for (int value: dataValue) {
            System.out.print(value+"\t");
        }
        System.out.print("\n");
    }
}
