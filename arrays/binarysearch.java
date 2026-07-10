package arrays;
import java.util.*;

public class binarysearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int t = sc.nextInt();
        int low = 0;
        int high = arr.length-1;
        boolean found = false; // ye isiliey bnaya end me lga ske agr nhi found hua too lga ske ye[
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid] == t){
                System.out.println(mid);
                found = true;
                break;
            }
            else if(arr[mid]<t){
                low = mid + 1;

            }
            else{
                high = mid -1;
            }

        }
        if(!found){
            System.out.println("element not exist");
        }
    }
}
