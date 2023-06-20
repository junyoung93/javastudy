package day1.num36.my;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Solution36 {
    public String solution(String s) {

        String[] strings = s.split("");// split 매서드로 문자열 배열로 쪼갬

        Arrays.sort(strings, Comparator.reverseOrder()); // 역순정렬

        StringBuilder stringBuilder = new StringBuilder();

        for(int i=0; i<strings.length ; i++){
            stringBuilder.append(strings[i]); // stringbuilder에 문자를 넣어줌
        }

        return stringBuilder.toString(); // 스트링으로 변환해서 값 반환
    }
}
