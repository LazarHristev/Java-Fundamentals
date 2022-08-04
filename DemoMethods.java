import java.util.Scanner;

public class DemoMethods {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        printHello();
// = Arrays.stream(scanner.nextLine().split(" "))
//                .mapToInt(Integer::parseInt)
//                .toArray();
    }
    public static void printHello() {
        System.out.println("Hello");
    }
}
