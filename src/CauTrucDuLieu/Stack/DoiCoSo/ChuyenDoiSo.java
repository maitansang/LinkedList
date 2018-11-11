package CauTrucDuLieu.Stack.DoiCoSo;

import java.util.Stack;

public class ChuyenDoiSo {
    public static void main(String[] args) {
        int dec=111;
        int binary=10100;

        toBinary(dec);
        toHexadecimal(dec);
    }


    public static void toBinary(int dec) {
        int temp=dec;
        Stack<Integer> stack= new Stack<>();
        while (temp!=0){
            stack.push(temp%2);
            temp=temp/2;

        }
        while (!stack.empty()){
            System.out.print(stack.pop());
        }

    }
    public static String toHexadecimal(int dec) {
        int temp=dec;
        Stack<Integer> nStack= new Stack<>();
        while (temp!=0){
            int k=temp%16;
            nStack.push(k);
            temp=temp/16;
        }
        while (!nStack.empty()){

            switch (nStack.peek()){
                case 10:
                    nStack.pop();
                    System.out.println('A');break;
                case 11:
                    nStack.pop();
                    System.out.println('B');break;
                case 12:
                    nStack.pop();
                    System.out.println('C');break;
                case 13:
                    nStack.pop();
                System.out.println('D');break;
                case 14:
                    nStack.pop();
                    System.out.println('E');break;
                case 15:
                    nStack.pop();
                    System.out.println('F');break;
                default:
                    System.out.print("\n"+nStack.pop());
            }
        }

        return null;
    }
}
