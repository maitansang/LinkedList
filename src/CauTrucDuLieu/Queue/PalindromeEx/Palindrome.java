package CauTrucDuLieu.Queue.PalindromeEx;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Palindrome {
    public static void main(String[] args) {
        String string="Able was i ere i saw Elba";
        System.out.println(string);
        int dem=0;
        System.out.println(string.length());
        String temp= string.toLowerCase();

        Stack<Character> stack=new Stack<>();
        Queue<Character> queue= new ArrayDeque<>();

        queue = new ArrayDeque<>();
        for (int i = 0; i <temp.length() ; i++) {
            stack.push(temp.charAt(i));
            queue.add(temp.charAt(i));
        }
        System.out.println();
        while(!stack.empty()){
            if(stack.pop()==queue.poll()){
                dem++;
            }
        }

        if (dem==string.length()){
            System.out.println("is palindrome");
        }else System.out.println("is not palindrome");
    }
}
