import java.util.*;
public class Indian_coins {
    public static void main(String[] args) { //O(nlogn)
        Integer coins[] = {1,2,5,10,20,50,100,500,2000};
        Arrays.sort(coins,Comparator.reverseOrder());

        ArrayList<Integer> ans =new ArrayList<>();

        int count = 0 ;
        int amount = 590;
        for(int i = 0 ; i<coins.length ;i++){
            if(coins[i]<=amount){
                while(coins[i]<=amount){
                    amount=amount-coins[i];
                    ans.add(coins[i]);
                    count++;
                }
            }
        }
        System.out.println("No of coins/notes used = "+count);
        System.out.println("-----Currency used are ----");
        for(int i = 0 ; i<ans.size() ; i++){
            System.out.print(ans.get(i)+" + ");
        }
        System.out.println();
    }
}
