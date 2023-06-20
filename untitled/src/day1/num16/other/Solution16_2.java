package day1.num16.other;

//////////// 람다식 사용
public class Solution16_2 {
    boolean solution(String s) {
        // 소문자 대문자가 둘다 있어서 대문자로 통일.
        s = s.toUpperCase();


        // s.chars() : String s를 stream으로 변환
        // STRING을 쪼갰으므로 각각은 char 타입일것임.
        // filter( e-> e =='P' ).count() : filter 매서드로 문자가 'P'일때를 걸러주고 count 연산
        // Y일때 반복
        // 같으면 true , 다르면 false
        return s.chars().filter( e-> e =='P' ).count() == s.chars().filter( e -> e == 'Y').count();

    }
}
