package ch09_classes;

public class CarMain {
    public static void main(String[] args) {

        Car car1 = new Car();
        Car car2 = new Car();// 객체 생성시에 기본생성자이기 때문에
        // color = null, speed = 0, speedGrade = null, eval = "그냥저냥입니다"로 생성

        car1.color = "빨강";
        car1.speed = 100;

        car2.color = "노랑";
        car2.speed = 200;

        car1.drive();
        System.out.println(car1.brake());
        car1.displayCarInfo();

        System.out.println();

        car2.drive();
        System.out.println(car2.brake());
        car2.displayCarInfo();

    }
}
