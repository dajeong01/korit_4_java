package ch16_objects;

public class ObjectTestMain {
    public static void main(String[] args) {

        ObjectTest objectTest1 = new ObjectTest();

        objectTest1.setName("제다정");
        objectTest1.setAddress("사하구 다대포");

        objectTest1.displayInfo();
        System.out.println();
        System.out.println("------toString() 메서드를 설정할경우------");
        System.out.println(objectTest1);

        Teacher teacher1 = new Teacher("안근수","코리아it");
        System.out.println(teacher1);





    }
}
