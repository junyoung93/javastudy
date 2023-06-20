package day230619;

class Exercise7_19{
public static void main(String args[]){
        Buyer b=new Buyer();
        b.buy(new Tv());
        b.buy(new Computer());
        b.buy(new Tv());
        b.buy(new Audio());
        b.buy(new Computer());
        b.buy(new Computer());
        b.buy(new Computer());


        b.summary();
    }
}

class Buyer {
    int money = 1000;
    Product[] cart = new Product[3]; //   구입한   제품을   저장하기   위한    배열
    int i = 0; //   Product배열   cart에   사용될   index

    // money = p.price 일때 리팩토링
    void buy(Product p) {
        if(money < p.price){
            System.out.println("돈이 부족합니다.");
        }
        if(money >= p.price){
            money -= p.price;
            add(p);
        }

    }

    void add(Product p) {
        if( i >= cart.length){
            Product[] cart2 = new Product[cart.length*2];
//            System.arraycopy(원본배열, 원본시작인덱스, 대상배열, 대상시작인덱스, 복사할길이);
            System.arraycopy(cart, 0, cart2, 0, cart.length);
            cart = cart2;
        }
        cart[i++]=p;
    } //void add(Product p)
    void summary(){
        String list = "";
        int sum = 0;

        for (int j = 0; j < cart.length; j++) {
            if (cart[j] != null) {
                list += cart[j] + ",";
                sum += cart[j].price;
            } else{
                System.out.println("장바구니가 비었습니다.");
            }
        }
        System.out.println("구입한 물건 : " + list);
        System.out.println("구매한 금액 : " + sum);
        System.out.println("소지한 금액 : " + money);
    }
}

class Product {
    int price;

    Product(int price) {
//    제품의   가격
        this.price = price;
    }
}

class Tv extends Product {
    Tv() {
        super(100);
    }

    public String toString() {
        return "Tv";
    }
}

class Computer extends Product {
    Computer() {
        super(200);
    }

    public String toString() {
        return "Computer";
    }
}

class Audio extends Product {
    Audio() {
        super(50);
    }

    public String toString() {
        return "Audio";
    }
}