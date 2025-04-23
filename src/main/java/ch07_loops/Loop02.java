package ch07_loops;
/* While 반복문
형식
while(조건식) {
반복실행문
    }

 */
public class Loop02 {
    public static void main(String[] args) {

        int day = 1;
        while (day < 6) {
            int lesson = 1;
             while (lesson < 4){
                System.out.println(day+ "일차 " + lesson +"교시입니다.");
                lesson++;
            }
            day ++;
        }

        int num = 2;
        while (num < 10){
            int x = 1;
            while (x < 10){
                System.out.println(num + " X " + x + " = " + num*x);
                x++;
            }
            num ++;
        }
    }
}
