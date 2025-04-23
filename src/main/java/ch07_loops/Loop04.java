package ch07_loops;

import java.util.Scanner;

/*
    for 반복문(for loop)
    : 대부분의 경우에 명확한 횟수가 고정되어 있을때 사용하는 반복문

    형식 :
    for (시작값 ; 종료값 ; 증감값) {
        반복실행문
    }
 */
public class Loop04 {
    public static void main(String[] args) {

        // 1 ~ 100 까지의 합을 구하는 for문
        int sum = 0;
        for (int i = 0; i < 101; i++) {
            sum += i;
        }
        System.out.println(sum);

        // 1부터 100까지 중 홀수 합을 구하는 for문을 작성
        int sum1 = 0;
        for (int i = 0; i < 101; i++) {
            if (i % 2 != 0) {
                sum1 += i;
            }
        }
        System.out.println(sum1);

        // 입력받기 1부터 n까지 합
        Scanner scanner = new Scanner(System.in);
        System.out.println("1부터 몇까지 더하시겠습니까?");
        int n = scanner.nextInt();
        int sumN = 0;
        for (int i = 0; i < n+1; i++){
            sumN += i;
        }
        System.out.println("1부터" + n + "까지의 합 : " + sumN);
    }
}
