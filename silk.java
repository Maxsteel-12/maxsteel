import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = scanner.nextInt() + scanner.nextInt();
        System.out.println(sum);
        scanner.close();
    }
}
