public class Palindrome_DLL {
    public static class Node {
        int val;
        Node next;
        Node prev;

        Node(int val) {
            this.val = val;
        }
    }

    public static boolean List(Node head) {
        Node h = head;
        Node temp = head;
        if (h== null || h.next == null) {
            return true; // Empty or single-node list is a palindrome
        }
        while (temp.next != null) {
            temp = temp.next;
        }
        Node t = temp;
        while (h!= t) {
            if (h.val != t.val) return false;
            h = h.next;
            t = t.prev;
        }
        return true;
    }

    public static void main(String[] args) {
        Node a = new Node(4);
        Node b = new Node(10);
        Node c = new Node(2);
        Node d = new Node(10);
        Node e = new Node(4);
        a.prev = null;// not necessary beacuse its by default null;
        a.next = b;

        b.prev = a;
        b.next = c;

        c.prev = b;
        c.next = d;

        d.prev = c;
        d.next = e;

        e.prev = d;
        e.next = null;
        if (List(a)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not palindrome ");
        }
    }
}
