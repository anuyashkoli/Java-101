public class FuzzBuzz {
    public static void main(String[] args) {

        for (int i = 0; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.println(i + " FUZZ");
            } else if (i % 5 == 0) {
                System.out.println(i + " BUZZ");
            } else {
                System.out.println(i);
            }
        }
    }
}
