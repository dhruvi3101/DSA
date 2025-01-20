package org.example.linkedList;

public class LL4 {
    public MyNode reverseList(MyNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        MyNode prev = head;
        MyNode curr = head.next;
        MyNode n = curr.next;
        while (n != null) {
            curr.next = prev;
            prev = curr;
            curr = n;
            n = n.next;
        }

        curr.next= prev;
        head.next = null;
        head = curr;
        return head;
    }

    public static void main(String[] args) {
        LL4 l = new LL4();
        LL1 l1 = new LL1();
        MyNode head = l1.createList(6);
        l1.printList(head);

        MyNode reversed = l.reverseList(head);
        l1.printList(reversed);
    }
}
