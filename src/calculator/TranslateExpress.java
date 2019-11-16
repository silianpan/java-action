package calculator;

import java.util.Stack;


public class TranslateExpress {
    //转变成后缀表达式
    private Stack<Character> stack = new Stack<Character>();

    public boolean translateExpress(char[] str, char[] exp) {
        int i = 0, j = 0;
        char ch;
        ch = str[i];

        //System.out.println(str.length - 1);
        while (i <= str.length - 1) {
            switch (ch) {
                case '+':
                case '-':
                case '*':
                case '/':

                    if (str.length > 2) {
                        if (ch == '/' && str[i + 1] == '0' && str[i + 2] != '.')
                            return false;
                    }

                    if (ch == '/' && str[i + 1] == '0' && str.length == 2) {
                        System.out.println("###");
                        return false;
                    }

                    if (ch == '+' && str[i + 1] == '-') {
                        ch = '-';
                        i++;
                    }

                    if (ch == '-' && str[i + 1] == '-') {
                        ch = '+';
                        i++;
                    }

                    if (stack.empty())
                        stack.push(ch);
                    else if (isOperHeigh(stack.peek(), ch)) {
                        exp[j] = stack.pop();
                        j++;
                        stack.push(ch);
                    } else {
                        stack.push(ch);
                    }

                    break;

                case '~':
                    exp[j++] = ch;
                    break;

                default:
                    while ((ch >= '0' && ch <= '9') || ch == '.') {
                        exp[j++] = ch;
                        i++;
                        if (i <= str.length - 1)
                            ch = str[i];
                        else
                            break;
                    }
                    i--;
                    exp[j++] = ' ';
                    break;
            }

            i++;
            if (i <= str.length - 1)
                ch = str[i];
            else
                break;
        }

        while (!stack.empty()) {
            exp[j] = stack.pop();
            j++;
        }

        exp[j] = '\0';
        return true;
    }

    //判断优先级
    public boolean isOperHeigh(char stack_ch, char exp_ch) {
        if ((stack_ch == '/' || stack_ch == '*') && (exp_ch == '+' || exp_ch == '-'))
            return true;
        return false;
    }
}
