package calculator;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * Todo 계산기 구현
 * 문자열을 1줄로 입력받아 계산하는 프로그램을 만들어보세요.
 * 입력받는 문자열은 연산자와 숫자가 번갈아가며 들어옵니다.
 * 연산순서 구현
 * 입력예시: 1+2*3-4/5
 * 출력: 6.2
 * 제한사항
 * 1. 문자열을 반드시 한줄로 입력받습니다.
 * 2. 연산자는 +, -, *, / 만 입력됩니다.
 * 3. 숫자나 연산자 이외의 문자는 입력되지 않습니다.
 * 4. 공백 문자는 입력되지 않습니다.
 * 5. 음수는 입력되지 않습니다.
 * */
public class IfStatement {
    private String num = "";
    private final ArrayList<String> equation = new ArrayList<>();

    public static void main(String[] args) {
        IfStatement ifStatement = new IfStatement();
        Scanner sc = new Scanner(System.in);
        String inputText = sc.nextLine();
        System.out.println(ifStatement.calculate(inputText));
    }

    private void fullTextParsing(String inputText) {

        for (int i = 0; i < inputText.length(); i++) {
            char ch = inputText.charAt(i);

            if (ch == '-' || ch == '+' || ch == '*' || ch == '/') {
                equation.add(num);
                num = "";
                equation.add(ch + "");
            } else {
                num = num + ch;
            }
        }
        equation.add(num);
        equation.remove("");
    }

    public double calculate(String inputText) {
        fullTextParsing(inputText);

        double prev = 0;
        double current = 0;
        String mode = "";

        for (int i = 0; i < equation.size(); i++) {
            String s = equation.get(i);

            if (s.equals("+")) {
                mode = "add";
            } else if (s.equals("-")) {
                mode = "sub";
            } else if (s.equals("*")) {
                mode = "mul";
            } else if (s.equals("/")) {
                mode = "div";
            } else {
                if ((mode.equals("mul") || mode.equals("div")) && !s.equals("+") && !s.equals("-") && !s.equals("*") && !s.equals("/")) {
                    Double one = Double.parseDouble(equation.get(i - 2));
                    Double two = Double.parseDouble(equation.get(i));
                    Double result = 0.0;

                    if (mode.equals("mul")) {
                        result = one * two;
                    } else if (mode.equals("div")) {
                        if(two == 0){
                            result = Double.POSITIVE_INFINITY;
                        }else {
                            result = one / two;}
                    }
                    equation.add(i + 1, Double.toString(result));

                    for (int j = 0; j < 3; j++) {
                        equation.remove(i - 2);
                    }

                    i -= 2;
                }
            }
        }
        boolean subtract = false;
        for (String s : equation) {
            if (s.equals("+")) {
                mode = "add";
            } else if (s.equals("-")) {
                mode = "sub";
            } else {
                current = Double.parseDouble(s);

                if (subtract) {
                    prev -= current;
                } else {
                    prev += current;
                }
            }
            prev = Math.round(prev * 100000) / 100000.0;
        }
        return prev;
    }
}