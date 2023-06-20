package day230619;



class Exercise7_26 {
    public static void main(String[] args) {
        Outer2.Inner ii = new Outer2.Inner();
        System.out.println(ii.iv);
    }
}

class Outer2 {
    static class Inner{
        int iv=200;
    }
}
