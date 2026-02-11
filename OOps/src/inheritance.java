public class inheritance {
    //Base class
public static class  Animal{
    String color;
    void eat(){
        System.out.println("eat");
    };
    void breath(){
        System.out.println("breath");
    }
}

//Derived class

    public static class fish extends Animal{
    int fins;

    void swim(){
        System.out.println("Can swin");
    }
}

    public static void main(String[] args) {
fish a = new fish();
        a.eat();
    }
}
