package AbstractEx3;

class Deer extends  Animal{

    @Override
    public void eat() {
        System.out.println("사슴은 먹이를 먹습니다.");
    }

    @Override
    public void sleep() {
        System.out.println("사슴은 잠을 잡니다.");
    }
}
