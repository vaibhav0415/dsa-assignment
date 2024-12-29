import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner  sc=new Scanner(System.in);
        String s=sc.next();
        System.out.print(calculate(s));
        
    }
public static int calculate(String s) {
         if (s == null || s.isEmpty()) return 0;
        Stack<Integer> stack = new Stack<>();
        int num = 0;
        char sign = '+';
        for (int i = 0; i < s.length(); i++) {
            char ch=s.charAt(i);
            if (Character.isDigit(ch)) {
                num = num * 10 + s.charAt(i) - '0';
            }
            if ((!Character.isDigit(ch) && ' ' != ch) || i == s.length() - 1) {
                if (sign == '-') {
                    stack.push(-num);
                }
                if (sign == '+') {
                    stack.push(num);
                }
                if (sign == '*') {
                    stack.push(stack.pop() * num);
                }
                if (sign == '/') {
                    stack.push(stack.pop() / num);
                }
                sign = ch;
                num = 0;
            }
        }

        int result = 0;
        for (int i : stack) {
            result += i;
        }
        return result;
    }
}