package org.example.linkedList;

import java.util.Random;

public class LL1 {
    MyNode head;

    public void addFirst(int value) {
        MyNode n1 = new MyNode(value);
            n1.next = head;
            head = n1;
    }

    public void addLast(int value) {
        MyNode n = new MyNode(value);
        if (head == null) {
            head = n;
            return;
        }
        MyNode temp = head;
        while (temp.next !=null) {
            temp = temp.next;
        }
        temp.next= n;
    }

    public void addInMiddle(int value, int n) {
        MyNode newNode = new MyNode(value);
        MyNode temp = head;
        if (head == null) {
            addFirst(value);
            return;
        }
        int index = 1;
        while(index<=n-2 && temp.next !=null) {
            temp = temp.next;
            index ++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void deleteFirst() {
        head = head.next;
    }

    public void deleteLast() {
        MyNode temp = head;
        if (head == null) {
            return;
        }
        while (temp.next.next!=null) {
            temp = temp.next;
        }
        temp.next = null;
    }

    public void deleteMiddle(int n) {
        MyNode temp = head;
        if (temp == null) {
            return;
        }
        int index = 1;
        while(index <=n-2 && temp.next!=null) {
            temp = temp.next;
            index++;
        }
        if (temp.next==null) {
            return;
        }
        temp.next = temp.next.next;
    }

    public MyNode createList(int n) {
        Random random = new Random();
     head = new MyNode(random.nextInt(100));
     head.next = new MyNode(random.nextInt(100));
     MyNode temp = head.next;
        while(n > 2) {
            temp.next = new MyNode(random.nextInt(100));
            temp = temp.next;
            n--;
        }
        return head;
    }


    //delete a value from Linked List
    public MyNode deleteVal(int val, MyNode head) {
        if (head == null) {
            return null;
        }
        MyNode prev = null;
        MyNode curr = head;
        MyNode next = head.next;
        while(curr !=null) {
            if(curr.value == val) {
                if (prev!=null) {
                    prev.next = next;
                }
                else {
                    head = next;
                }
            }
            else {
                prev = curr;
            }
            curr = next;
            if (next !=null) {
                next = next.next;
            }
        }
        return head;
    }

    public void printList() {

        MyNode temp = head;
        while(temp != null) {
            System.out.print(temp.value + ", ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void printList(MyNode head) {

        MyNode temp = head;
        while(temp != null) {
            System.out.print(temp.value + ", ");
            temp = temp.next;
        }
        System.out.println();
    }



    public static void main(String[] args) {
        LL1 l = new LL1();
        l.addFirst(1);
        l.addLast(2);
        l.addLast(4);
        l.addLast(5);
        l.addLast(6);

        l.printList();

        l.addInMiddle(3, 3);
        l.printList();

        l.deleteFirst();
        l.printList();

        l.deleteLast();
        l.printList();

        l.deleteMiddle(4);
        l.printList();

        l.addFirst(4);
        l.addInMiddle(4, 3);
        l.addLast(4);
        l.printList();

        l.deleteVal(4, l.head);
        l.printList();
    }
}
