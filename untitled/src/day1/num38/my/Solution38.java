package day1.num38.my;

public class Solution38 {
    public int solution(String s) {
        int answer = 0;
        String[] numbers = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        for(int i=0; i<10; i++){
            s= s.replace(numbers[i], Integer.toString(i)); // repalce 매서드를 사용해서 말그대로 문자열을 숫자로 바꿈
        }

        answer = Integer.parseInt(s); // int형으로 변환

        return answer;
    }
}
