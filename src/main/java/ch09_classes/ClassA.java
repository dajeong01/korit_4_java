package ch09_classes;

import java.util.Scanner;

public class ClassA {
    int num;
    String name;
    double grade;
    public void callName(){
        System.out.println(name + "을 부릅니다.");
    }

    public void displayProfile(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("이름을 입력하세요 : ");
        name = scanner.next();
        System.out.print("번호를 입력하세요 : ");
        num = scanner.nextInt();
        System.out.print("점수를 입력하세요 : ");
        grade = scanner.nextDouble();
        System.out.println(num + "학번의 학생의 이름은 " + name + "이고, " + grade + "점입니다.");
    }
}
