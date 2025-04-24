package ch07_loops;

import java.util.Scanner;

/*
    몇 줄의 별을 찍겠습니까? : 3
    줄어들기
 */
public class Loop07 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("몇 줄의 별을 찍겠습니까? : ");
        int row = scanner.nextInt();

        for(int i = row; i >0; i--){
            for(int j = 0; j < i; j++){
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
