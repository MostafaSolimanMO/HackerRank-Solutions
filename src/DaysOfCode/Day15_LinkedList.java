package DaysOfCode;

import java.util.Scanner;

public class Day15_LinkedList {
    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    class Solution {

        public Node insert(Node head, int data) {
            if (head == null) return new Node(data);
            else if (head.next == null) head.next = new Node(data);
            else insert(head.next, data);
            return head;
        }

        public void display(Node head) {
            Node start = head;
            while (start != null) {
                System.out.print(start.data + " ");
                start = start.next;
            }
        }

        public void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            Node head = null;
            int N = sc.nextInt();

            while (N-- > 0) {
                int ele = sc.nextInt();
                head = insert(head, ele);
            }
            display(head);
            sc.close();
        }
    }
}

