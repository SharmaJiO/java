import java.util.ArrayList;
import java.util.Collections;
public class Reverse {
    static void reverselist(ArrayList<Integer> list){
        int i =0 , j = list.size()-1;

        while(i<j){
            Integer temp = Integer.valueOf(list.get(i));
            list.set(i,list.get(j));
            list.set(j,list.get(temp));
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println("Original list"+list);
//        reverselist(list);
        Collections.reverse(list);
        System.out.println("Reversed list "+list);
        Collections.sort(list);
        System.out.println("Ascending order"+list);
        Collections.sort(list,Collections.reverseOrder());
        System.out.println("Descending order"+list);
        list.add(2,88);
        System.out.println("Array after adding new element"+list);

        ArrayList<String> l1 = new ArrayList<>();
        l1.add("My");
        l1.add("name");
        l1.add("is");
        l1.add("Sumit");
        System.out.println("Original String array"+l1);
        Collections.sort(l1,Collections.reverseOrder());
        System.out.println("Sorted String Array in Descending order"+l1);
    }

}
