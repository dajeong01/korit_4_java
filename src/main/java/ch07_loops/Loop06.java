package ch07_loops;
/*
    for (int i = 0; i < 10 ; i ++) {
        (반복실행문 1-a)
        for (int j = 0; j < 10; j++) {
            반복실행문2
        }
        (반복실행문1-b)
    }
 */

import java.util.Scanner;

public class Loop06 {
    public static void main(String[] args) {

//        // 별찍기
//        for(int i = 1; i < 6; i++) {
//            for (int j = 0; j < i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();           // 개행이 일어나는 1차 for문
//        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("몇줄의 별찍기 실행? : ");
        int row = scanner.nextInt();

        // 늘어나기
        for(int i = 1; i < row + 1; i++){   // 1차 for문은 개행의 숫자와 관련있음
            for(int j = 0; j < i; j++){     // 2차 for문의 경우에는 별이 찍히는 횟수와 관련있음
                System.out.print("*");

            }
            System.out.println();
        }

        System.out.println();

        // 줄어들기
        // ++ 이용방법

        for(int i = row; i >0; i--){
            for(int j = 0; j < i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        // -- 이용방법
        for(int i = 0; i < row; i++){
            for(int j = row; j >i; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
