package calculator;


import java.util.ArrayList;
import java.util.Scanner;

public class Refactoring {
    private final ArrayList<Character> operator = new ArrayList<>();
    private final ArrayList<Double> operand = new ArrayList<>();
    private static final Character PLUS = '+';
    private static final Character MINUS = '-';
    private static final Character MULTIPLY = '*';
    private static final Character DIVIDE = '/';

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputText = sc.nextLine();

        Refactoring refactoring = new Refactoring();
        System.out.println(refactoring.calculate(inputText));
    }

    /*
     * 1. 연산자에 순서를 부여
     * 2. 연산자에 따라 숫자를 계산
     * 어떻게 나눌지? -> 우선순위에 따라 연산 수행?
     * 1 + 2 * 3 - 4 / 5
     * 1 + 6 - 4 / 5
     * 1 + 6 - 0.8
     * 7 - 0.8
     * 6.2
     */

// 1. 배열을 탐색하여 적절한 순서의 연산자를 찾아 연산 수행하는 방법
// 기존의 방법 대로 반복문 2회 수행하여 곱연산, 나눗셈 연산을 먼저 수행하고 덧셈, 뺄샘 수행
// 곱셈, 나눗셈 연산 수행하는 메서드, 덧셈, 뺄샘 연산 수행하는 메서드를 만들어서 사용

// BigO 계산식
// 문자열의 길이 = n
// 연산자의 길이 = m
// 피연산자의 길이 = m + 1
// 연산자의 길이 + 피연산자 길이 = 문자열 길이
// fullTextParsing
// 내부적으로 String배열을 순회하며 O(n) ArrayList에 값을 추가하는 작업 O(1)을 하므로 O(n)
// calculateMultiplyAndDivide
// 연산자가 저장된 배열을 순회하며 O(m) 기존 피연산자 배열, 연산자 배열의 remove() 메서드를 실행 2O(m) 따라서 O(2m^2) = O(m^2)
// calculatePlusAndMinus
// 앞서 실행된 메서드로 인해 피연산자의 길이와 연산자의 길이가 줄어들었으므로 O((n-m)^2)
// 만약, 두 연산 메서드가 처리한 숫자의 갯수가 같다면 2O(n^2)
// 따라서 O(n) + 2O(n^2) = O(n^2)

    public Double calculate(String inputText) {
        fullTextParsing(inputText);
        operateMultiplyAndDivide();
        operatePlusAndMinus();
        return Math.round(operand.get(0) * 10000) / 10000.0;
    }

    private void operateMultiplyAndDivide() {
        for (int i = 0; i < operator.size(); ) {
            if (MULTIPLY.equals(operator.get(i))) {
                operand.set(i, operand.get(i) * operand.get(i + 1));
                operand.remove(i + 1);
                operator.remove(i);
            } else if (DIVIDE.equals(operator.get(i))) {
                operand.set(i, operand.get(i) / operand.get(i + 1));
                operand.remove(i + 1);
                operator.remove(i);
            } else {
                i++;
            }
        }
    }

    private void operatePlusAndMinus() {
        for (int i = 0; i < operator.size(); ) {
            if (PLUS.equals(operator.get(i))) {
                operand.set(i, operand.get(i) + operand.get(i + 1));
                operand.remove(i + 1);
                operator.remove(i);
            } else if (MINUS.equals(operator.get(i))) {
                operand.set(i, operand.get(i) - operand.get(i + 1));
                operand.remove(i + 1);
                operator.remove(i);
            } else {
                i++;
            }
        }
    }

    private void fullTextParsing(String inputText) {
        StringBuilder numberBuilder = new StringBuilder();

        for (int i = 0; i < inputText.length(); i++) {
            char currentChar = inputText.charAt(i);

            if (isValidOperator(currentChar)) {
                operator.add(currentChar);
                operand.add(Double.parseDouble(numberBuilder.toString()));
                numberBuilder.setLength(0);
            } else {
                numberBuilder.append(currentChar);
            }
        }
        operand.add(Double.parseDouble(numberBuilder.toString()));
    }

    private static boolean isValidOperator(Character ch) {
        return PLUS.equals(ch) || MINUS.equals(ch) || MULTIPLY.equals(ch) || DIVIDE.equals(ch);
    }
}