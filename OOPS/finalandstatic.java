package OOPS;
class cricketer{
//    final String country = "india";
//    static String country = "nz";
    final static String country = "nz";
    int runs;
    String name;
    double avg;

}
public class finalandstatic {
    public static void main(String[] args) {
        cricketer c1 = new cricketer();
//        c1.country = "england"; error dega Can not assign the value
        cricketer c2 = new cricketer();
//        c1.country = "india"; error dega kuki final aa gya static ke sath
        System.out.println(c2.country);
    }
}
