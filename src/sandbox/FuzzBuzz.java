package sandbox;

public class FuzzBuzz {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if(i % 3 == 0 && i % 5 == 0) {
                System.out.println(i + " FUZZBUZZ");
            } else if (i % 3 == 0) {
                System.out.println(i + " FUZZ");
            } else if (i % 5 == 0) {
                System.out.println(i + " BUZZ");
            } else {
                System.out.println(i);
            }
        }
    }
}

// Fuzz for 3, Buzz for 5 and FuzzBuzz for 3 && 5