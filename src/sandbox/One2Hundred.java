package sandbox;

public class One2Hundred {
    static void main() {
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            sum = sum + i;
            System.out.println(i);
        }
        System.out.println(sum);
    }
}