import java.util.*;
public class Array_C_Queue {
    public static class C_Queue{
        int f = -1;
        int r = -1;
        int size = 0;
        int n = 4;
        int arr[]=new int[n];
        public void add(int x)throws Exception{
            if(size == 0){
                f = r = 0;
                arr[0] = x;
            }
            else if(size == n){
               throw new Exception("Queue is full");
            }
            else if(r==n-1){
                r=0;
                arr[0]=x;
            }
            else{
                arr[++r]=x;
            }
            size++;
        }

        public int remove()throws Exception{
            int b ;
            if(size == 0){
                throw new Exception("Queue is full");

            }
            else if(f==n-1){
                b = arr[f];
                f=0;
            }
            else{
                b=arr[f];
                f++;
            }
            size--;
            return b;
        }

        public int peek() throws Exception{
            if(size == 0){
                throw new Exception("Queue is full");

            }
            return arr[f];
        }

        public void display(){
            if(size == 0 ){
                System.out.println("Queue is empty");
                return ;
            }
            else if(f<=r){
                for(int i = f ; i<=r ; i++){
                    System.out.print(arr[i]+" ");
                }
            }
            if(r<f){
                for(int i=f ; i<n ; i++){
                    System.out.print(arr[i]+" ");
                }
                for(int i=0 ; i<=r ; i++){
                    System.out.print(arr[i]+" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String []args)throws Exception{
        C_Queue q = new C_Queue();
        q.add(1);
        q.add(2);
        q.add(3);


        q.display();
        q.remove();
        q.display();
        q.add(5);
        q.add(6);

        q.display();
        for(int i = 0 ; i<q.arr.length;i++){
            System.out.print(q.arr[i]+" ");
        }
    }
}
