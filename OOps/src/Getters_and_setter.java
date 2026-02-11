public class Getters_and_setter {
    public  static class abc{
         public String name ;
         public int percentage ;
         private int Age ;

        public  int  prin( ){   // Getter

            return Age;
        }

         public void setRno( int x ){ //setter
       Age = x;
             System.out.println("Age is "+Age);
         }
    }


    public static void main(String[] args) {
        {
            abc x = new abc();
            x.name = "Sumit";
            x.percentage = 10;
//            x.Age = 19 ;
            System.out.println(x.prin());
            x.setRno(22);
        }
    }
}
