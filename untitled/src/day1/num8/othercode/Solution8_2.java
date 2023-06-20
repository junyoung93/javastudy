package day1.num8.othercode;

////////// 스트림을 사용한 한줄풀이

import java.util.*;


class Solution8_2 {
    public double solution(int[] arr) {

        return Arrays.stream(arr).average().getAsDouble();
        // 1. arr배열을 스트림으로 변환
        // 2. average()를 호출하여 평균값 계산
        // 3. .getAsDouble()을 호출하여 평균값을 double 형태로 반환 => 이유 average()까지만 하면 streatm 타입이라 Double 타입으로 변환해줘야함 .
    }
}