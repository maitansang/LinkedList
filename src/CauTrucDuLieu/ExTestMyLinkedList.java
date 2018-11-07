package CauTrucDuLieu;

public class ExTestMyLinkedList {
    public static void main(String[] args) {
        System.out.println("--------------TESTING---------");
        ExMyLinkedList ll=new ExMyLinkedList(10);


        ll.add(4,9);
        ll.add(4,9);
        ll.addFirst(11);
        ll.addFirst(12);
        ll.addFirst(13);
        ll.printList();
    }
}
