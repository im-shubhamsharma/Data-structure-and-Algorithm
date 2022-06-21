public class IntersectionPointOfLinkedLists {
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
