/**
 * Text viewer App - prints the contents of a string to the console
 * Created by Karina Bonaccorsi on <current date> .
 */
public class App {
    public static void main(String[] args) {
        String text = "This is a simple test\nOne Two Three\nHello world!";
        for (int i = 0; i < text.length(); ++i) {
            System.out.print(text.charAt(i));
        }
        System.out.println();
    }
}