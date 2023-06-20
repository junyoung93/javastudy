package day1.num39.my;

public class Solution39 {
    public String solution(String s, int n) {
        //영어 대문자는 65부터 90까지의 아스키 코EM
        //영어 소문자는 97부터 122까지의 아스키 코드 값

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (Character.isLetter(chars[i])) {  // 영문자인지 확인
                int ascii = (int) chars[i];  // 아스키 코드 값 가져오기

                // 대문자인 경우
                if (Character.isUpperCase(chars[i])) {
                    ascii = (ascii - 65 + n) % 26 + 65; // Z->A 를 위해 26으로 나눠줌, 26은 알파벳 갯수^^
                }
                // 소문자인 경우
                else {
                    ascii = (ascii - 97 + n) % 26 + 97; // 대문자랑 같은 메커니즘
                }

                chars[i] = (char) ascii;  // 아스키 코드를 다시 문자로 변환
            }
        }
        return new String(chars);
    }
}
