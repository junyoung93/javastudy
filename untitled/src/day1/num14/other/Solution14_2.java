package day1.num14.other;

import java.util.Arrays;
///// 람다 함수를 사용한 한줄풀이

public class Solution14_2 {
    public int[] divisible(int[] array, int divisor) {
        // stream으로 array 배열을 스트림으로 변환.
        // filter매서드를 통해 divsor로 나누어서 0이되는 부분만 걸러줌.
        // filter에서 끝내면 stream 타입이므로 toArray() 매서드를 통해 배열로 변환후 리턴

        return Arrays.stream(array).filter(factor -> factor % divisor == 0).toArray();
    }
}
