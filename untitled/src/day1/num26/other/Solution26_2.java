package day1.num26.other;

import java.util.*;
import java.util.stream.Collectors;

public class Solution26_2 {
    public int[] solution(int[] arr) {


        if (arr.length <= 1) return new int[]{ -1 };


        // 1. arr을 스트림으로 변환
        // 2. min() 연산으로 최소값 추출
        // 3. getAsInt() 매서드로 Optional 타입을 int로 변환
        int min = Arrays.stream(arr).min().getAsInt();

        // arr 배열중 최솟값으로 저장한 min과 일치하지 않는것을 fiter 매서드로 걸러주고
        // toArray() 매서드를 사용해 배열로서 리턴
        return Arrays.stream(arr).filter(i -> i != min).toArray();

    }
}
