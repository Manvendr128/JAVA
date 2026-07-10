package recursion;
import java.util.*;
public class stringsbasicsmore {
    public static void main(String[] args) {
        String s = "Monu";
        change(s);
        System.out.println(s);

        String[] arr = {"santosh" ,"krish","gopi","hemant","vivek"};
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        ArrayList<String> al = new ArrayList<>();
        al.add("monu");
    }
    public static  void change(String s){
        s = "Attri";
    }
}
