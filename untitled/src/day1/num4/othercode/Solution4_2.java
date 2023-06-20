package day1.num4.othercode;

/////////////  for문 조건에 삼항 연산자를 활용하여  간단한 코드를 작성
public class Solution4_2 {
    public long solution(int a, int b) {
        long answer = 0;
        for (int i = ((a < b) ? a : b); i <= ((a < b) ? b : a); i++) // ((a < b) ? a : b) : a와 b중에 작은 수
                                                                     // ((a < b) ? b : a) : a와 b중에 큰 수
            answer += i;

        return answer;
    }
}
