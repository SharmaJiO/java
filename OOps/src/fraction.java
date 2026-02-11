import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.*;
public class fraction {



 public static class Fraction{
     int num;
     int denl;
int f;
     public  Fraction(int num , int denl){
         this.num = num;
         this.denl = denl ;
         simplify();
     }

     public void simplify(){
         int hcf = gcd(num,denl);
         num = num/hcf;
         denl = denl/hcf;
     }
 }


    public static int gcd(int num , int denl){
        int m = (num > denl ? denl:num);
        int f;
        for(int i=m ; i>=1;i--){
            if((num %i==0) && (denl%i==0)){
                return i;
            }
        }
        return 0;
    }


    public static Fraction add(Fraction a , Fraction b){
        int numerator = a.num*b.denl +  a.denl*b.num;
        int denomenator = a.denl*b.denl;

        Fraction f3= new Fraction(numerator , denomenator);
        return f3 ;
    }


    public static Fraction Mul(Fraction a , Fraction b){
        int numerator = a.num*b.num;
        int denomenator = a.denl*b.denl;

        Fraction f4= new Fraction(numerator , denomenator);
        return f4 ;
    }


    public static void main(String[] args) {
       Fraction a = new Fraction(35,21);
        System.out.println(a.num+"/"+a.denl);
        Fraction b = new Fraction(7,3);
        System.out.println(b.num+"/"+b.denl);
Fraction f3=add(a,b);
        System.out.println(f3.num+"/"+f3.denl);

        Fraction f4=Mul(a,b);
        System.out.println(f4.num+"/"+f4.denl);
    }
}
