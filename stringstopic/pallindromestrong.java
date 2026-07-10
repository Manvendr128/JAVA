package stringstopic;
import java.util.*;
public class pallindromestrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        pall(str);
        if(pall(str)){
            System.out.println("pallindrome");
        }
        else{
            System.out.println("not pallindrome");
        }


    }


    public static boolean pall(String str) {
        int i = 0;
        int j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}
