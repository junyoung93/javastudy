package day1.num9.my;

class Solution9 {
    public String solution(String phone_number) {
        String answer = "";

        String front = phone_number.substring(0, phone_number.length() - 3);
        String back = phone_number.substring( phone_number.length() - 4,phone_number.length());


        for(int i=0; i<front.length()-1; i++){
            answer+= "*";
        }
        for(int i=0; i<back.length(); i++){
            answer += back.charAt(i);
        }

        return answer;
    }
}