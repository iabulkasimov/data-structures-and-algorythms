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
    }
}
