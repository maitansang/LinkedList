package CauTrucDuLieu.ExerciseMyLinkedList;

public class Node<E> {
     Node<E> next;
     Object data;
    public Node (E data){
        this.data= data;
    }
    public Object getData(){
        return  data;
    }
}
