package stringstopic;
import java.util.*;

public class togglecharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sb = sc.nextLine();
        StringBuilder s = new StringBuilder(sb);
        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch>=65 && ch<=90){
                char dh = (char)(ch + 32);
                s.setCharAt(i,dh);
            }
            else if(ch>=97 && ch<=122){
                char dh = (char)(ch - 32);
                s.setCharAt(i,dh);
            }

        }
        sb = s.toString();
        System.out.println(sb);

















    }
}
