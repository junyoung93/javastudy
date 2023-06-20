package day1.num20.othercode;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Solution20_3 {

    public String solution(String[] participant, String[] completion) {

        //collect는 Java 스트림(Stream)에서 요소를 수집하여 원하는 컬렉션(여기서는 map) 또는 결과 형태로 변환하는 메서드

        // participant 배열을 Arrays.asList(participant)를 사용하여 리스트로 변환하고, stream() 메서드를 호출하여 스트림으로 변환
        // (스트림의) gropingBy 매서드로 참가자 이름(unction.identity())으로 그룹화하고 그 수를 셈 (ollectors.counting())
        // groupingBy는 map을 반환함.
        Map<String, Long> participantMap = Arrays.asList(participant).stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        for(String name : completion) { // 2번 주석내용과 동일

            Long value = participantMap.get(name) - 1L;

            if(value == 0L) {
                participantMap.remove(name);
            } else {
                participantMap.put(name, value);
            }
        }

        return participantMap.keySet().iterator().next();
    }
}
