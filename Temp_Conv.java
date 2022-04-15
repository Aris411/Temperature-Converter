public class Temp_Conv {

    public Temp_Conv() {
    }

    public double convertToF(double c) {
        double f = c * 9.0D / 5.0D + 32.0D;
        //System.out.println(c + " C  ---> " + f + " F");
        return f;
    }

    public double convertToC(double f) {
        double c = (f - 32.0D) * 5.0D / 9.0D;
        //System.out.println(f + " F  ---> " + c + " C");
        return c;
    }
}