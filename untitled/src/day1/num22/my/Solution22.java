package day1.num22.my;


// String과 아스키코드를 활용한풀이
public class Solution22 {
    public int solution(int n) {
        int answer = 0;

        String str_answer = Integer.toString(n);


        // 아스키 코드를 사용했다. 표를 참고해보면 char타입에 '0'을 뺴주면 int로 변환이 가능하다.
        // 예를들어 '1'은 아스키코드에서 49값을 가지고 '0'은 48값을 가진다.
        //즉 어떤 숫자던 '0'을빼주면 아스키 코드의 차를 이용해서 실제 정수값을 구할 수 있다.

        for(int i=0; i< str_answer.length(); i++){
            answer += str_answer.charAt(i) -'0';
        }


        return answer;
    }
}

