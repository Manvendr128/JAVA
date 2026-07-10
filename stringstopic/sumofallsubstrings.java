package stringstopic;

public class sumofallsubstrings {
    public static void main(String[] args) {
        int x = 123;
        String s = Integer.toString(x);
        int sum = 0;
        for(int i = 0;i<s.length();i++){
            for(int j = i;j<s.length();j++){
                String y = s.substring(i,j+1);
                int t = Integer.parseInt(y);
                sum = sum + t;
            }
        }
        System.out.print(sum);
    }
}
