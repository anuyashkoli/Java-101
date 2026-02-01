public class limits {
    public static void main(String[] args) {
        int iterator = 1;
        while (iterator <= 100){
            for (iterator = 1; iterator <= 100; iterator++) {
                System.out.println("Value of iterator: " + iterator);
            }
            if (iterator == 101) break;
            System.out.println("\nwhile Loop: " + iterator);
        }
    }
}
