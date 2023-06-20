package day230614;


class SutdaDeck {
    final int CARD_NUM = 20;
    SutdaCard[] cards = new SutdaCard[CARD_NUM];

    //7-1
    SutdaDeck() {
        for (int i = 0; i < cards.length; i++) {
            int num = i % 10 + 1;

            boolean isKwang = (num == 1) || (num == 3) || (num == 8);
            cards[i] = new SutdaCard(num, isKwang);

        }
    }

    //7-2
    void shuffle() {
        for (int i = 0; i < cards.length; i++) {
            int j = (int) (Math.random() * cards.length);
            SutdaCard random = cards[i];
            cards[i] = cards[j];
            cards[j] = random;
        }
    }
// 7-2 pick

    //exception 처리 해서 리팩토링
    SutdaCard pick(int index) {
        if (index < 0 || index >= CARD_NUM)  return null;  // 유효성검사를 하는 습관갖기 // 풀이ㅣ 참고
        //매개변수가 있는 메서드는 반드시 작업 전에 유효성검사를 해야 한다는 것을 기억하자.
        return cards[index];
    }

    SutdaCard pick() {
        int index = (int)(Math.random()*cards.length);
        return pick(index);
    }

}

class SutdaCard {
    int num;
    boolean isKwang;

    SutdaCard() {
        this(1, true);
    }

    SutdaCard(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
    }

    //   info()대신   Object클래스의   toString()을    오버라이딩했다.
    public String toString() {
        return num + (isKwang ? "K" : "");
    }
}

class Exercise7_1 {
    public static void main(String args[]) {
        SutdaDeck deck = new SutdaDeck();
        for (int i = 0; i < deck.cards.length; i++)
            System.out.print(deck.cards[i] + ",");
    }
}


// 실행결과 1k,2,3k,4,5,6,7,8k,9,10,1,2,3,4,5,6,7,8,9,10,