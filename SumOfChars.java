import java.util.Scanner;

public class SumOfChars {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int countSymbol = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        for (int i = 0; i < countSymbol; i++) {
            char symbol = scanner.nextLine().charAt(0);
            int asciiCode = (int) symbol;
            sum += asciiCode;
        }
        System.out.printf("The sum equals: %d", sum);

    }
}
