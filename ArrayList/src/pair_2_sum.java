import java.util.ArrayList;
public class pair_2_sum {
    public static int pivot(ArrayList<Integer>list){
        int n = list.size();
        int left = 0;
        int right = n - 1;
        while(left<=right){
            int mid = (left+right)/2;
            if(list.get(mid)>list.get(mid+1)){
                return mid;
            }
            if(list.get(mid)<list.get(mid-1)){
                return mid;
            }
            if(list.get(mid)>=list.get(left)){
                left = mid+1;
            }else right=mid-1;
        }
        return -1;
    }
public static void pairsum(ArrayList<Integer>list , int target)
    {
        int i = pivot(list);
        int n = list.size();
        int lp = i+1;
        int rp = i;
        while(lp!=rp){
            int sum = list.get(lp)+list.get(rp);
            if(sum == target){
                System.out.println("found at i ="+lp+"  &  "+rp);
            }
            if(sum<target){
                lp=(lp+1)%n;
            }
            else rp=(n+rp-1)%n;
        }

    }
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        int target = 16;
        pairsum(list , target);

    }
}
