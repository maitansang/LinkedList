package CauTrucDuLieu.ExerciseMyLinkedList;

public class MyLinkedList<E> {
    Node<E> head=null;
    Node<E> tail=null;
    private int numNode;

    public MyLinkedList(Object data) {
        head=new Node(data);
        tail=head;
    }
    public void addLast( E element){
        if(element!=null){
        tail.next=new Node<E>(element);
        tail=tail.next;
        }else System.out.println("element invalid");
        numNode++;
    }
    public void show(){
        Node<E> current=head;
        while (current!=null){
            System.out.println(current.getData());
            current=current.next;
        }
    }
    public void addFirst(E element){
        Node temp= new Node(element);
        temp.next= head;
        head= temp;
        numNode++;
        if (tail==null){
            tail= head;
        }
    }
    public boolean add(E element){
        if(element==null) return false;
        else{addLast(element);
        return true;
        }
    }
    public E removeFirst(){
        if(numNode==0) return null;
        else{
            Node<E> temp=head;
            head=head.next;
            numNode--;
            if(head==null) tail=null;
            return (E)temp.getData();
        }
    }
    public E removeLast(){
        if(numNode==0) return  null;
        else if(numNode==1){
            Node<E> temp=head;
            head=tail=null;
            numNode=0;
            return  (E)temp.getData();
        }
        else {
            Node<E> current=head;
            for (int i = 0; i < numNode-2 ; i++) {
                current=current.next;
            }
            Node <E> temp=tail;
            tail=current;
            tail.next=null;
            numNode--;
            return (E)temp.getData();
        }
    }
    public E remove (int index){
        if (index<0||index>=numNode) return  null;
        else if(index==0)return removeFirst();
        else if(index==numNode-1) return removeLast();
        else {
            Node<E> previous = head;
            for (int i = 1; i < index; i++) {
                previous = previous.next;
            }
            Node<E> current = previous.next;
            previous.next = current.next;
            numNode--;
            return (E) current.getData();
        }
    }
    public boolean remove(Object e){
        Node<E> holder=head;
        if(e==head.getData()) {
            remove(0);
        }
        if(e==null) return false;

        else{
            for (int i = 0; i <numNode ; i++) {

                holder=holder.next;

                if(holder.getData()==e){
                    remove(i+1); return  true;
                }
            }
        }
        System.out.println("khong co "+e+ " trong linkedList ");
        return false;
    }
    public boolean contains(Object o){
        if (o==null){
            return false;
        }else {
            Node<E> holder= head;
            for (int i = 0; i <numNode ; i++) {
                if(holder.getData()==o){
                    return true;
                }
                holder=holder.next;
            }
        } return false;
    }
    public E getFirst(){
        return (E)head.getData();
    }
    public E getLast(){
        return (E)tail.getData();
    }
    public int size(){
        return numNode;
    }
    public int indexOf(E o){
        boolean check =contains(o);
        if(check==false){
            System.out.println("khong ton tai "+o);
            return 0;
        }else {
            Node<E> holder= head;
            for (int i = 0; i < numNode; i++) {
                if(holder.getData()==o){
                    return i;
                } holder=holder.next;
            }
        }return 0;

    }
    public E clone (){
        MyLinkedList<E> myTempLinkedList= new MyLinkedList<>(head);
        myTempLinkedList.head=head;
        myTempLinkedList.tail=tail;
        myTempLinkedList.head=myTempLinkedList.tail;
        Node<E> holder = head;
        myTempLinkedList.numNode=numNode;
        for (int i = 0; i < numNode; i++) {
            myTempLinkedList.addLast((E) holder.next.getData());
        }
        return (E)myTempLinkedList;
    }
}
