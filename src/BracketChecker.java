import java.util.Stack;

public class BracketChecker {
    public static boolean checkBrackets(String expression){
        Stack<Character> stack = new Stack<>();

        for (char symbo1 : expression.toCharArray()){
            if (symbo1 == '(' || symbo1 == '[' || symbo1 == '{'){
                stack.push(symbo1);
            } else if (symbo1 == ')' || symbo1 == ']' || symbo1 == '}'){
                if (stack.isEmpty()){
                    return false;
                }

                char left = stack.pop();
                if ((symbo1 == ')' &&  left != '(') ||
                        ( symbo1 == ']' && left != '[') ||
                        (symbo1 == '}' && left != '{')){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String expression1 = "s * (s - a) * (s - b) * (s - c)";
        String expression2 = "( - b + (b2 - 4*a*c)^0.5 ) / 2*a";
        String expression3 = "s * (s - a) * (s - b * (s - c)";
        String expression4 = "s * (s - a) * s - b) * (s - c)";
        String expression5 = "( - b + (b^2 - 4*a*c)^(0.5/ 2*a))";

        System.out.println(expression1 + " → " + (checkBrackets(expression1) ? "Well" : "Not well"));
        System.out.println(expression2 + " → " + (checkBrackets(expression2) ? "Well" : "Not well"));
        System.out.println(expression3 + " → " + (checkBrackets(expression3) ? "Well" : "Not well"));
        System.out.println(expression4 + " → " + (checkBrackets(expression4) ? "Well" : "Not well"));
        System.out.println(expression5 + " → " + (checkBrackets(expression5) ? "Well" : "Not well"));
    }

}
