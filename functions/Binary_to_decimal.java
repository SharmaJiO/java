import java.util.*;
public class Binary_to_decimal {
    public static void binToDec(int binNum){
        int num = binNum;
        int pow = 0 ;
        int decNum = 0 ;
        while(binNum > 0){
            int ld = binNum % 10;
            decNum =  decNum + (ld * (int)Math.pow(2,pow));
            pow ++;
            binNum=binNum/10;
        }
        System.out.println("Decimal of binary "+num+" is "+decNum);
    }

    public static void main(String[] args) {
        binToDec(111);
    }
}
