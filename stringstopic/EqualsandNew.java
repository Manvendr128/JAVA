package stringstopic;

public class EqualsandNew {
    public static void main(String[] args) {
        String x ="Amol";
//        String y = "Amol";
        String y = new String("Amol"); // false kuu compare krne par?????
        // refrence same nhi hota isliye
        //.equals use krte hai
        System.out.println(x==y);
        System.out.println(y.equals(x));

    }
}
