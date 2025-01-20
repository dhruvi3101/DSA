package org.example.linkedList;

public class LL3 {
    public MyNode removeDuplicates(MyNode head) {
        if (head==null) {
            return null;
        }

        MyNode temp = head;
        while(temp.next!=null) {
            if (temp.value == temp.next.value) {
                temp.next = temp.next.next;
            }
            else {
                temp = temp.next;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        LL1 l1 = new LL1();
        l1.addFirst(1);
        l1.addLast(2);
        l1.addLast(2);
        l1.addLast(9);
        l1.addLast(9);
        l1.addLast(9);
        l1.addLast(10);
        l1.addLast(10);
        l1.addLast(17);

        l1.printList();

        LL3 l3 = new LL3();
        MyNode newHead = l3.removeDuplicates(l1.head);
        l1.printList(newHead);

    }
}
