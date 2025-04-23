package ch06_condition;
/*
    if - else if - else문
        형식 :
        if (조건식) {
            실행문1
        } else if (조건식2) {
            실행문2
        } else if (조건식3) {
            실행문3
        } else {
            실행문4
        }
 */
public class Condition04 {
    public static void main(String[] args) {

        int point = 0;
        String userGRade = "";


        if (point > 80) {
            userGRade = "VIP";
        } else if (point > 60) {
            userGRade = "GOLD";
        } else if (point > 40) {
            userGRade = "SILVER";
        } else if (point > 20) {
            userGRade = "BRONZE";
        } else {
            userGRade = "NORMAL";
        }

        System.out.println("회원등급 : " +userGRade);
    }
}
