package day1.num27.my;

public class Solution27 {
    public int solution(int num) {
        int answer = 0;

        if (num == 1) {
            return 0;
        }

        long long_num = (long) num; // num에 3을 곱하는 연산을 해야해서 너무 커지면 받지를 못함.-> long으로 형변환

        for (int i = 1; i <= 500; i++) {


            if (long_num % 2 == 0) { //짝수면
                long_num /= 2;
            } else {//홀수면
                long_num = long_num * 3 + 1;
            }

            if (long_num == 1) {
                return i;
            }
        }

        return -1;
    }
}
