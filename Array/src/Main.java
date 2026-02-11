//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


import java.util.*;
public class Main
{
    public static  void main (String[] args) {
        int c = -1;
        int[] arr = new int[3];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the elements of array");
        for (int i = 0; i < 3; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element to be serched");
        int e = sc.nextInt();
        for (int i = 0; i < 3; i++) {
            if (arr[i] == e) {
                c = i;
                continue ;
            }
        }
//        System.out.println("elements of Array are =");
//        for (int i = 0; i < 3; i++) {
//            System.out.print( " "+arr[i]+" ");
//        }
//        System.out.println("");
//        System.out.println("The element "+e+ " is found "+c+" times");
        System.out.println(" "+c);
    }
}
