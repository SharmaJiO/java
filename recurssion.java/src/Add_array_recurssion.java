
import java .util.*;
public class Add_array_recurssion{
    static int  addArray(int[ ]arr , int idx){
        if(idx == arr.length-1){
            return arr[idx];
        }
        int s = addArray(arr , idx+1);
        return arr[idx] + s;
    }
    public static void main(String[] args){
        int arr []= {5,6,7,8};
        System.out.println(addArray(arr , 0));
    }
}