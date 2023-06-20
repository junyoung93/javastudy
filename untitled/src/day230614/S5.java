package day230614;

public class S5 {
    public static void main(String[] args) {
        Student s = new Student("홍길동", 1 , 1, 100, 60 , 76);
        System.out.println(s.info());
        System.out.println("총점 : " + s.getTotal() );
        System.out.println("평균 : " + s.getAverage() );
    }
}
class Student {
    String name;
    int ban;  // 반
    int no;  // 번호
    int kor; // 국어점수
    int eng; //영어점수
    int math; //수학점수
    public Student (String name, int ban, int no, int kor, int eng, int math){
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }


    //6-4
    public int getTotal() {
        return kor + eng + math;
    }

    public float getAverage() {
        float avg = (float) (getTotal() / 3f);
        float avg2 = Math.round(avg * 10) / 10f;

        return avg2;
    }


    // 6-5
    public String info(){
        return name + "," + ban + "," + no + "," + kor + "," + eng + "," + math;
    }
}
