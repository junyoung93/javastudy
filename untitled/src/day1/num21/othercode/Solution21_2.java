package day1.num21.othercode;

//삼항 연산자를 사용, but string builder를 사용하지 않아서 성능은 좋지 못할수도 ..
class Solution21_2 {
    public String solution(String s) {

        String answer = "";
        int cnt = 0;
        String[] array = s.split(""); //공백을 기준으로 String 배열에 넣어줌

        for(String ss : array) {
            cnt = ss.contains(" ") ? 0 : cnt + 1; // 공백이 아니면 cnt(단어의 현재 인덱스 )를 0으로 초기화 하고 아니라면 1증가
            answer += cnt%2 == 0 ? ss.toLowerCase() : ss.toUpperCase(); // 짝수라면 소문자를 넣어주고 홀수라면 대문자로 더해줌.
        }
        return answer;
    }
}
