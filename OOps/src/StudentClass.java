import java.util.*;
public class StudentClass {
    //creating a my own new data type
    public static class student{
        String name;
        int  rno;
        double percentage;
    }
    public static class car{
        String name;
        int price;
        double milage;
    }
    public static void change (student  o){
        o.name = "Sunny" ;
//        System.out.println(y);
        return ;
    }
    public static void main(String[] args){

//        car  n = new car (); //  Object of class car
//        n.name = "Mersedez";
//        n.price=1000000;
//        n.milage = 22.5;
//
        student x = new student (); // declaration & Object of class Student
        x.name="Sumit";
        x.rno=6;
        x.percentage=99;
        System.out.println(x.name);
        change(x);
        System.out.println(x.name);

//
//      student y = new student (); // declaration
//         y.name="Shail";
//        y.rno=62;
//        y.percentage=99;

    }
}

