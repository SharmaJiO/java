import java.util.*;
public class copyConstructor {
    public static class Student {
        String name;
        int age;

        // Normal constructor
        Student(String name, int age) {
            this.name = name;
            this.age = age;
        }

        // Copy constructor
        Student(Student s) {
            this.name = s.name;
            this.age = s.age;
        }

        void display() {
            System.out.println(name + " " + age);
        }


    }
    public static void main(String[] args) {
        Student s1 = new Student("Sumit", 20);
        Student s2 = new Student(s1);   // copy constructor

        s1.display();
        s2.display();
    }
}
