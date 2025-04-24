package ch09_classes;

public class Car {
    String color;
    int speed;
    String speedGrade;
//    String eval = (speed > 100 ? "빠릅니다." : "그냥저냥입니다.");


    public void drive(){
        System.out.println(color + " 자동차가 주행중입니다.\n최고속도는 " +speed + "입니다.");
    }

    public String brake(){
        return color + " 자동차가 멈췄습니다.";
    }


    public void displayCarInfo(){
        String eval = (speed > 100 ? "빠릅니다." : "그냥저냥입니다.");
        System.out.println("이 차의 색깔은 " + color + "이고," +
                " \n최고 속도는" +speed + " km/h입니다. " + eval);
    }
}
