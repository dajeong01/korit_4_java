package ch07_loops;
/*
    While 반복문
    형식 :
    while(조건식) {
    반복실행문
    }

    while 뒤에 나오는 (조건식)을 봤을 때 if(조건식)형태와 유사합니다.
    즉, while()내의 조건식이 true일 때, {}내의 실행문이 '반복적으로' 이루어집니다.

    그래서 주의할 점이 있는데
    while 내부의 조건식이 특정 시점에 false가 되도록 미리 지정해둘 필요가 있습니다.

    false가 되는 시점을 지정해주지 않는다면 무한히 반복실행문이 실행된다는 점에서
    무한 루프 (infinite loops)라는 표현을 씁니다.
 */
public class Loop01 {
    public static void main(String[] args) {

        int i = 0;
        while (i < 10) {
            i++;
            System.out.println(i);
        }
//
//        int j = 1;
//        while (j < 10){
//            System.out.println(j);
//            j++;
//        }

        // while문도 중첩이 일어날 수 있다
    /*
            while(조건식1){
                반복실행문 1a
                while(조건식2) {
                    반복실행문2}
                 }
                 반복실행문 1
             }

             while과 if 섞기 가능
   */
//             int sum = 1;
//             int k = 1;
//             while (k < 101) {
//                 sum += k;
//                 k++;
//             }
//        System.out.println(sum);

     int x = 1;
     int total = 0;
     while (x < 100){
         x ++;
         if(x % 2 == 0){
             total += x;
         }
     }
     System.out.println(total);























    }
}
