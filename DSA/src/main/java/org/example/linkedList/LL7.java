package org.example.linkedList;

public class LL7 {

    public  MyNode oddEvenList(MyNode head) {
        MyNode temp = head;
        MyNode oddHead = null;
        MyNode evenHead = null;
        MyNode evenTemp = null;
        MyNode oddTemp = null;
        while(temp !=null) {
            if (temp.value % 2 == 0) {
                if (evenHead == null) {
                    evenHead = temp;
                    evenTemp = evenHead;
                }
                else {
                    evenTemp.next = temp;
                    evenTemp = evenTemp.next;
                }
            } else {
                if (oddHead == null) {
                    oddHead = temp;
                    oddTemp = oddHead;
                }
                else {
                    oddTemp.next = temp;
                    oddTemp = oddTemp.next;
                }
            }
            temp = temp.next;
        }
        if (oddHead == null) {
            return evenHead;
        }
        if (evenHead != null) {
            evenTemp.next = null;
        }
        head = oddHead;
        oddTemp.next = evenHead;
        return head;
    }
    public static void main(String[] args) {
        LL7 l = new LL7();
        LL1 ll = new LL1();

//        MyNode head = ll.createList(15);
//        ll.addFirst(12);
//        ll.addLast(12);
//        ll.addLast(12);
//        ll.addLast(12);
//        ll.addLast(12);
//        ll.addLast(12);
//        ll.addLast(12);
//        ll.addLast(12);

//        ll.addFirst(3);
//        ll.addLast(5);
//        ll.addFirst(3);
//        ll.addLast(5);
//        ll.addFirst(3);
//        ll.addLast(5);
//        ll.addFirst(3);
//        ll.addLast(5);
//        ll.addFirst(3);
//        ll.addLast(5);
        MyNode head = ll.head;
        ll.printList(head);

        MyNode newHead = l.oddEvenList(head);
        ll.printList(newHead);
    }
}
