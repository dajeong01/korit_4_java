package ch12_arrays;

import java.util.Scanner;

public class Array04 {
    public void writeNames(String[] names){
        // 메서드가 Scanner를 사용하기땜누에 추가적으로 method내에서 객체 생성할 필요
        Scanner scanner = new Scanner(System.in);

        // element입력을 위한 반복문 작성
        for(int i = 0; i < names.length; i++){
            System.out.print((i + 1) + "번째 학생 이름을 입력하세요 : ");
            names[i] = scanner.nextLine();
        }
    }

    public void printNames(String names[]){
        for (int i = 0; i < names.length; i ++){
            System.out.print(names[i] + " ");
        }
    }

    public void printNames(int names[]){
        for (int i = 0; i < names.length; i ++){
            System.out.print(names[i] + " ");
        }
    }


    public static void main(String[] args) {
        // 객체 생성
        Scanner scanner = new Scanner(System.in);
        Array04 array04 = new Array04();

        // 사용할 변수 목록도 선언
        int numOfStudents = 0;

        System.out.println("몇 명의 학생을 입력하시겠습니까? : ");
        numOfStudents = scanner.nextInt();

        // 빈 배열을 선언 ->  Scanner로 입력 받은 크기만큼의
        String [] names = new String[numOfStudents];

        // 해당 빈 배열에 입력을 하는 메서드 호출
        array04.writeNames(names);

//        for (int i = 0; i < names.length; i ++){
//            System.out.print(names[i] + " / ");
//        }

        System.out.println();

        // 이상의 코드를 참조하여 printNames() 메서드를 call2()유형으로 작성하시오
        array04.printNames(names);

        System.out.println();

        String[] strArr01 = {"10","9","8","7"};
        array04.printNames(strArr01);

        System.out.println();

        int[] strArr02 = {1,2,3,4};
        array04.printNames(strArr02);



    }
}
