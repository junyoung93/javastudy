package day1.num16.my;

class Solution16 {
    boolean solution(String s) {
        boolean answer = true;

        int p_cnt=0;
        int y_cnt=0;

        p_cnt = s.length() - s.replace("p", "").length() - s.replace("P", "").length();
        y_cnt = s.length() - s.replace("y", "").length() - s.replace("Y", "").length();

        if(p_cnt != y_cnt){
            answer = false;
        }

        return answer;
    }
}