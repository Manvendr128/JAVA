package OOPS;
class Students{
    String name;
    private int rno;
    double cgpa;
    void print(){
        System.out.println(name + " " + cgpa + " "+ rno);
    }

    int getrno(){ // getter
        return rno;
    }

    void setrno(int x){
        rno = x;
    }
//    public void p(){
//        print();
//    }

}

public class privatekeyword {
    public static void main(String[] args) {
        Students s1 = new Students();
        s1.cgpa = 8.2;
        s1.name = "monu";
//        s1.rno = 12; => ISKO ACCESS NHI KR SKTE NAA MODIFY KR SKTE
//        s1.print();
        s1.print();
        s1.setrno(45);
        System.out.println(s1.getrno());
    }
}
