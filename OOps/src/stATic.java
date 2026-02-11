public class stATic {
    public  static class student{
        String name ;
        int percentage ;
        int rno ;
        static int numberofStudent ;

        public student(String name , int percentage , int rno){
            this.name =name;
            this.percentage = percentage ;
            this.rno = rno;
numberofStudent++;
        }
        public void print(){
            System.out.println(name);
            System.out.println(percentage);
            System.out.println(rno);
            System.out.println(numberofStudent);
        }
    }


    public static void main(String args[]){
        student s1 = new student("Sumit" , 99 , 13);
        s1.print();


        student s2 = new student("sunny", 89 , 14);
        s2.print();
    }
}
