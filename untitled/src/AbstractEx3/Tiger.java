package AbstractEx3;

class Tiger extends Animal{
    @Override
    public void eat() {
        System.out.println("호랑이가 먹습니다.");
    }

    @Override
    public void sleep() {
        System.out.println("호랑이가 잠을 잡니다.");
    }
}
