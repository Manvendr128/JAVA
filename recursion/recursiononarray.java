package recursion;

//import static java.nio.file.Files.exists;

public class recursiononarray {
    public static void main(String[] args) {
        int[] arr = {1,23,1,3,4,6,7,6};
//        reprint(arr,0);
        int ele = 6;
        System.out.println(exists(arr,ele,0));
    }
    public static boolean exists(int[] arr , int ele ,int idx){
        if(idx==arr.length) return false;
        if(arr[idx] == ele) return true;
        return exists(arr,ele,idx + 1);
    }

    public static void reprint(int[] arr ,int idx){
        if(idx == arr.length) return;
        System.out.print(arr[idx] + " ");
        reprint(arr,idx +1);
    }
}
