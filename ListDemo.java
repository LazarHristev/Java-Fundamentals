import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<String> items = Arrays.stream(input.split( "")).collect(Collectors.toList());
        List<Integer> numberList = new ArrayList<>();
        for (int i = 0; i < items.size(); i++) {
            numberList.add(Integer.parseInt(items.get(i)));

        }
       ///List<Integer> newList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt)
        // .collect(Collectors.toList()));
        System.out.println();
    }
}
