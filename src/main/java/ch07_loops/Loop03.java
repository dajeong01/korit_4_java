package ch07_loops;

public class Loop03 {
    public static void main(String[] args) {

        int i = 0;

        while (i < 100){
            i++;
            if(i % 10 == 1){
                System.out.println();
            }
            System.out.print(i + " ");
            }
    }
}
