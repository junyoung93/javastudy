package day230619;

import java.awt.*;
import java.awt.event.*;

class Exercise7_29 {
    public static void main(String[] args) {
        final int VALUE = 10;   //    외부   클래스의   지역변수
        Thread t = new Thread(new Runnable() {
            public void run() {
                for (
                        int i = 0;
                        i < 10; i++) {   //   10번   반복한다.
                    try {
                        Thread.sleep(1 * 1000);    //   1초간   멈춘다.
                    } catch (InterruptedException e) {
                    }

                    System.out.println(VALUE);   //   외부   클래스의   지역변수를   사용
                }
            }   //   run()
        });
//                t.start();   //   쓰레드를   시작한다. System.out.println("main()   -   종료.");
    }   //   main
}
