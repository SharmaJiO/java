import java.util.ArrayList;

public class max {
static int check(ArrayList<Integer>list){
    int n = list.size();
    int i = Integer.MIN_VALUE;
    for(int j = 0 ; j<n ; j++){
        if(list.get(j)>i) i = list.get(j);
    }
    return i;
}
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(1);
        int max = check(list);
        System.out.println("Max is "+max);
    }
}
