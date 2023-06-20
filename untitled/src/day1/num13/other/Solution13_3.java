package day1.num13.other;

import java.time.LocalDate;

// LocalDate 메서드를 사용
public class Solution13_3 {

    public String solution(int a, int b) {
        // LocalDate.of 메서드를 사용해서 실제 2016년 a월 b일의 LocalDate 객체를 생성합니다.
        // .getDayOfWeek()로 해당 날짜의 요일을 가져옵닏.
        // toString().substring(0,3) 로 문자열 변화후 앞 3글자만 가져옵니다.

        return LocalDate.of(2016, a, b).getDayOfWeek().toString().substring(0,3);
    }
}
