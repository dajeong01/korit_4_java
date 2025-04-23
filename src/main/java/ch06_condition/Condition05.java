package ch06_condition;

import java.util.Scanner;

public class Condition05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int score;
        String grade;

        System.out.println("점수를 입력하세요 : ");
        score = scanner.nextInt();

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
        // 문제점이 발생할 수 있는 경우 score를 잘못 입력해서 100이 넘거나 음수이거나

        System.out.println("당신의 점수는 " + score + "이고, 학점은 " + grade + "입니다.");

    }
}
