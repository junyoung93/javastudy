package day1.num28.other;

///////////string을 사용한 풀이
public class Solution28_2 {
    public boolean solution(int num) {
        //스트링 배열로 변환
        String[] tmp = Integer.toString(num).split("");

        int sum = 0;

        //자릿수를 각각 더해줌
        for (String s : tmp) {
            sum += Integer.parseInt(s);
        }

        if (num % sum == 0) { // 히샤드인지 검사
            return true;
        } else {
            return false;
        }
    }
}
