import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Furniture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> furniture = new ArrayList<>();
        double totalSum = 0;

        String regex = ">>(?<furnitureName>\\w+)<<(?<price>\\d+.?\\d*)!(?<quantity>\\d+)";
        Pattern pattern = Pattern.compile(regex);

        String input = scanner.nextLine();
        while (!input.equals("Purchase")) {
            Matcher matcher = pattern.matcher(input);

            if (matcher.find()) {
                String furnitureName = matcher.group("furnitureName");
                double price = Double.parseDouble(matcher.group("price"));
                int quantity = Integer.parseInt(matcher.group("quantity"));

                furniture.add(furnitureName);
                double currentFurniturePrice = price * quantity; //платено за текущата мебел
                totalSum += currentFurniturePrice;

            }
            input = scanner.nextLine();
        }

        System.out.println("Bought furniture:");
        furniture.forEach(System.out::println);
        System.out.printf("Total money spend: %.2f", totalSum);
    }
}
//>>(?<furnitureName>A-Za-z+)<<(?<price>[0-9]+.?[0-9]+)!(?<quantity>[0-9]+)
// >>Sofa<<312.23!3
//>>TV<<300!5
//>>TV<<312.23!3
//>>Monitor<<300!5
//>>Sink<<220!10
