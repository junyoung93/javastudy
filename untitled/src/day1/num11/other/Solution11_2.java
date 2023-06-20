package day1.num11.other;

// 코드가 간단해서 가져와봄. 이전 인덱스에 접근하는 방식
public class Solution11_2 {
    public static long[] solution(int x, int n) {
        long[] answer = new long[n];
        answer[0] = x;

        for (int i = 1; i < n; i++) {
            answer[i] = answer[i - 1] + x; // x를 점차 더한값을 넣어야 하므로 이전 인덱스에 접근해서 +x
        }

        return answer;

    }
}
