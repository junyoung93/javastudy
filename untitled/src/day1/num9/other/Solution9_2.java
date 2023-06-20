package day1.num9.other;

//for문 범위 자체에 먼저 4를 뺴주면서 코들 간결하게 처리했고 후에 substring을 활용해서 마지막 4자리를 추가.

class Solution9_2 {
    public String solution(String phone_number) {
        String answer = "";

        for (int i = 0; i < phone_number.length() - 4; i++)
            answer += "*";

        answer += phone_number.substring(phone_number.length() - 4);

        return answer;
    }
}