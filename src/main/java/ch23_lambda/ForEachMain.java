package ch23_lambda;

import java.util.Arrays;
import java.util.List;

public class ForEachMain {
    public static void main(String[] args) {
        // List 생성 -> 여태까지 안 쓴 방법 쓸겁니다. List의 선언 및 초기화
        List<String> fruits = Arrays.asList("사과", "딸기", "블루베리");

        // forEach 예제
        fruits.forEach(fruit -> System.out.println("과일 목록 : " + fruit));

        System.out.println();

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        numbers.forEach(number -> System.out.println("두 배 값 : " + (number * 2)));
        numbers.forEach(number -> System.out.print((number * 2)+ " "));
    }
}
