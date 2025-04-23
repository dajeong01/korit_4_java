package ch06_condition;

import java.util.Scanner;

/*
    중첩 if문(Nested - if)
        if문내에 if문이 연속적으로 작성할 수 있다

    형식 :
    if (조건식1) {
        실행문1
        if (조건식 1a) {
            실행문 1a
        } else if (조건식 1b) {
            실행문 1b
        } else if (조건식 1c) {
            실행문 1c
        } else {
            실행문 1d
        }
    } else if (조건식2) {
        실행문2
        if (조건식 2a) {
            실행문 2a
        } else {
            실행문 2b
        }
    } else {
        실행문3
        if (조건식 3a) {
            실행문 3a
        }
    }
 */
public class Condition07 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int score;
        String grade;

        System.out.println("점수를 입력하세요 : ");
        score = scanner.nextInt();

        // 중첩 if문을 적용한 조건문 작성
        if (score > 100 || score < 0) {
            System.out.println("불가능한 점수 입력입니다.");
            grade = "X";
        } else {
            if (score >= 90) {
                grade = "A";
            } else if (score >= 80) {
                grade = "B";
            } else if (score >= 70) {
                grade = "C";
            } else if (score >= 60) {
                grade = "D";
            } else {
                grade = "F";
            }
        }
        System.out.println("당신의 점수는 " + score + "이고, 학점은 " + grade + "입니다.");
    }
}
