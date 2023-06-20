package day1.num15.my;

class Solution15 {
    public int solution(int[] a, int[] b) {
        int answer = 1234567890;

        int sum=0;

        for(int i=0; i<a.length; i++){
            sum += a[i] * b[i];
        }

        return sum;
    }
}