package CauTrucDuLieu.Stack.KiemTraNgoac;

import java.util.Stack;

public class KiemTraNgoac {
    public static void main(String[] args) {
        String string = "((()) () (()())())()";
      boolean check= checkBalanced(string);
      if(check){
          System.out.println("đúng");
      }else System.out.println("sai");
    }

    public static boolean checkBalanced(String check)
    {
        Stack<Character> S = new Stack<Character>();
        for(int a = 0; a < check.length(); a++)
        {
            char let = check.charAt(a);
            if( let == '(')
                S.push(let);
            else if( let == ')')
            {
                if(S.empty())
                    return false;
                if(let==')'){
                    if(S.pop()!='(')
                    return false;
                }
            }
        }
        if(S.empty())
            return true;
        return false;
    }
}


