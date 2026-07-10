package recursion;

public class towerofhanoi {
    public static void main(String[] args) {
        hanoi(3,'a','b','c');
    }
    public static void hanoi(int n,char a,char b,char c){
        if(n==0) return;
        // n-1 disk form a to b via c
        hanoi(n-1,a,c,b);
        // largest from a to c;
        System.out.println(a + "->" + c);
        hanoi(n-1,b,a,c); // n-1 disk from b to c vi

    }
}
