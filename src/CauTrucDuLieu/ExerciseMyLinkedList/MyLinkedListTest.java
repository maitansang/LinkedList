package CauTrucDuLieu.ExerciseMyLinkedList;

public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList<String> myLinkedList= new MyLinkedList<String>("Sang");
        myLinkedList.addLast("Loc");
        myLinkedList.addFirst("Van");
        myLinkedList.addLast("Son");
        myLinkedList.addLast("Vu");
        myLinkedList.addFirst("Dung");
        myLinkedList.addLast("Hoang");

        myLinkedList.show();
        System.out.println("-----------------");
        myLinkedList.remove(2);
//        myLinkedList.remove(0);//xem lại
//        myLinkedList.remove(5);// xem lại
        myLinkedList.show();
        System.out.println("===test remove Object e===");
        myLinkedList.remove("Dung");// xem lại remove tai vi tri first;
        System.out.println();
        myLinkedList.show();
        System.out.println("======test tail head======");
        System.out.println("tail is "+myLinkedList.tail.getData());
        System.out.println("head  is "+myLinkedList.head.getData());
        System.out.println("=========test contain========");
        System.out.println("contain "+" is "+myLinkedList.contains("Son") );
        System.out.println("=========test indexOf");
        System.out.println("index of Son is "+myLinkedList.indexOf("Son"));
        System.out.println("=========test clone========");
        MyLinkedList<String > myLinkedListClone= myLinkedList;
        myLinkedListClone.show();
    }
}
