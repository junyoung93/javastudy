package day1.num15.other;

import java.util.stream.IntStream;

// 스트림 , 람다를 사용한 풀이

public class Solution15_2 {
    public int solution(int[] a, int[] b) {

        // IntStream.range(0, a.length) 를 통해 길이가 a.length인 스트림을 우선적으로 생성
        // .map(index -> a[index] * b[index])를 사용하여 각 인덱스에 대해 a와 b 배열의 요소를 곱한 값을 매핑
        // sum() 으로 스트림 요소들의 합을 반환
        return IntStream.range(0, a.length).map(index -> a[index] * b[index]).sum();
    }
}
