package ch06_condition;

import java.util.Scanner;

/*
    if - else if문 : if - else문과 달리 else if에는 별도의 조건식이 요구됨.

     형식 :
            if(조건식) {
                실행문1
            } else if(조건식2) {
                실행문2
            } else if(조건식3) {
                실행문3
            }
 */
public class Condition03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // 변수 / 상수의 선언 및 초기화
        int point = 0;
        final int VIP_POINT = 80;           // final 키워드가 붙으면 재대입이 불가능함.
        final int GOLD_POINT = 60;          // 즉, 변함없는 데이터를 사용하고 싶을 때
        final int SILVER_POINT = 40;        // 사용하는데, 얘가 변함없는 데이터라는 것을
        final int BRONZE_POINT = 20;        // 개발자들이 알아보기 위해 대문자로만 작성

        System.out.print("회원 포인트를 입력하세요 : ");
        point = scanner.nextInt();

        // 조건문
//        if (point > 80) {
//            System.out.println("회원등급 : VIP");
//        } else if (point > 60) {
//            System.out.println("회원등급 : GOLD");
//        } else if (point > 40) {
//            System.out.println("회원등급 : SILVER");
//        } else if (point > 20) {
//            System.out.println("회원등급 : BRONZE");
//        } else {
//            System.out.println("회원등급 : NORMAL");
//        }

        // 반복되는 부분이 너무 많은 것 같아서 줄이기

        // 등급을 저장하는 변수를 하나 선언
        String userGRade = "";              // 아직 데이터에 아무런 값 X

        if (point > 80) {
            userGRade = "VIP";
        } else if (point > 60) {
            userGRade = "GOLD";
        } else if (point > 40) {
            userGRade = "SILVER";
        } else if (point > 20) {
            userGRade = "BRONZE";
        } else if (point <= 20) {
            userGRade = "NORMAL";
        }

        System.out.println("회원등급 : " +userGRade);

        // if - else / if - else if문의 경우 전체가 한 세트의 조건문으로 볼 필요가 있습니다.
    }
}
