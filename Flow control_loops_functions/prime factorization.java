import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        System.out.println("Prime factors of " + number + ":");
        primeFactorization(number);
    }

    public static void primeFactorization(int number) {
        for (int i = 2; i <= Math.sqrt(number); i++) {
            while (number % i == 0) {
                System.out.println(i);
                number = number/i;
            }
        }

        if (number > 1) {
            System.out.println(number);
        }
    }
}
