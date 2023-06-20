package day1.num26.my;

import java.util.Arrays;
import java.util.Comparator;

public class Solution26 {
    public int[] solution(int[] arr) {
        int[] answer = {};

        if(answer.length ==1){ // 배열의 크기가 1이라면 1개를 제거하면 빈 배열이 됨
            return new int[]{-1};
        }

        // 가장 작은 수의 인덱스를 찾음
        int minIndex = -1;
        int min= Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i] ) {
                min = arr[i];
                minIndex = i;

            }
        }

        //가장 작은 인덱스를 제외할거라서 배열 크기를 1줄임
        int[] result = new int[arr.length - 1];
        int resultIndex = 0; // 결과 배열 인덱스


        for (int i = 0; i < arr.length; i++) {// 제외할 인덱스인 minindex가 아닐때만 arr값을 복사함
            if (i != minIndex) {
                result[resultIndex] = arr[i];
                resultIndex++;
            }
        }

        return result;
    }
}
