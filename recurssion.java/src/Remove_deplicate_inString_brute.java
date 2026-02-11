import java.util.*;
public class Remove_deplicate_inString_brute {
public static void removeDuplicates(String str , int idx , StringBuilder newstr , boolean map[]){
    //bASE  CASE
    if(idx == str.length()){
        System.out.println(newstr);
        return ;
    }

    //kAAM
    char currChar = str.charAt(idx);
    if(map[currChar-'a']==true){
        //duplicate
        removeDuplicates(str, idx+1, newstr, map);
    }
    else{
        map[currChar-'a']=true;
        removeDuplicates(str, idx+1, newstr.append(currChar), map);
    }

}

    public static void main(String args[]){
String str ="appnnacollege";
removeDuplicates(str,0,new StringBuilder(""),new boolean[26]);

    }
}
