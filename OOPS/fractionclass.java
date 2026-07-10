package OOPS;
class fraction{
    int num;
    int den;
    fraction(int x ,int y){
        num = x;
        den = y;
    }
    void print(){
        System.out.println(num + "/" + den);
    }
    void add(fraction f1,fraction f2){
        num = f1.num*f2.den + f2.num*f1.den;
        den = f1.den*f2.den;
        System.out.println(num + "/" + den);

    }
}
public class fractionclass {
    public static void main(String[] args) {
        fraction f1 = new fraction(7,3);
        f1.print();
        fraction f2 = new fraction(3,7);
        f2.add(f1,f2);
    }
}
