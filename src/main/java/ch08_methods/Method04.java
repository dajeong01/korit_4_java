package ch08_methods;

import java.util.Scanner;

public class Method04 {
    public static void calculateBmi(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("키(cm)를 입력하세요: ");
        double heightcm = scanner.nextDouble();
        double heightm = heightcm / 100;

        System.out.print("체중(kg)을 입력하세요 : ");
        double weight = scanner.nextDouble();

        double bmi;
        bmi = weight / (heightm * heightm);
        System.out.println(bmi);

        String bmiGrade = "";
        if(bmi >= 25){
            bmiGrade = "비만";
        } else if(bmi >= 23){
            bmiGrade = "과체중";
        } else if(bmi >= 18.5){
            bmiGrade = "정상";
        } else {
            bmiGrade = "저체중";
        }
        System.out.println("당신의 BMI지수는 " + bmi + "이고, " + bmiGrade + "입니다.");
    }

    public static void main(String[] args) {
        calculateBmi();

    }
}
