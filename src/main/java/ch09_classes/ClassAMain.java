package ch09_classes;

import java.util.Scanner;

public class ClassAMain {
    public static void main(String[] args) {
        // 객체생성
        ClassA classA1 = new ClassA();
        // 이상에서 볼 수 있듯이
        // 사실 여태까지 저희는 Scanner 클래스를 import
        // 한다고 했지만
        // Scanner 클래스의 인스턴스를 생성하고 있었습니다.

        // 객체 생성 방법
        // 클래스명 객체명 = new 클래스명();
        classA1.num = 100;
        classA1.name = "김일";

        // classA2 객체를 생성하고,
        // num에 200, name에 김이
        ClassA classA2 = new ClassA();
        classA2.num = 200;
        classA2.name = "김이";
        System.out.println(classA2.name + "의 번호는 " + classA2.num + "입니다.");

        System.out.println();
        classA1.callName();
        classA2.callName();

        /*
            Scanner의 인스턴스를 생성하고
            ClassA의 인스턴스인 classA3생성
         */
        ClassA classA3 = new ClassA();
        classA3.displayProfile();
    }
}
