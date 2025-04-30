package ch16_objects;

public class ObjectTest {
    private String name;
    private String address;

    public ObjectTest() {
        System.out.println("기본 생성자로 객체가 생성되었습니다.");
    }

    public ObjectTest(String name) {
        this.name = name;
        System.out.println("name 매개변수로 객체가 생성되었습니다.");
    }

//    public ObjectTest(String address){
//        this.address = address;
//    }
    /*
     이상의 코드가 오류가 발생하는 이유 :
     1. 매개변수와 field는 서로 다른 개념 호출 상황을 가정하겠습니다.
     -> ObjectTestMain에서 객체 생성을 하게 될겁니다.
     Object object1 = new ObjectTest("여러분이름")
     Object object2 = new ObjectTest("여러분주소")
     */


    public ObjectTest(String name, String address) {
        this.name = name;
        this.address = address;
        System.out.println("name, address 매개변수로 객체가 생성되었습니다.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void displayInfo(){
        System.out.println("이름 : " + getName());
        System.out.println("주소 : " + getAddress());
    }

    // Object 클래스의 메서드들을 override 할겁니다.
    // ----------- alt + ins 해서 toString() 선택하면 밑에 결과값
//    @Override
//    public String toString() {
//        return "ObjectTest{" +
//                "name='" + name + '\'' +
//                ", address='" + address + '\'' +
//                '}';
//    }
    // ------------- 위 코드를 내가 직접 수정
//    @Override
//    public String toString() {
//        return "이름 : " + name +
//                "\n주소 : " + address;
//    }

    // --------밑 코드는 alt + ins -> 매서드 재정의를 눌러서
    // -------- toString()을 누를경우 이 코드일 경우 결과값은 코드가 없을때랑 같음
    // ex) ch16_objects.ObjectTest@41629346
//    @Override
//    public String toString() {
//        return super.toString();
//    }
}
