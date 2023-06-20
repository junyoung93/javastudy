//package day230619;
//
//class Exercise7_18 {
//    /*
//        (1)   action메서드를   작성하시오.
//    */
//    // 이해가 안감 질문
//    public static void action(Robot r) {
//        if (r instanceof DanceRobot) {
//            DanceRobot danceRobot = (DanceRobot) r;
//            danceRobot.dance();
//        } else if(r instanceof SingRobot) {
//            SingRobot singRobot = (SingRobot) r;
//            singRobot.sing();
//        } else if  (r instanceof DrawRobot) {
//            DrawRobot drawRobot = (DrawRobot) r;
//            drawRobot.draw();
//        }
//    }
//
//
//    public static void main(String[] args) {
//        Robot[] arr = {new DanceRobot(), new SingRobot(), new DrawRobot()};
//        for (int i = 0; i < arr.length; i++)
//            action(arr[i]);
//    }   //   main }
//
//    class Robot {
//    }
//
//    class DanceRobot extends Robot {
//        void dance() {
//            System.out.println("춤을   춥니다.");
//        }
//    }
//
//    class SingRobot extends Robot {
//        void sing() {
//            System.out.println("노래를   합니다.");
//        }
//    }
//
//    class DrawRobot extends Robot {
//        void draw() {
//            System.out.println("그림을   그립니다.");
//        }
//    }
//}

