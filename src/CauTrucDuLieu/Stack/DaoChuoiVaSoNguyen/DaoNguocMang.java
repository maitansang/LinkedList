package CauTrucDuLieu.Stack.DaoChuoiVaSoNguyen;

import java.util.Stack;

public class DaoNguocMang {
    public static void main(String[] args) {
        int []temp=new  int[5];
        Stack<Integer > daoNguocMang= new Stack<>();
        temp[0]=1;
        temp[1]=2;
        temp[2]=3;
        temp[3]=4;
        temp[4]=5;
        for (int i = 0; i < temp.length; i++) {
            daoNguocMang.push(temp[i]);
        }
        System.out.println(daoNguocMang);
        System.out.println("===========");
        for (int i = 0; i < 5 ; i++) {
            temp[i]=daoNguocMang.pop();
        }
        for (int i=0;i<5;i++){
            daoNguocMang.push(temp[i]);
        }
        System.out.println(daoNguocMang);
        System.out.println("===========");
        daoChuoi("mai tan sang");

    }

    public static void daoChuoi(String w) {
        Stack<Character> wStack = new Stack<>();
        String [] words =w.split("\\s");
        for (int i = 0; i <words.length ; i++) {
            for (int j = 0; j <words[i].length() ; j++) {
                wStack.push(words[i].charAt(j));
            }
            while(!wStack.empty()){
                System.out.print(wStack.pop());
            }
            System.out.print(" ");
        }
    }
}
