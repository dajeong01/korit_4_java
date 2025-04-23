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

public class Loop06 {
    public static void main(String[] args) {

        // 별찍기
        for(int i = 1; i < 6; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();           // 개행이 일어나는 1차 for문
        }
    }
}
