import java.util.ArrayList;

public class swap {
 public static void swap(ArrayList<Integer>list , int indx1 , int indx2){
     int n = list.get(indx1);
     list.set(indx1,list.get(indx2));
     list.set(indx2,n);
     print(list);
 }
 public static void print(ArrayList<Integer>list){
     int n = list.size();
     for(int i = 0 ; i<n ; i++){
         System.out.print(list.get(i)+" ");
     }
     System.out.println();
 }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(1);
        print(list);
        int indx1,indx2;
        swap(list , 0,1);
    }
}
