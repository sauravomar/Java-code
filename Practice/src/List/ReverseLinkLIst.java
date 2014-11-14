package List;

/**
 * Created by saurav on 15/6/14.
 */

class Node{

    Node next;
    int val;

}

public class ReverseLinkLIst{
    private static Node reverseLinkedList(Node head){


    if (head == null || head.next == null) return head;
        Node prev = null;
        Node cur = head;
        Node next = head.next;
    while (next != null) {
        cur.next = prev;
        prev = cur;
        cur = next;
        next = next.next;
    }
    return prev;
   }

}
