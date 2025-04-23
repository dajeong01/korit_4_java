package ch06_condition;

import java.util.Scanner;

/*
    switch 문
    형식 :
    switch(변수명)
        case 조건1 :
            실행문1
            break;
        case 조건2 :
            실행문2
            break;
        case 조건3 :
            실행문3
            break;
        default:
            실행문5;

 */
public class Condition11 {
    public static void main(String[] args) {

        int selectNum;
        String selectchar;

        Scanner scanner = new Scanner(System.in);

        System.out.println("1.a 1번 메뉴");
        System.out.println("2.b 2번 메뉴");
        System.out.println("3.c 3번 메뉴");
        System.out.println("4.d 4번 메뉴");
        System.out.println("5.e 5번 메뉴");

        System.out.print("메뉴를 고르세요 : ");
//        selectNum = scanner.nextInt();
        selectchar = scanner.nextLine();

//        switch (selectNum) {
//            case 1:
//                System.out.println("메뉴1을 선택하셨습니다.");
//                break;                      // 조건문을 탈출한다는 의미
//            case 2:
//                System.out.println("메뉴2을 선택하셨습니다.");
//                break;
//            case 3:
//                System.out.println("메뉴3을 선택하셨습니다.");
//                break;
//            case 4:
//                System.out.println("메뉴4을 선택하셨습니다.");
//                break;
//            case 5:
//                System.out.println("메뉴5을 선택하셨습니다.");
//                break;
//            default:                        // selectNum이 case에 속하지 않을 때 실행됨
//                System.out.println("잘못 선택하셨습니다.");
//        }

        switch (selectchar) {
            case "a":
                System.out.println("메뉴1을 선택하셨습니다.");
                break;                      // 조건문을 탈출한다는 의미
            case "b":
                System.out.println("메뉴2을 선택하셨습니다.");
                break;
            case "c":
                System.out.println("메뉴3을 선택하셨습니다.");
                break;
            case "d":
                System.out.println("메뉴4을 선택하셨습니다.");
                break;
            case "e":
                System.out.println("메뉴5을 선택하셨습니다.");
                break;
            default:                        // selectNum이 case에 속하지 않을 때 실행됨
                System.out.println("잘못 선택하셨습니다.");
        }


    }
}
