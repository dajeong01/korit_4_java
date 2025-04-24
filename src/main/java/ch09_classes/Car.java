package ch09_classes;

public class Car {
    String color;
    int speed;
    String speedGrade;
// String eval = (speed > 100 ? "빠릅니다." : "그냥저냥입니다.");
// 이거는 speed를 초기값을 0으로 지정했기에 코드를 여기다 넣을시 무슨 차든 속도가 그냥저냥이 나옴


    public void drive(){
        System.out.println(color + " 자동차가 주행중입니다.\n최고속도는 " +speed + "입니다.");
    }

    public String brake(){
        return color + " 자동차가 멈췄습니다.";
    }


    public void displayCarInfo(){
        String eval = (speed > 100 ? "빠릅니다." : "그냥저냥입니다.");
        // 여기서 설정할경우 실시간으로 그때의 speed 값을 보고 판단하는 코드이기에
        // 객체의 speed가 200일시 빠릅니다가 나옴

        System.out.println("이 차의 색깔은 " + color + "이고," +
                " \n최고 속도는" +speed + " km/h입니다. " + eval);
    }
}
/*
        7번줄과 20번줄 String eval = (speed > 100 ? "빠릅니다." : "그냥저냥입니다."); 위치가 중요한 이유
        : 클래스 변수는 객체가 만들어질 때 자동 실행
          메서드는 내가 호출해야 실행되는 행동


 */