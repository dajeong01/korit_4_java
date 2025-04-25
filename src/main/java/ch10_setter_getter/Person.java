package ch10_setter_getter;

public class Person {
    // 필드 선언
    private String name;
    private int age;

    public Person() {
        System.out.println("기본생성자를 통해 Person 클래스의 인스턴스가 생성되었습니다.");
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(int age) {
        this.age = age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("이름이 입력되었습니다 : " + name);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age<0 || age > 200){
            System.out.println("불가능한 나이 입력입니다. 현재 나이 " + this.age);
            return;
        }
        System.out.println("나이가 입력되었습니다.");
        System.out.println("변경 전 나이 : " + this.age);
        this.age = age;
        System.out.println("변경 후 나이 : " + this.age);
    }

    void showInfo(){
        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
        System.out.println();
    }
}

    /*
    이제부터 setAge를 자동완성한 것을 기본으로 두고, 편집할겁니다.
    나이가 0 미만이거나 200 초과인 age가 매개변수로 들어오게 된다면,
    객체의 속성에 들어갈 수 없도록 할 예정입니다.
    md 파일을 참조하여 setAge를 완성하고
    PersonMain에서 person1객체를 '기본생성자로 생성'하고
    person1.setName("김일");
    person1.setAge(243);을 입력했을 때,
    person1.setAge(21)
    콘솔창의 실행 예시로

    실행 예
    기본생성자를 통해 Person 클래스의 인스턴스가 생성되었습니다.
    이름이 입력되었습니다 : 김일
    불가능한 나이 입력입니다. 현재 나이 : 0
    나이가 입력되었습니다.
    변경 전 나이 : 0
    변경 후 나이 : 21
 */

/*
    메서드 | 뜻 | 역할
    getName()       | 이름 알려줘 | name 변수 값 가져오기
    setName("이름")  | 이름 정해줘 | name 변수 바꾸기
    getAge()        | 나이 알려줘 | age 변수 값 가져오기
    setAge(숫자)     | 나이 정해줘 | age 변수 바꾸기 (유효성 검사도 포함)
 */



//    Person(){
//        System.out.println("기본생성자");
//    }
//    Person(String name){
//        System.out.println("String 매개 생성자");
//        this.name = name;
//    }
//    Person(int age){
//        this.age = age;
//        System.out.println("int 매개 생성자");
//    }
//    Person(String name, int age){
//        this.age = age;
//        this.name = name;
//        System.out.println("String, int 둘 다 매개 생성자");
//    }
//
//    void showInfo(){
//        System.out.println("이름 : " + name);
//        System.out.println("나이 : " + age);
//        System.out.println();
//      }

