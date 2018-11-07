package CauTrucDuLieu;

import java.util.ArrayList;

public class MyListTest {
    public static void main(String[] args) {
        MyList<String> myList = new MyList<String>(6);
        myList.add(0, "ádff");
        myList.add(1, "bbbf");
        myList.add(2, "cccf");
        myList.add(3, "ddf");
        myList.add(4, "eeeff");
        myList.add(5, "33333333");
        System.out.println("--------------list-------------");
        for (int i = 0; i < myList.size(); i++) {
            System.out.println("element " + i + " is " + myList.elements[i]);
        }
        System.out.println("------------test remove --------------");

        System.out.println("element 2 :" + myList.remove(2) + " da bi xoa");

        for (int i = 0; i < myList.size(); i++) {
            System.out.println("element " + i + " is: " + myList.elements[i]);
        }

        System.out.println("------------ test clone  --------------");
        MyList<String> myListClone = (MyList) myList.clone();
        for (int i = 0; i < myListClone.elements.length; i++) {
            System.out.println("element clone " + i + " is " + myListClone.elements[i]);
        }
        System.out.println("------------test indexOf --------------");
        System.out.println("indexOf " + "ddf is " + myList.indexOf("ddf"));
        System.out.println("------------ test get E --------------");
        System.out.println("element 2 is " + myList.get(2));

        System.out.println("------------test boolean add --------------");
        System.out.println("after add element ");
        System.out.println(myList.add("add"));
        for (int i = 0; i < myList.size(); i++) {
            System.out.println("element " + i + " is " + myList.elements[i]);
        }

        System.out.println("------------ test contains --------------");

        boolean check = myList.contains("ádff");
        if(check==true){
            System.out.println("co phan tu ádff");
        }else System.out.println("khong co phan tu ddf");
        System.out.println("------------ test ensureCapacity --------------");
        myList.ensureCapacity(10);
        System.out.println("so phan tu la"+ myList.elements.length);
        myList.add(5,"123");
        myList.add(6,"222");
        myList.add(7,"333");
        myList.add(8,"4443");
        for (int i = 0; i < myList.size(); i++) {
            System.out.println("element " + i + " is " + myList.elements[i]);
        }
        System.out.println("------------ test clear --------------");
        myList.clear();
        System.out.println("so phan tu cua myList sau khi clear la " + myList.size());
        for (int i = 0; i < myList.size(); i++) {
            System.out.println("element " + i + " is: " + myList.elements[i]);
        }


    }
}
