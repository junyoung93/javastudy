package day1.num29.my;

//3진법 <-> 10진법 변환 방법을 알아야합니다!

public class Solution29 {
    public int solution(int n) {
        int answer = 0;
        StringBuilder stringBuilder = new StringBuilder();

        while(n>0){ // n이 3보다 작아지면 반복문 종료
            stringBuilder.append(n % 3); // 3진법으로 변환 하므로 3으로 나눈 나머지를 계속 넣어줌

        }

        //stringBuilder.append(n); // 마지막수가 안들어가서 따로 넣어줌


        String str = stringBuilder.reverse().toString(); // 거꾸로 뒤집기

        int mul=1;

        for(int i=0; i<str.length(); i++){//10진법으로 되돌리는 코드
                                        //아스키코드 값에 의해 char에 -'0'을 해주면 숫자로 바뀜

            answer+= (str.charAt(i)-'0') * mul;
            mul *= 3;

        }
        // answewr = Integer.parseInt(str,3); => 두번째인자로 3을주면
                                                // 3진법을 10진법으로 변환 해줌

        return answer;
    }
}
