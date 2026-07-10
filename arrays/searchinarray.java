package arrays;
import java.util.*;
public class searchinarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int target = sc.nextInt();
        int [] arr = new int[n];
        boolean flag = false;
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i<arr.length;i++){
            int m = arr[i];
            if(m == target){
                System.out.println("target found");
                flag = true;
                break;
            }
        }
        if(flag==false) System.out.println("target not found");
    }
}
