package ch12_arrays;

public class Array05 {
    public static void main(String[] args) {
        String[] scores = {"A", "B", "C", "D","E"};

        for (int i = 0; i < scores.length; i++){
            scores[i] = scores[i]  + "+";
        }

        for (int i = 0; i < scores.length; i++){
            System.out.print(scores[i] + " ");
        }

    }
}
