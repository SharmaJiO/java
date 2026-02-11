import java.util.*;
public class Abstraction {

    public static abstract class Animal{
        void eat(){
            System.out.println("animal eats");
        }
        abstract void walk();
    }


    public static class horse extends Animal{
void walk(){
    System.out.println("Walks on 4 legs ");
}


    }

    public static class  chicken extends Animal{
        void walk(){
            System.out.println("Walk on 2 legs");
        }
    }
    public static void main(String[] args) {
horse h = new horse();
h.walk();
h.eat();

chicken c = new chicken();
c.walk();
c.eat();
    }
}
