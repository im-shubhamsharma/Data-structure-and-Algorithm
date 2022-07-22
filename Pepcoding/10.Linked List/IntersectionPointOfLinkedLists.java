import java.util.*;

public class IntersectionPointOfLinkedLists {
    private static class Node {
        int data;
        Node next;

        Node() {
            data = 0;
            next = null;
        }

        Node(int data) {
            this.data = data;
            next = null;
        }

        Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    private static class LinkedList {
        Node head, tail;
        int size;

        LinkedList() {
            Node head = null, tail = null;
            int size = 0;
        }

        public void addFirst(int val) {
            Node node = new Node(val);

            if (size == 0) {
                this.head = this.tail = node;
            } else {
                node.next = this.head;
                this.head = node;
            }
            this.size++;
        }

        public int size() {
            return this.size;
        }

        public static int findIntersection(LinkedList one, LinkedList two) {
            // write your code here
            int size1 = one.size();
            int size2 = two.size();

            Node p1 = one.head;
            Node p2 = two.head;

            int diff;

            if (size1 > size2) {
                diff = size1 - size2;
                while (diff != 0) {
                    p1 = p1.next;
                    diff--;
                }
            } else {
                diff = size2 - size1;
                while (diff != 0) {
                    p2 = p2.next;
                    diff--;
                }
            }

            while (p1 != p2) {
                p1 = p1.next;
                p2 = p2.next;
            }

            return p1.data;

        }
    }
}
