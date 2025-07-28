import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String input = sc.nextLine();
        String[] words = input.split(" ");
        String result = "";
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            String reversed = "";

            for (int j = word.length() - 1; j >= 0; j--) {
                reversed = reversed + word.charAt(j);
            }

            result = result + reversed + " ";
        }

        System.out.println("Reversed words:");
        System.out.println(result);
    }
}