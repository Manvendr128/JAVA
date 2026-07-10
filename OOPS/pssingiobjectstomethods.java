package OOPS;

public class pssingiobjectstomethods {
    public static class car{
        int seats;
        String name;
        double length;
        String type;
        int torque;
// passing methods in class
        void print(){
            System.out.print(seats +" "+name +" "+torque +" "+length + " " +type);
        }
    }
    public static void main(String[] args) {
        car c = new car();
        c.length = 3.99;
        c.name = "kia sonet";
        c.seats = 4;
        c.type = "SUV";
        c.torque = 178;

        change(c);
        System.out.println(c.seats);
        c.print();
    }
//    passing objects in methods
    public static void change(car x){
        x.seats = 5;
    }

}
