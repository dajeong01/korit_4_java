package ch13_inheritance;

public class Tiger extends Animal{  // (자식)클래스명 extends (부모)클래스명
    // 부모의 필드를 그대로 사용할 수 있지만,
    // 자식 클래스만의 고유한 필드를 가질 수도 있다.

    private boolean strpied;
    // 이상의 field는 부모에게 없기 때문에 setter / getter도 없겠네요.
    // 그렇다면 고유 필드의 경우에는 메서드를 정의해 줄 필요가 있습니다.

    public boolean isStrpied() {
        return strpied;
    }

    public void setStrpied(boolean strpied) {
        this.strpied = strpied;
    }

    public Tiger() {
    }

    public Tiger(String animalName, int animalAge, boolean strpied) {
        super(animalName, animalAge);       // 부모 필드를 부르는 생성자 키워드 super()
        this.strpied = strpied;             // 자식 고유 필드를 참조하는 기존의 코드 작성 방식
    }

    @Override
    public void move() {
        super.move();               // md파일에서 작성한 super 키워드
        // super는 부모클래스의 객체를 의미함.
        // 즉 이상의 코드는 부모클래스인 Animal 클래스의 move() 메서드를 호출한다는 의미로 볼 수 있음.
        System.out.println("호랑이가 네 발로 걷습니다.");
        // 재정의를 위해 실행문을 추가
    }

    // Tiger 클래스의 고유 메서드 추가
    public void hunt(){
        System.out.println("호랑이가 사냥을 합니다.");
    }
}
