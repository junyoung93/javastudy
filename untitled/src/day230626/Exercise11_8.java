package day230626;

import java.util.*;

class Student implements Comparable {
    String name;
    int ban;
    int no;
    int kor;
    int eng;
    int math;
    int total;
    int schoolRank;

    Student(String name, int ban, int no, int kor, int eng, int math) {
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
        total = kor + eng + math;
    }

    int getTotal() {
        return total;
    }

    float getAverage() {
        return (int) ((getTotal() / 3f) * 10 + 0.5) / 10f;
    }

    public int compareTo(Object o) {
      if(o instanceof Student){
          Student student = (Student) o;

      }
    }

    public String toString() {
        return name
                + "," + ban
                + "," + no
                + "," + kor
                + "," + eng
                + "," + math
                + "," + getTotal()
                + "," + getAverage()
                + "," + schoolRank
                ;
    }

}   //   class   Student
 class   Exercise11_8   {
    public static void calculateSchoolRank(List list) {
        Collections.sort(list);
        int prevRank = -1;
        int prevTotal = -1;
        int length = list.size();

        //1, 반복문을 이용해서 list에 저장된 student 객체를 하나씩 읽는다.


        for (int i = 0; i < length; i++) {
            Student s = (Student) list.get(i);
            //2총점(total)이 이전총점 (prevtotal) 과같으면
            // 이전 등수 (prevRank)를 등수 (schoolRank)로 한다.
            if(s.total == prevTotal){
                prevRank = s.schoolRank;
            } else{

            }
            //2. 총점이 서로 다르면,
            //등수 (schoolRank)의 값을 알맞게 계산해서 저장한다.
            //이전에 동점자였다면, 그 다음 등수는 동정자의 수를 고려한다.

        }




        //3. 현재 총점과 등수를 이전 총점(pretotal)과 이전등수(prevRank)에 저장한다.


    }

    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(new Student("이자바", 2, 1, 70, 90, 70));
        list.add(new Student("안자바", 2, 2, 60, 100, 80));
        list.add(new Student("홍길동", 1, 3, 100, 100, 100));
        list.add(new Student("남궁성", 1, 1, 90, 70, 80));
        list.add(new Student("김자바", 1, 2, 80, 80, 90));
        calculateSchoolRank(list);
        Iterator it = list.iterator();
        while (it.hasNext())
            System.out.println(it.next());
    }
}