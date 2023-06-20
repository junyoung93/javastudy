package day1.num19.other;

public class Solution19_2 {

    public String Solution(int n){

        // 1. n/2+1 크기의 Stirng 생성
        // %  n/2 +1 인이유 => n이 홀수 일때를 고려하기 위함인데 일단 원하는 문자열보다 "수박"을 한번 더 만들고
        // substring을 사용해서 n에서 자르면 수박수박..........수박수" 에서 자를수 있음.
        // n이 짝수일때도 n으로 자르면 마지막에 "수박"이 한번더 붙었던걸 제거할 수 있음.

        // 2. Stirng을 청므 생성하면 \0으로 초기화 되므로 replace 매서드를 사용해서 모두 수박으로 교체
        // 3. n까지 substring
        return new String(new char [n/2+1]).replace("\0", "수박").substring(0,n);
    }
}
