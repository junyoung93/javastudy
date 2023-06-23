package day230623;

import java.util.*;

class Exercise11_2 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(3);
        list.add(6);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(7);

        HashSet set = new HashSet(list); // 중복제거 순서 유지 안됨  3627
        TreeSet tset = new TreeSet(set); // set 을 기준으로 오름차순 2367
        Stack stack = new Stack();
        stack.addAll(tset); // FILO 2367
        while (!stack.empty())
            System.out.println(stack.pop());
    }
}

// 7 ,6 ,3, 2