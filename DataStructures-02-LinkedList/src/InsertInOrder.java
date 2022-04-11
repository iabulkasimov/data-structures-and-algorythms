public class InsertInOrder {
    public static void main(String[] args) {

        var myLinkedList = new CyberLinkedList();

        for (int i = 1; i < 11; i++) myLinkedList.addLast(i);
        myLinkedList.printLinkedList();
        System.out.println(myLinkedList);
        System.out.println(myLinkedList.first);
        System.out.println(myLinkedList.first.next);
        System.out.println(myLinkedList.first.values);
        System.out.println(myLinkedList.first.next.values);

        myLinkedList.insertInOrder(0);

        myLinkedList.printLinkedList();
    }
}
