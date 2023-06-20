package day1.num17.other;

//예외처리를 활용한 로직 작성.
// 신박한 풀이라서 가져와봤다.
// 하지만 예외로 로직을 처리하는건 금기시 된다고 한다. 참고만 하자
// 금기시 되는 이유는
// 1. 코드 가독성저하,
// 2. 예외가 발생하면 추가적인 작업이 필요해서 오버헤드로 인한 성능저하 .
public class Solution17_2 {

    public boolean solution(String s) {
        if(s.length() == 4 || s.length() == 6){
            try{
                int x = Integer.parseInt(s);
                return true;
            } catch(NumberFormatException e){
                return false;
            }
        }
        else return false;
    }


}
