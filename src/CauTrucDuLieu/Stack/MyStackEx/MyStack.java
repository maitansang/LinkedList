package CauTrucDuLieu.Stack.MyStackEx;

public class MyStack {
    private int arr[];
    private int size;
    private int index=0;

    public MyStack(int size){
        this.size=size;
        arr= new int [size];
    }
    public int pop() throws Exception{
        if(isEmpty()){
            throw new StackOverflowError("Stack is null");
        }
        return arr[--index];
    }

    public boolean isEmpty() {
        if(index==0){
            return true;
        }
        return false;
    }
    public int size(){
        return index;
    }
    public  void push(int element){
        if(isFull()){
            throw new StackOverflowError("Stack is full");
        }
        arr[index]= element;
        index++;
    }

    private boolean isFull() {
        if(index==size){
            return  true;
        }
        return false;
    }
}
