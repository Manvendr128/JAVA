package recursion;

public class functioncallingitself {
    public static void main(String[] args) {
        ajay(1);
        print(1);
    }
    public static void ajay(int n){
        if(n==5) return;
        System.out.println("priya");
        ajay(n+1);
    }
    public static void print(int c){
        if(c==51) return;
        System.out.print(c + " ");
        print(c + 1);
    }

}
