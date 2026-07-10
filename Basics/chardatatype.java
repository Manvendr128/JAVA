package Basics;
import java.util.*;
public class chardatatype {
    public static void main(String[] args) {
        // all special character;
        // Ascii value a = 97
        // Ascii value A = 65
        // space ki ascii value = 32
        char ch = 'a';
        char b = 'A';
        //implicit typecasting
        int a = ch;
        System.out.println(a);
        //
        System.out.println(ch + 4);
        // char + char = int
        System.out.println(ch + b);
        //explicit typecasting
        System.out.println((int)ch);
        System.out.println((int)b);
        int y = -450;
        System.out.println((char)y);
        int m = 10;
        System.out.println(++m + ++m);

    }
}
