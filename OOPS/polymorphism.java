package OOPS;

public class polymorphism {
    public static class Dog{
        void speak(){
            System.out.println("Bhau Bhau");
        }

    }
    public static class Cat{
        void speak(){
            System.out.println("meow meow");
        }

    }
    public static class Lion{
        void speak(){
            System.out.println("Grrr");
        }

    }
    public static class Pikachu{
        void speak(){
            System.out.println("Pika Pika");
        }
    }
    public static class Human{
        void speak(){
            System.out.println("Hello Hello");
        }

    }
    public static void main(String[] args) {
        Human h = new Human();
        Pikachu p = new Pikachu();
        Dog d = new Dog();
        Cat c = new Cat();

        d.speak();
        c.speak();
        p.speak();
        h.speak();

    }
}
