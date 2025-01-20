package org.example.linkedList;

public class LL6 {

    public MyNode findLastKElements(MyNode head, int k) {
        if (head==null) {
            return null;
        }
        MyNode slow = head;
        MyNode fast = head;
        int index = k;
        while(fast !=null && index > 0) {
            fast = fast.next;
            index--;
        }
        if (fast == null) {
            return null;
        }
        while(fast.next !=null) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow.next;
    }


    public static void main(String[] args) {
        LL1 ll = new LL1();
        MyNode head = ll.createList(20);
        ll.printList(head);

        LL6 l6 = new LL6();
        MyNode newHead = l6.findLastKElements(head, 6);
        ll.printList(newHead);
    }
}
