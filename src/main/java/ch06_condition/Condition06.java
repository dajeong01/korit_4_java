package ch06_condition;

import java.util.Scanner;

public class Condition06 {
    public static void main(String[] args) {

        // 05에서 나오는 문제점 점수가 100초과 or 0 미만도 입력 가능
        // => 잘못된 점수라고 말해줘야함

        Scanner scanner = new Scanner(System.in);
        int score;
        String grade = "";

        System.out.println("점수를 입력하세요 : ");
        score = scanner.nextInt();

        // 해결하지 못하는 방식
//        if (score >= 90) {
//            grade = "A";
//        } else if (score >= 80) {
//            grade = "B";
//        } else if (score >= 70) {
//            grade = "C";
//        } else if (score >= 60) {
//            grade = "D";
//        } else if (score < 60){
//            grade = "F";
//        } else if (score > 100) {
//            grade = "X";
//        } else if (score < 0) {
//            grade = "X";
//        }

        if (score > 100) {
            grade = "X";
        } else if (score < 0) {
            grade = "X";
        } else if (score >= 90) {
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

        System.out.println("당신의 점수는 " + score + "이고, 학점은 " + grade + "입니다.");
    }
}
