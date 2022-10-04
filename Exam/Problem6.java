import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        for (int i = 1; i <= n % 10; i++) {
            for (int j = 1; j <= n / 10 % 10; j++) {
                for (int k = 1; k <= n / 100 % 10; k++) {
                    int result = i * j * k;
                    System.out.printf("%d * %d * %d = %d;%n", i, j, k ,result);
                }
            }
        }
    }
}
