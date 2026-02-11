         // Q)Find out the node where the cycle begins i.e the node at which the tail node points
public class Cycle_Detech {
    public static class Node{
        int data;
        Node next;
        Node(int val){
            this.data=val;
        }
    }
    public static class Linkedlist {
        Node head = null;
        Node tail = null;

        Node cycle(Node head) {
            Node slow = head;
            Node fast = head;

            while (fast != null && fast.next!=null) {
                slow = slow.next;
                fast = fast.next.next;
                if (fast == slow) break;
            }
            // If no cycle is found, return null
            if (fast == null || fast.next == null) {
                return null;
            }
            Node temp = head;
            while (temp != slow) {
                temp = temp.next;
                slow = slow.next;
            }
            return temp;
        }

        void display(Node head) {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

        public static void main(String[] args) {
            Node x = new Node(3);
            Node y = new Node(4);
            Node z = new Node(5);
            Node n = new Node(6);
            x.next = y;
            y.next = z;
            z.next = n;
            n.next = y;
            Linkedlist ll = new Linkedlist();
            System.out.println("CYCLE DETECTION");
            Node cycleNode = ll.cycle(x);
            if(cycleNode != null){
                System.out.println("Cycle found at node with value: " + cycleNode.data);
            }
            else {
                System.out.println("No cycle found.");
            }
        }
    }

