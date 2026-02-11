public class Constructor {
    public  static class student{
        String name ;
        int percentage ;
        int rno ;

        public student(String name , int percentage , int rno){
            this.name =name;
            this.percentage = percentage ;
            this.rno = rno;

        }
        public void print(){
            System.out.println(name);
            System.out.println(percentage);
            System.out.println(rno);
        }
    }
//    public  static void print(student o){
//        System.out.println(o.name);
//        System.out.println(o.percentage);
//        System.out.println(o.rno);
//    }

    public static void main(String args[]){
        student s1 = new student ("Sumit" , 99 , 13);
        s1.print();
//        print(s1);
        student s2 = new student("sunny", 89 , 14);
        s2.print();
    }
}
