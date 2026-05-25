import java.util.HashSet;
import java.util.LinkedHashSet;

public class set_interface {
    static void hashSet_example(){
        HashSet<Integer> st = new HashSet<>();
        st.add(1);
        st.add(2);
        st.add(3);
        st.add(48);
        st.add(50);
        System.out.println(st);// printing will be in randome order i.e hashset is unordered

//      st.remove(2);
//        System.out.println(st);
//        System.out.println(st.contains(2));
//        System.out.println(st.contains(3));
//        System.out.println(st.size());
    }

    static void LinkedHashSet_example(){
        LinkedHashSet<Integer> st = new LinkedHashSet<>();
        st.add(1);
        st.add(2);
        st.add(3);
        st.add(48);
        st.add(50);
        System.out.println(st);// in this printing will be order unlike hashset


    }
    public static void main(String[] args) {
       //  hashSet_example();
        LinkedHashSet_example();
    }
}
