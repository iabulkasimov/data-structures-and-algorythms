import java.util.NoSuchElementException;

public class CyberLinkedList {
    public class Node{
        public int values;
        public Node next;

        public Node(int values) {
            this.values = values;
            this.next = null;
        }
    }
    public Node first;
    public Node last;
    public int size;

    public CyberLinkedList() {
        this.first=null;
        this.last=null;
        this.size=0;
    }

    public boolean isEmpty(){
        return first==null;
    }

    public void addLast(int item){
        var node = new Node(item);
        System.out.println("adding an item:" + item);
        if (isEmpty()) first=last=node;
        else{
            last.next=node;
            last=node;
        }
        size++;
    }

    public void insertInOrder(int item){
        var node = new Node(item);
        Node current;
//        System.out.println("adding an item:" + item);
        if (isEmpty())
            first=last=node;
        else if (item <= first.values){
            node.next = first;
            first = node;
//            last.next=node;
//            last=node;
        } else {
            current = first;
            while ((current.next!=null) && (node.values > current.next.values))
                current = current.next;
            if (current.next==null){
                current.next = node;
                last = node;
            } else {
                node.next = current.next;
                current.next = node;
            }
        }
        size++;
    }

    public void deleteLast(){
        if (isEmpty()) throw new NoSuchElementException();
        System.out.println("deleting the item from the last:");
        if (first==last) first=last=null;
        else{
            var previous=first;
            var current =first;
            while (current.next!=null){
                previous=current;
                current=current.next;
            }
            previous.next=null;
            last=previous;
        }
        size--;
    }

    public void printLinkedList(){
        if (isEmpty()) throw new NoSuchElementException();
        var current=first;
        while (current!=null){
            System.out.println("Value :" +current.values);
            current=current.next;
        }
    }

    public void reverse(){
        var prev = first;
        var current = first.next;

        while (current!=null){
            var nextNode = current.next;
            current.next=prev;
            prev=current;
            current=nextNode;
        }
        last = first;
        last.next= null;
        first=prev;
    }

    public int getKthFromTheEnd(int k){
        var a = first;
        var b = first;
        for (int i = 0; i < k-1; i++) {
            b = b.next;
        }
        while (b!=last){
            a=a.next;
            b=b.next;
        }
        return a.values;
    }

    public void printMiddle() {
        if (isEmpty()) throw new IllegalStateException();
        var a = first;
        var b = first;
        while (b != last && b.next != last){
            b = b.next.next;
            a = a.next;
        }
        if (b==last) System.out.println(a.values);
        else System.out.println(a.values + ", " + a.next.values);
    }

}
