package org.example.linkedList;

public class LL8 {

    public MyNode reverseK(MyNode head, int k) {
        if (head == null || head.next == null || k == 0) {
            return null;
        }
//        |    ||        |    ||
//        1 -> 2 -> 3 -> 4 -> 5- > 6 -> 7 -> 7-> 8 -> 9
//        3 -> 2 -> 1 -> 6 -> 5 -> 4
        MyNode prev = null;
        MyNode curr = head;
        MyNode next = head.next;
        MyNode kNodeList = null;
        MyNode newListTemp;
        int index = k;
        while(curr != null) {
            curr = curr.next;
            if (k > 0 ) {

//                reverse the list
            }
        }
        return null;
    }


    public static void main(String[] args) {

    }
}
