import java.util.Scanner;

public class Calculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String actionInput = scanner.nextLine();
        int firstNumber = Integer.parseInt(scanner.nextLine());

        int secondNumber = Integer.parseInt(scanner.nextLine());
        switch (actionInput) {
            case "add":
                addNumbers(firstNumber, secondNumber);
                break;
            case "multiply":
                multiplyNumbers(firstNumber, secondNumber);
                break;
            case "subtract":
                subtractNumbers(firstNumber, secondNumber);
                break;
            case "divide":
                divideNumbers(firstNumber, secondNumber);
                break;

        }
    }

    public static void addNumbers(int firstNum, int secondNum) {
        int result = firstNum + secondNum;
        System.out.println(result);
    }

    public static void multiplyNumbers(int firstNum, int secondNum) {
        int result = firstNum * secondNum;
        System.out.println(result);
    }

    public static void subtractNumbers(int firstNum, int secondNum) {
        int result = firstNum - secondNum;
        System.out.println(result);
    }

    public static void divideNumbers(int firstNum, int secondNum) {
        int result = firstNum / secondNum;
        System.out.println(result);
    }
}
