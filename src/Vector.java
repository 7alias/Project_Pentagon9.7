import static java.lang.Math.*;


public class Vector {
    private int a1;
    private int a2;
    private int b1;
    private int b2;


    public Vector(int a1, int a2, int b1, int b2) {
        this.a1 = a1;
        this.a2 = a2;
        this.b1 = b1;
        this.b2 = b2;
    }

    public Vector() {
    }


    public double len() {
        return sqrt(pow(this.b1 - this.a1, 2) + pow(this.b2 - this.a2, 2));
    }

    public double heronS(double a, double b, double c) {

        double p = (a + b + c) / 2;
        return sqrt(p * (p - a) * (p - b) * (p - c));

    }

    public double totalS(double s1, double s2, double s3) {

        return s1 + s2 + s3;
    }

}
