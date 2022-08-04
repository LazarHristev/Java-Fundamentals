import java.util.Scanner;

public class CaesarCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        StringBuilder encryptedText = new StringBuilder();
        for (int position = 0; position <= text.length() - 1; position++) {
            char symbol = text.charAt(position);
            char encryptSymbol = (char)(symbol + 3);
            encryptedText.append(encryptSymbol);
        }
        System.out.println(encryptedText);
    }
}
