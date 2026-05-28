import java.util.*;
public class Max_len_chainPair {
    public static void main(String[]args) //O(nlogn)
    {
        int pair[][]={{5,24},{39,60},{5,28},{27,40},{50,90}};
        Arrays.sort(pair,Comparator.comparingDouble(o->o[1]));

        int maxLength = 1;
        int a = pair[0][1];
        for(int i = 1;i<pair.length ; i++){
            if(pair[i][0]>a){
                maxLength++;
                a=pair[i][1];
            }
        }
        System.out.println("max Length chain pair = "+maxLength);
    }
}
