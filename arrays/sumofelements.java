package arrays;
import java.util.*;
public class sumofelements {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        for(int i = 0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0;i<arr.length;i++){
            sum+=arr[i];
        }
        System.out.println(sum);
    }
}
