package recursion;

public class increasingdecreasing   {
    public static void id(int n){
        if(n==0) return ;
        System.out.println(n + " ");
        id(n-1);
        System.out.println(n +" ");
    }
    public static void main(String[] args) {
        int n = 10;
        id(n);
    }
}
