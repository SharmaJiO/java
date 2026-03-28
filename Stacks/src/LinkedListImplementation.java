public class LinkedListImplementation {
    public static class Node {
        Node next;
        int data;
        Node(int data) {
            this.data = data;
        }
    }

    public static class MyStack {
        Node head = null;
        int size = 0;

        void push(int x) {
            Node temp = new Node(x);
            temp.next = head;
            head = temp;
            size++;
        }

        int pop() {
            if (head == null) {
                System.out.println("Stack empty");
                return -1;
            }
            int store = head.data;
            head = head.next;
            size--; // Don't forget to decrement size!
            return store;
        }

        int peek() {
            if (head == null) return -1;
            return head.data;
        }

        void displayrec(Node head){
            if(head == null)return;
            displayrec(head.next);
            System.out.print(head.data+" ");

        }
        void display() {
displayrec(head);
System.out.println();
        }

        int size() {
            return size;
        }

        boolean isEmpty(){
            if(size == 0)return true;
            return false;
        }
    }

    public static void main(String[] args) {
        MyStack st = new MyStack();
        st.push(4);
        st.push(5);
        st.push(1);
        st.display(); // Output: 1 5 4 
        System.out.println("Popped: " + st.pop());
        st.display(); // Output: 5 4
    }
}