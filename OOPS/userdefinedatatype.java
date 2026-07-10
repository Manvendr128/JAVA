package OOPS;
import java.util.*;
class Student{// khud kaa datatype
    String name;
    int rno;
    double cgpa;

    // passing methods in class
    void print(){
        System.out.println(name +" " +rno+" "+cgpa);

    }

}
public class userdefinedatatype {
//    public static class Student{// khud kaa datatype
//        String name;
//        int rno;
//        double cgpa;
//
//    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s1 = new Student(); // declaration
        s1.name = "Monu";
        s1.rno = sc.nextInt();
        s1.cgpa = 7.9;

        Student s2 = new Student();
        s2.name = "Sonu";
        s2.rno = 28;
        s2.cgpa = 8.9;
// ye farzi tarika hai
        System.out.println(s1.name +" " + s1.rno + " "+ s1.cgpa);
//        ye smart method hai class me function pass krke sbhi cheejo ko ek sath print kra dena
        s1.print();
        s2.print();


    }
}
