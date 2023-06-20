package day1.num30.other;


// 나와 풀이 방식은 같으나 max,min연산으로 깔끔하게 코드를 작성했다.

public class Solution30_2 {
    public int solution(int[][] sizes) {
        int length = 0, height = 0;
        for (int[] card : sizes) {
            length = Math.max(length, Math.max(card[0], card[1])); // 긴부분중에 가장 긴것
            height = Math.max(height, Math.min(card[0], card[1])); // 짧은 부분중에 가장 긴것
        }

        int answer = length * height;
        return answer;
    }
}
