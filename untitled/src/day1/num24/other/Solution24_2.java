package day1.num24.other;

import java.util.Arrays;

public class Solution24_2 {

    public long solution(long n) {
        // String 배열로 선언
        //Long.toString(n).split(""); 이렇게 해도됨
        String[] list = String.valueOf(n).split("");
        Arrays.sort(list); // 오름차순 정렬

        //reverse 메서드 사용을 위해 Stringbuilder에 정렬한 값을 차례대로 담아줌
        StringBuilder sb = new StringBuilder();
        for (String aList : list) sb.append(aList);


        //reverse 메서드 사용후 Long으로 형변환해주기만 하면 끝!
        return Long.parseLong(sb.reverse().toString());
    }
}
