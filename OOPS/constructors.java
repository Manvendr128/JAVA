package OOPS;

public class constructors {
    public static class car{
        int price;
        String name;

//        car(){ // default constructor
//
//        }
//        car(int price,String name ){
//            price = price;
//            name = name;
//
//        }
        // THIS KEYWORD
         car(int price,String name ){
            this.price = price;
            this.name = name;

        }

//        car(int x,String s ){
//            price = x;
//            name = s;
//
//        }
        car(String s,int x){
            price = x;
            name = s;
        }
        void print(){ // work as a getter
             int price = 24;
            System.out.println(name +" " + this.price);
        }

    }

    public static void main(String[] args) {
        car c1 = new car(500000000,"kia sonet");
        c1.print();
        car c2 = new car("scorpio",70000000);
        c2.print();
//        System.out.println(c1.name);



    }
}
