package org.example.linkedList;

public class LL2 {

    public MyNode mergeLists(MyNode head1, MyNode head2) {
        MyNode  temp1 = head1;
        MyNode  temp2 = head2;
        MyNode  temp3;

        MyNode newHead;

        if (head1==null && head2 ==null) {
            return null;
        }
        if (head1 == null) {
            return head2;
        }
        if(head2==null) {
            return head1;
        }
        if (head1.value < head2.value) {
            newHead = head1;
            temp1 = head1.next;
        }
        else {
            newHead = head2;
            temp2 = head2.next;
        }
        temp3 = newHead;

        while (temp1 !=null && temp2 !=null) {
            if (temp1.value < temp2.value) {
                temp3.next = temp1;
                temp1 = temp1.next;
            }
            else {
                temp3.next = temp2;
                temp2 = temp2.next;
            }
            temp3 = temp3.next;
        }

        while(temp1 !=null) {
            temp3.next = temp1;
            temp3 = temp3.next;
            temp1 = temp1.next;
        }
        while (temp2 !=null) {
            temp3.next = temp2;
            temp3 = temp3.next;
            temp2 = temp2.next;
        }

        return newHead;

    }

    public static void main(String[] args) {
        LL1 l1 = new LL1();

        LL1 l2 = new LL1();
        l1.addFirst(1);
        l1.addLast(2);
        l1.addLast(9);
        l1.addLast(10);
        l1.addLast(17);

        l2.addFirst(4);
        l2.addLast(7);
        l2.addLast(8);
        l2.addLast(12);

        l1.printList();
        l2.printList();

        LL2 l3 = new LL2();
        MyNode newHead = l3.mergeLists(l1.head, l2.head);

        l2.printList(newHead);
    }
}
