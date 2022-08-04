import java.util.Scanner;

public class TopInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        for (int number = 1; number <= n; number++) {
            if (isSumDigitDivisibleBy8(number) && isContainsOddDigit(number)) {
                System.out.println(number);
            }
        }
    }

    private static boolean isSumDigitDivisibleBy8(int number) {
        int sumDigits = 0;
        while (number > 0) {
            int lastDigit = number % 10;
            sumDigits += lastDigit;
            number = number / 10;
        }
        return sumDigits % 8 == 0;
    }

    private static boolean isContainsOddDigit(int number) {
        int lastDigit = number % 10;
        if (lastDigit % 2 == 1) {
            return true;
        }
        number /= 10;

        return false;
    }
}



