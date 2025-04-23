package ch07_loops;

public class Loop05 {
    public static void main(String[] args) {

//        // 1일차 1교시입니다 ~ 5일차 3교시 입니다
//        for(int i = 1; i < 6; i++){
//            for(int j = 1; j < 4; j++){
//                System.out.println(i+ "일차 " + j + "교시입니다.");
//            }
//        }
//
//        for(int i = 2; i < 10; i++){
//            for(int j = 1; j < 10; j++){
//                System.out.println(i + " X "+ j + " = " + i*j);
//            }
//            System.out.println();
//        }

        for(int i = 1; i < 101; i++) {
            if (i % 10 == 1) {
                System.out.println();
            }
            System.out.print(i + " ");
        }
    }
}
