package ch08_methods;

import java.util.Scanner;

public class Method02 {
    // 한방에 조기소개하는 메서드 정의
//    public static void introduce(){
//        // 내부에서 scanner import
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("이름 입력 : ");
//        String name = scanner.nextLine();
//        System.out.print("주소 : ");
//        String address = scanner.nextLine();
//        System.out.println("제 이름은은 " + name + "입니다. 주소는 "+ address + "에 삽니다.");
//    }

    //
     /*
        출석부를 만들겁니다.
        메서드명 : registerStudent()
        return : void
        실행 예
        학번 :
        이름 :
        학번 ~~
        이름 ~~

        main 단계에서 학생수 입력
      */

    public static void registerStudent(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("학번 : ");
        int studentCode = scanner.nextInt();
        System.out.print("이름 : ");
        String studentName = scanner.next();
        System.out.println("학번 : " + studentCode + " 이름 : " + studentName );
    }

    public static void registerStudent2(int studentNum){
        for(int i = 0; i < studentNum; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("학번 : ");
            int studentCode = scanner.nextInt();
            System.out.print("이름 : ");
            String studentName = scanner.next();
            System.out.println("학번 : " + studentCode + " 이름 : " + studentName);
        }
    }

    public static void registerStudent3(int studentNum){
        for(int i = 0; i < studentNum; i++) {
            registerStudent();
        }
    }

    public static void main(String[] args) {
//        introduce();

//        registerStudent();
        Scanner scanner = new Scanner(System.in);
        System.out.println("학생수 입력 : ");
        int studentNum = scanner.nextInt();

//        // 메서드 반복 # 1 for문
//        for (int i = 0; i < studentNum; i++){
//            registerStudent();
//        }
//
//        // 메서드 반복 # 2 while문 사용
//        int num = 0;
//        while (num < studentNum) {
//            registerStudent();
//            num++;
//        }


        registerStudent2(2);
    }
}
