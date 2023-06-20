package day1.num40.other;

/////////////////////////////// 정규표현식사용 ,
/////////////////////////////////// 클래스 내부의 매서드를 활용해 String s 필드를 계속 업데이트 하는 방식 ...
//////////////////////////////////배울점이 많은듯

public class Solution40_2 {

    public String solution(String new_id) {

        String s = new KAKAOID(new_id)
                .replaceToLowerCase()
                .filter()
                .toSingleDot()
                .noStartEndDot()
                .noBlank()
                .noGreaterThan16()
                .noLessThan2()
                .getResult();

        //메서드를 호출한다.
        // 매서드들이 this를 리턴하기 때문에 위와같이 작성이 가능하다.
        return s;
    }

    private static class KAKAOID {
        private String s;

        KAKAOID(String s) {
            this.s = s;
        }

        private KAKAOID replaceToLowerCase() {
            s = s.toLowerCase();
            return this;
        }

        private KAKAOID filter() { // ^은 문자 클래스 내에서 사용될 때는 not을 의미한다고 한다. 따라서 a-z0-9._-가 아니면 모두 삭제
            s = s.replaceAll("[^a-z0-9._-]", "");
            return this;
        }

        private KAKAOID toSingleDot() {// {2,}는 바로 앞의 패턴이 2번 이상 연속되는 경우를 의미
            s = s.replaceAll("[.]{2,}", ".");
            return this;
        }

        private KAKAOID noStartEndDot() {//^은 문자열의 시작을 의미하고 , $은 문자열의 끝을 의미한다.
            s = s.replaceAll("^[.]|[.]$", "");
            return this;
        }

        private KAKAOID noBlank() { // 비어있다면 a추가
            s = s.isEmpty() ? "a" : s;
            return this;
        }

        private KAKAOID noGreaterThan16() {
            if (s.length() >= 16) { // 16자 이상이면 15글자까지 자름
                s = s.substring(0, 15);
            }
            s = s.replaceAll("[.]$", ""); // 뒷부분에 .이 있는지 다시 체크
            return this;
        }

        private KAKAOID noLessThan2() {
            StringBuilder sBuilder = new StringBuilder(s);
            while (sBuilder.length() <= 2) { // 길이갸 3보다 작으면
                sBuilder.append(sBuilder.charAt(sBuilder.length() - 1)); // 뒷글자 붙여줌
            }
            s = sBuilder.toString();
            return this;
        }

        private String getResult() {
            return s;
        }
    }
}
