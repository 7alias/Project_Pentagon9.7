import static java.lang.Math.round;

public class Main {


    public static void main(String[] args) {

        int a1 = -3;
        int a2 = 1;

        int b1 = 1;
        int b2 = 4;

        int c1 = 4;
        int c2 = -1;

        int d1 = 1;
        int d2 = -3;

        int e1 = -3;
        int e2 = -3;

        Vector vs = new Vector();

        Vector ab = new Vector(a1, a2, b1, b2);
        Vector bc = new Vector(b1, b2, c1, c2);
        Vector cd = new Vector(c1, c2, d1, d2);
        Vector de = new Vector(d1, d2, e1, e2);
        Vector ea = new Vector(e1, e2, a1, a2);

        Vector bd = new Vector(b1, b2, d1, d2);
        Vector ad = new Vector(a1, a2, d1, d2);

        System.out.println("AB " + ab.len());
        System.out.println("BC " + bc.len());
        System.out.println("CD " + cd.len());
        System.out.println("DE " + de.len());
        System.out.println("EA " + ea.len());

        System.out.println("BD " + bd.len());
        System.out.println("AD " + ad.len());
        double sbda = round(vs.heronS(bd.len(), ad.len(), ab.len()));
        double sade = round(vs.heronS(ad.len(), de.len(), ea.len()));
        double sbcd = vs.heronS(bc.len(), cd.len(), bd.len());

        System.out.println("S b d a: " + sbda);
        System.out.println("S a d e: " + sade);
        System.out.println("S b c d: " + sbcd);
        System.out.println("Total S: " + vs.totalS(sbda, sade, sbcd));

    }

    /*

    a = -3,1;
    b = 1,4;
    c = 4,-1
    d = 1, -3;
    e = -3, -3
    S = 32.5;
    AB = 5;
    BC = 5.83;
    CD = 3.61;
    DE = 4;
    EA = 4;

    BD = 7;
    AD = 5.66;

S bda = 14;
S ade = 8;
S bcd = 10.5;

S = S(bda) + S(ade) + S(bcd) = 32.5
     */
}
