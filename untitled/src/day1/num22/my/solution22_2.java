package day1.num22.my;

//나머지연산, 나누기 연산을 활용한 풀이
public class solution22_2 {
    public int solution(int n) {
        int answer = 0;

        while (n != 0) {
            answer += n % 10;
            n /= 10;
        }

        return answer;
    }
}
