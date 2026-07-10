package recursion;

public class globalvariables {
    // static is global variable
//    static int x = 10;
    public static void main(String[] args) {
//        fun();
//        System.out.println(x);
//        x = 9; // ye global ke hisab se change hoga uski value ko update kr dega
        System.out.println(x);
        int x = 4; // ye ek alg local variable jhn golabl ki koi value nhi
        System.out.println(x); // isme local ke hidsab se change higa
    }
    public static void fun(){
//        x = 20;
        System.out.println(x);
    }
    static int x = 50;
}
