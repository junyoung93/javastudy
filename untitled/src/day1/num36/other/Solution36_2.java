package day1.num36.other;

import java.util.Arrays;

// toCharArray() 를사용해서 stiring builder에 바로 변환해서 넣을 수 있었고 덕분에 코드가 간결해짐
public class Solution36_2 {
    public String solution(String str){

        char[] sol = str.toCharArray();// char 배열로 변환
        Arrays.sort(sol);//sort

        return new StringBuilder(new String(sol)).reverse().toString(); // Stringbuilde에 넣고 reverse 매서드 사용후 String으로 반환
    }
}
