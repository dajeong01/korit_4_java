package ch07_loops;

import java.util.Scanner;

public class Loop08 {
    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("몇줄? : ");
//        int row = scanner.nextInt();

//        for(int i = row; i >0; i--){
//            for (int j = 0; j < i; j++){
//                System.out.print(" ");
//            System.out.println();
//        }
//    }

        // 1번풀이
        for (int i = 0; i < 5; i++) {
            // 공백구문
            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }
            // 별찍기구문
            for (int k = 0; k < i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 2번풀이
        for (int i = 0; i < 6; i ++){
            // 공백 j ++
            for(int j = 0; j < 6 -i; j++){
                System.out.print(" ");
            }
            // 별ㅉ:ㄱㄱ;
            for (int k = 0; k < i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
