class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class DetectLoop {
    public static boolean hasCycle(ListNode head) {
        if (head == null) return false;
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        
        ListNode head = new ListNode(1);
        ListNode second = new ListNode(3);
        ListNode third = new ListNode(4);

        head.next = second;
        second.next = third;
        third.next = second; 

        System.out.println("Contains loop: " + hasCycle(head)); 
    }
}

