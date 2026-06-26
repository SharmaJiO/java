import java.util.*;

public class leader_Array {
// BRUTE FORCE --Time Complexity: O(N2) , Space Complexity: O(1)
    public static ArrayList<Integer> leader1(int arr[]){
        ArrayList<Integer>ans = new ArrayList<>();
        for(int i = 0 ; i<arr.length ; i++){
            Boolean leader = true;
            for(int j = i+1 ; j<arr.length ; j++){
                if(arr[i]<arr[j]){
                    leader = false;
                    break;
                }

            }
            if(leader == true){
                ans.add(arr[i]);
            }
        }


        return ans;
    }
 //OPTIMAL -- Time Complexity: O(N) , Space Complexity: O(1)
    public static ArrayList<Integer> leader2(int arr[]){
        ArrayList<Integer>ans = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for(int i = arr.length-1;i>=0;i--){
            if(arr[i]>max){
                max = arr[i];
                ans.add(arr[i]);
            }
        }
        Collections.reverse(ans);
         return ans;
    }
    public static void main(String[] args) {
        int[] nums = {10, 22, 12, 3, 0, 6};
        //ArrayList<Integer>led_2 = leader2(nums);
        ArrayList<Integer>led_1 = leader1(nums);
        System.out.print("Leaders in the array are: ");
        for (int leader : led_1) {
            System.out.print(leader + " ");
        }
        System.out.println();
    }
    }

