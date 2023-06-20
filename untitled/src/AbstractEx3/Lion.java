package AbstractEx3;

class Lion extends Animal{

    @Override
    public void eat() {
        System.out.println("사자가 먹습니다.");
    }

    @Override
    public void sleep() {
        System.out.println("사자가 잠을 잡니다.");
    }
}
