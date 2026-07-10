package stringstopic;

public class builtinmetodinstring {
    public static void main(String[] args) {
//        String s = "Manvendra";
//        s.toLowerCase(); // also useless and isse string lowercase me print nhi hogi kuki string immutable hai
//        System.out.println(s);
////        System.out.println(s.toLowerCase());
//        System.out.println(s.toUpperCase());
//        //conactination
//        String a = "Monu";
//        String b = "Attri";
//        System.out.println(a.concat(" " + b));
//        //startsWith
//        String m = "Manvendra";
//        System.out.println(m.startsWith("Man"));
//        //contains
//        System.out.println(m.contains("ven"));
////        endswith
//        System.out.println(m.endsWith("dra"));
//        //indexOf
//        System.out.println(m.indexOf("r"));

        //COMPARE TO........
        String k = "Rarikesh";
        String l = "Himanshu";
        System.out.println(k.compareTo(l)); // ascii value kaa diffeencce de rha R-H KAA
        System.out.println(l.compareTo(k));
        System.out.println('R' - 'H');
        String m = "";
        String n = "Attri";
        System.out.println(m.compareTo(n));
        String s1 = "monu";
        String s2 = "monu";
        System.out.println(s1.compareTo(s2));



    }


}
