package day1.num12.other;

// 잊고 살았던 n * (n+1) /2 등차수열 공식을 활용한 풀이
public class Solution12_2 {
    public long solution(long price, long money, long count) {

        // 1~count 까지의 합을 등차수열의 합 공식을 사용해서 미리 더해주고 price를 곱해서 전체 비용을 계산하는 방식
        // 해당 값에서 money를 뺴주고 0과의 대소 비교를 통해서 값 return
        return Math.max(price * (count * (count + 1) / 2) - money, 0);

    }
}
