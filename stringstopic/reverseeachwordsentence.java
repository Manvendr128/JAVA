package stringstopic;

public class reverseeachwordsentence {
    public static void main(String[] args) {
        String s = "my name is manvendra singh";
        String[] arr = s.split(" ");
        int n = arr.length;
        for(int i = 0;i<n;i++){
            int f = 0;
            int l = arr[i].length()-1;
            char[] ch = arr[i].toCharArray();
                while(f<l) {
                    char temp = ch[f];
                    ch[f] = ch[l];
                    ch[l] = temp;
                    f++;
                    l--;
                }
                arr[i] = new String(ch);
            }
//        for(int i = 0;i<n;i++){
//            System.out.print(arr[i] + " ");
//        }
        s = String.join(" ",arr);
        System.out.println(s);
    }
}
