package day1.num3;

class Solution3 {
    public String solution(String s) {
        String answer = "";

        int len = s.length();

        if(len % 2 ==0){
            answer = s.substring(len / 2 - 1, len / 2+1);
        }else if(len % 2 ==1){
            answer = Character.toString(s.charAt(len / 2));
        }
        return answer;
    }
}