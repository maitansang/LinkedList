package CauTrucDuLieu.Stack.MyStackEx;

public class StackClient {
    public static void main(String[] args) throws Exception {
        MyStack myStack= new MyStack(5);
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        myStack.push(5);
        while(!myStack.isEmpty()){
            System.out.println(myStack.pop());
        }
        System.out.println("After pop then size is "+myStack.size());
    }
}
