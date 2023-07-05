package day230705;

public class day230705 {
  /* 람다식으로 바꾸시오
  int printVar(String name, int i){
    System.out.println(name + "=" +i);
  }
   */
    //  (name, i) -> System.out.println(name + "=" + i)

    /* 람다식으로 바꾸시오
  int square(int x){
    return x * x;
  }
   */
    // (x) -> x * x

    /* 람다식으로 바꾸시오
  int roll() {
    return (int) (Math.random() * 6);
  }
   */
    // () -> (int)(Math.random() * 6)

     /* 람다식으로 바꾸시오
 int sumArr(int[] arr){
    int sum = 0;
    for(int i : arr)
        sum += i;
        return sum;
 }
   */
    // (int[] arr) -> { int sum = 0 ;
    //                  for(int i : arr)
    //                      sum += i;
    //                  return sum;
    // }


     /* 람다식으로 바꾸시오
 int[] emptyArr(){
    return new int[]{};
}
   */
    // () -> {new int[] {} }
    // () -> { return new int[] {} }
}
