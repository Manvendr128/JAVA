package stringstopic;

public class reverseofstring {
    public static void main(String[] args) {
        String s = "Manvendra";
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        // s = sb; = error dega isliye
        s = sb.toString();
        System.out.println(s);
    }
}
