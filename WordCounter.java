import java.util.Scanner;

public class WordCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a sentence: ");
            String sentence = scanner.nextLine().trim();

            if (sentence.isEmpty()) {
                System.out.println("The sentence has 0 words.");
            } else {
                String[] words = sentence.split("\\s+");
                System.out.println("The sentence has " + words.length + " words.");
            }
        }
    }
}
