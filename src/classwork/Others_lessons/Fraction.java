package classwork.Others_lessons;


public class Fraction {
    private int numenator;
    private int denumenator;

        Fraction(int numenator,int denumenator) {
            this.numenator = numenator;
            this.denumenator = denumenator;
        }

    public void writeFraction() {
        System.out.println(numenator+"/"+denumenator);
    }

    public int getNumenator() {
        return numenator;
    }

    public int getDenumenator() {
        return denumenator;
    }
}
