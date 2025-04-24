package ch08_methods;

import java.util.Scanner;

public class Method03 {

    public static void calculateAvgScore(){
        double sum = 0;
        double avgScore = 0;
        int numOfSubs = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("몇과목의 점수를 입력하시겠습니까? : ");
        numOfSubs = scanner.nextInt();

        for(int i = 1; i < numOfSubs+1; i++){
            System.out.print(i + "과목 점수를 입력하세요 :");
            sum += scanner.nextDouble();
        }
        avgScore = sum / numOfSubs;
        System.out.println("총합은 " + sum + "이며, 평균은 " + avgScore + "입니다.");
    }

    public static void main(String[] args) {
        /*
            실행예
            몇과목의 점수를 입력하시겠습니까? :
            1과목 점수를 입력하세요 :
            2과목 점수를 입력하세요 :
            3과목 점수를 입력하세요 :
            총합은 ~.0 이며, 평균은 95.0입니다
         */

        calculateAvgScore();

    }
}
