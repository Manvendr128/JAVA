package oppsfirst;

public class passingobectstomethodssss {
    public static  class car{
        String name;
        double length;
        int seats;
        String enginetype;
        int modal;
        void print(){
            System.out.println(name + " " + length + " " + seats + " " + enginetype + " " + modal);
        }


    }
    public static void main(String[] args) {
        car c = new car();
        c.name = "kia sonet";
        c.length = 5;
        c.enginetype = "diesel";
        c.modal = 2025;
        c.seats = 7;

        change(c);
        // Agar sabhi cheeje ek sath print krwani hai too hum.....
        c.print();

//        System.out.println(c.name);
//        System.out.println(c.modal);

    }
    public static void change(car c){
        //change finction bnaya
        c.name = "Fortuner";
        c.modal = 2020;

    }
}
