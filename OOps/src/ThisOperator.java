public class ThisOperator {
    public  static class abc{
    public String name ;
    public int percentage ;
    private int Age ;

    public  void  prin( int Age){   // Getter
        this.Age = Age ;
        System.out.println(this.Age);
    }


}


    public static void main(String[] args) {
        {
            abc x = new abc();
            x.name = "Sumit";
            x.percentage = 10;
//            x.Age = 19 ;
            x.prin(2);

        }
    }
}
