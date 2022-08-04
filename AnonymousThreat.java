import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AnonymousThreat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> texts = Arrays.stream(scanner.nextLine() //"Ivo Johny Tony Bony Mony"
                        .split(" ")) //["Ivo", "Johny", "Tony", "Bony", "Mony"]
                .collect(Collectors.toList()); //{"Ivo", "Johny", "Tony", "Bony", "Mony"}

        String command = scanner.nextLine();

        while (!command.equals("3:1")) {

            if (command.contains("merge")) {

                int startIndex = Integer.parseInt(command.split(" ")[1]);
                int endIndex = Integer.parseInt(command.split(" ")[2]);

                if (startIndex < 0) {
                    startIndex = 0;
                }

                if (endIndex > texts.size() - 1) {
                    endIndex = texts.size() - 1;
                }


                boolean isValidIndexes =  startIndex <= texts.size() - 1 && endIndex >= 0 && startIndex < endIndex;

                if (isValidIndexes) {

                    String resultMerge = "";
                    for (int index = startIndex; index <= endIndex; index++) {
                        String currentText = texts.get(index);
                        resultMerge += currentText;
                    }

                    for (int index = startIndex; index <= endIndex; index++) {
                        texts.remove(startIndex);
                    }

                    texts.add(startIndex,resultMerge);

                }
            } else if (command.contains("divide")) {

                int index = Integer.parseInt(command.split(" ")[1]);
                int parts = Integer.parseInt(command.split(" ")[2]);

                String elementForDivide = texts.get(index);
                texts.remove(index);

                int partSize = elementForDivide.length() / parts;

                int beginIndexOfText = 0;
                for (int part = 1; part < parts; part++) {
                    texts.add(index, elementForDivide.substring(beginIndexOfText, beginIndexOfText + partSize));

                    index++; // 2
                    beginIndexOfText += partSize; // 4
                }

                texts.add(index, elementForDivide.substring(beginIndexOfText)); //не зададем краен индекс -> взима до последния
            }
            command = scanner.nextLine();
        }


        System.out.println(String.join(" ", texts));


        }
    }
