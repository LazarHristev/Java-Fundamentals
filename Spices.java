import java.util.Scanner;

public class Spices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int source = Integer.parseInt(scanner.nextLine());
        int days = 0;
        int totalSpices = 0;
        while (source >= 100) {
            int spices = source - 26;
            totalSpices += spices;
            days++;
            source = source - 10;

        }
        System.out.println(days);
        if (totalSpices >= 26) {
            totalSpices -= 26;

        }
        System.out.println(totalSpices);

    }
}
