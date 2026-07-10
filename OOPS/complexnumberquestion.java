package OOPS;
class complexnumber{
    int r;
    int i;
    complexnumber(int x,int y){
        r = x;
        i = y;
    }
    void print(){
        if(i>=0) {
            System.out.println(r + " + " + i + "i");
        }
        else{
            System.out.println(r +" - "+ (-i) + "i");
        }
    }

    void add(complexnumber z2) {
        r = r + z2.r;
        i = i + z2.i;
//        System.out.println();
    }
    void mul(complexnumber z){
        r = r * z.r - i * z.i;
        i = r * z.i + i * z.r;
    }
}

public class complexnumberquestion {
    public static void main(String[] args) {
        complexnumber z1 = new complexnumber(5,25);
        z1.print();
        complexnumber z2 = new complexnumber(5,-20);
        z2.print();
        z1.add(z2);
        z2.print();
        z1.print();
        z2.mul(z1);
        z2.print();
    }
}
