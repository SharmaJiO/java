import java.util.ArrayList;
public class pair_sum {

    //function to show single posible pair
public static void check(ArrayList<Integer>list , int target){
    int left = 0;
    int right = list.size()-1;
    while(left<right){
        int sum = list.get(left)+list.get(right);
        if(sum == target){
            System.out.println("The pair is found at index were i = "+left+" j = "+right);
            return;
        }
        else if(sum < target) left++;
        else right --;
    }
}

    // function to show all possible pair
    public static void check2(ArrayList<Integer> list, int target) {
        int left = 0;
        int right = list.size() - 1;
        boolean found = false;

        while (left < right) {
            int sum = list.get(left) + list.get(right);

            if (sum == target) {
                System.out.println("Pair found at index i = "
                        + left + " j = " + right
                        + " -> (" + list.get(left)
                        + ", " + list.get(right) + ")");

                found = true;
                left++;     // move both
                right--;
            }
            else if (sum < target) {
                left++;
            }
            else {
                right--;
            }
        }

        if (!found) {
            System.out.println("No pairs found");
        }
    }


    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        check(list , 5);
    }
}


