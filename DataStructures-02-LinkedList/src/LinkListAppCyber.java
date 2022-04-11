public class LinkListAppCyber {
    public static void main(String[] args) {
        var cyLinkList = new CyberLinkedList();
        cyLinkList.addLast(1);
        cyLinkList.addLast(2);
        cyLinkList.addLast(3);

        cyLinkList.printLinkedList();
        System.out.println();
        cyLinkList.deleteLast();
        cyLinkList.printLinkedList();

        var reverseList = new CyberLinkedList();
        for (int i = 1; i < 11; i++) reverseList.addLast(i);

        System.out.println("Initial Linked List");
        reverseList.printLinkedList();

        System.out.println("Linked List after reverse in one pass");
        reverseList.reverse();
        reverseList.printLinkedList();

        System.out.println(reverseList.getKthFromTheEnd(3));

        reverseList.printMiddle();

    }
}
