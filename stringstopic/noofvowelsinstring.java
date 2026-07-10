package stringstopic;
import java.util.*;
public class noofvowelsinstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
//        char a,e,i,o,u,A,E,I,O,U;
        int c = 0;
        for(int i = 0;i<str.length();i++){
            str.charAt(i);
            if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='o' || str.charAt(i)=='i' || str.charAt(i)=='u' ){
                c++;
            }
        }
        System.out.println(c);
    }
}
