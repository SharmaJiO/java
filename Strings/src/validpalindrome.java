import java.util.Scanner;

public class validpalindrome {
    public static boolean isAlphaNumeric(char ch) {
        if ((ch >= '0' && ch <= '9') || (Character.toLowerCase(ch) >= 'a' && Character.toLowerCase(ch) <= 'z')) {
            return true;
        }
        return false;
    }
    public static boolean palin(String str){
        int strt = 0;
        int end = str.length()-1;
        while(strt<=end){
          if(! isAlphaNumeric(str.charAt(strt)) ){
              strt ++;
              continue;
          }
            if(! isAlphaNumeric(str.charAt(end)) ){
                end --;
                continue;
            }
            if(Character.toLowerCase(str.charAt(strt)) != Character.toLowerCase(str.charAt(end))) {
                return false;
            }
            strt++;
            end--;
        }
        return true;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence");
         String str = sc.nextLine();
         if(palin(str)){
             System.out.println("palindrome");
         }
         else{
             System.out.println("not palindrome");
         }
    }
}
