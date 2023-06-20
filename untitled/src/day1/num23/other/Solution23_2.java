package day1.num23.other;


public class Solution23_2 {

    public int[] solution(long n) {

        //StringBuilder().append(n).reverse() : stringbuilder에 n을넣고
        //reverse() 메서드로 뒤집는다.
        // .char() => 주어진값을 stream으로
        //.map(Character::getNumericValue): 각 문자를 해당하는 숫자로 매핑
        // Character.getNumericValue 메서드를 사용하여 문자를 숫자로 변환
        // 반환을 위해 toArray로 배열로 변환
        return new StringBuilder().append(n).reverse().chars().map(Character::getNumericValue).toArray();
    }
}

//            int[] answer = {};
//
//            String str_ans = Long.toString(n);
//
//            StringBuilder stringBuilder = new StringBuilder();
//            stringBuilder.append(str_ans).reverse();
//
//            answer = new int[stringBuilder.length()];
//
//            int index=0;
//
//            for(int i=0; i<stringBuilder.length(); i++){
//                answer[index] = stringBuilder.charAt(i)-'0';
//                index++;
//            }
//            return answer;

//풀어 쓰면 이런 느낌일듯..
