package ques;
import java.util.Scanner;
public class raisetopower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();
        int ans = 1;

        for(int i =1;i<=p;i++){
            if(n==1)
                break;
            ans*=n;
            if(n==0)
                break;
        }
        if(n==0&&p==0){
            System.out.println("invalid");
        }
        else{
            System.out.println(ans);

        }

    }
}
