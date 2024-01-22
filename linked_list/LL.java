package com.company.linked_list;

public class LL {

    public static void main(String[] args) {

        SingleNode fourth = new SingleNode(3, null);
        SingleNode third = new SingleNode(2, fourth);
        SingleNode second = new SingleNode(1, third);
        SingleNode first = new SingleNode(0, second);

        printLL(first);
        deleteNode(first, 2);
        printLL(first);

    }

    private static void deleteNode(SingleNode first, int i) {

        if (first == null || first.next == null)
            return;

        while (i != 1) {
            first = first.next;
            i--;
        }

        first.next = first.next.next;
    }


    static void printLL(SingleNode head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }


}


