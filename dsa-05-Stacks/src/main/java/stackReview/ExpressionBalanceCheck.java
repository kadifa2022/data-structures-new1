package stackReview;

public class ExpressionBalanceCheck {
    public static void main(String[] args) {

        System.out.println(balanceCheck("(a+b) + {b+a}"));


    }
     public static boolean balanceCheck(String expr) {

         //Create stack -> this is my implementation of stack that's why i called them myStack
         MyStack<Character> myStack = new MyStack<>();
         // iterate over expression
         for (int i = 0; i < expr.length(); i++) {
             Character ch = expr.charAt(i);
             // filter non player chars// a+b
             if (ch != '(' && ch != '[' && ch != '{' && ch != ')' && ch != ']' && ch != '}') continue;
             // if it is a symbol to be processed
             // if(opening symbols push it to the stack
             if (ch == '(' || ch == '[' || ch == '{') {
                 myStack.push(ch);
                 continue;

             }
             // stack shouldn't be empty
             if (myStack.isEmpty()) return false;
             switch (ch) {
                 case ')':
                     if (myStack.pop() != '(') return false;
                     break;
                 case ']':
                     if (myStack.pop() != '[') return false;
                     break;
                 case '}':
                     if (myStack.pop() != '{') return false;
                     break;
             }
         }
         // end of for
         // return if stack is empty
         return myStack.isEmpty();
    }

}
