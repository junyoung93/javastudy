package day1.num2.mycode;

class Solution2 {
    public String solution(int num) {

        String answer = "";

        int ret =num%2;

        if(ret==0) {
            answer="Even";
        } else  {
            answer="Odd";
        }


        return answer;
    }
}