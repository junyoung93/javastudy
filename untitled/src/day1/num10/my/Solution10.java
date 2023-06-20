package day1.num10.my;

class Solution10 {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = {};

        int len1 = arr1.length;
        int len2 = arr1[0].length;
        answer = new int[len1][len2];

        for(int i=0; i<len1; i++){
            for(int j=0; j<len2; j++){
                answer[i][j] += arr1[i][j] + arr2[i][j];
            }
        }
        return answer;
    }
}