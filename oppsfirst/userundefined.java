package oppsfirst;
import java.util.Scanner;

public class userundefined {
    public static class student{
        //khud kaa datatype bna liya hai!
        // class ke kaafi sare objects hote hain;;;
        String name;
        int rno;
        double cgpa;


    }
    public static void main(String[] args) {
        // SCANNER bhi CLASS hai........ AND sc objects hai...
        Scanner sc = new Scanner(System.in);
        //objects1
        student s1 = new student();
        student s2 = new student();// declaration
        // basic tarika
//        s1.name = "khushi";
//        s1.rno = 34;
        s1.rno = sc.nextInt();
//        s1.cgpa = 7.9;
        s1.cgpa = sc.nextDouble();
        s1.name = "khushi";

        //object s2
        s2.name = "akash";
        s2.rno = 3;
        s2.cgpa = 8.9;

        //print karane kaaa tarika
        System.out.println(s1.name + " " + s1.rno + " " + s1.cgpa);
        //update....
        s2.cgpa = 10;
        System.out.println(s2.cgpa);



    }
}
