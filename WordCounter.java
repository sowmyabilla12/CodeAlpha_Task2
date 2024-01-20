import java.util.Scanner;

public class WordCounter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a paragraph:");
        String inputParagraph = scanner.nextLine();

        int wordCount = countWords(inputParagraph);

        System.out.println("Word Count: " + wordCount);

        scanner.close();
    }

    private static int countWords(String text) {
        if (text == null || text.isEmpty()) {
            return 0;
        }

        String[] words = text.split("\\s+");
        return words.length;
    }
}

