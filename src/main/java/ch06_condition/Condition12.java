package ch06_condition;

import java.util.Scanner;

/*
    Condition07 파일을 확인하면
    점수를 입력 받아서 등급을 산출했다.
    이를 응용하여 중첩 if문 + switch문 형태로 프로그램을 작성

    지시사항
    사용자에게 score를 입력 받아서 다음과 같은 조건을 만족시키도록 작성
    score가 0미만이거나 100초과라면 grade = x

    changedScore = 9~10, grade = A
    changedScore = 8, grade = B
    changedScore = 7, grade = C
    changedScore = 6, grade = D
    changedScore = 1,2,3,4,5, grade = F

    실행 예
    점수 입력 :
    점수는 100점이고, 학점은 A학점입니다.
    changedScore = score / 10

 */
public class Condition12 {
    public static void main(String[] args) {

        int score;
        int changedScore;
        String grade = "";

        Scanner scanner = new Scanner(System.in);
        System.out.println("점수를 입력하세요 : ");
        score = scanner.nextInt();
        changedScore = score / 10;

        if (score <0 || score > 100){
            System.out.println("잘못 입력했습니다.");

        } else {
            switch (changedScore) {
                case 9, 10:
                    grade = "A";
                    break;
                case 8:
                    grade = "B";
                    break;
                case 7:
                    grade = "C";
                    break;
                case 6:
                    grade = "D";
                    break;
                default:
                    grade = "F";
            }
            System.out.println("점수는 " + score + "이고, 학점은 " + grade + "입니다.");
        }



    }
}
