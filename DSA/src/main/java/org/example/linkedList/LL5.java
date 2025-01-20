package org.example.linkedList;

public class LL5 {
    public MyNode deleteNNodes(MyNode head, int m, int n) {
        if (m == 0 && n ==0 || head == null) {
            return head;
        }
        if (m==0) {
            return null;
        }
        if (n==0) {
            return head;
        }
        MyNode temp = head;
        MyNode prev = null;
        int keep = m;
        int del = n;
        while (temp != null) {
            if (keep>0) {
                prev = temp;
                keep--;
            }
            temp = temp.next;
            if (keep==0 && del>=0) {
                del--;
            }
            if ((keep==0 && del ==-1 )|| temp == null) {
                if (prev == null)  {
                    head = temp;
                }
                else {
                    prev.next = temp;
                }
                keep = m;
                del = n;
            }
        }

        return head;
    }
    public static void main(String[] args) {
        LL1 ll = new LL1();
        MyNode head = ll.createList(20);
        ll.printList(head);
        LL5 l5 = new LL5();
       var newHead =  l5.deleteNNodes(head, 0, 3);
        ll.printList(newHead);
    }
}
