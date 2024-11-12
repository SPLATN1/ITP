import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String filePath = "input.txt";

        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\79884\\IdeaProjects\\gittask3\\src\\input.txt"))) {
            String line = br.readLine();
            if (line != null) {
                String[] numbers = line.split(" ");
                if (numbers.length != 2) {
                    System.out.println("Error: File must contain exactly two integers.");
                    return;
                }

                try {
                    int numerator = Integer.parseInt(numbers[0]);
                    int denominator = Integer.parseInt(numbers[1]);
                    int result = numerator / denominator;
                    System.out.println("Result: " + result);
                } catch (ArithmeticException e) {
                    System.out.println("Error: Division by zero is not allowed.");
                } catch (NumberFormatException e) {
                    System.out.println("Error: One of the inputs is not a valid integer.");
                }
            } else {
                System.out.println("Error: File is empty.");
            }
        } catch (IOException e) {
            System.out.println("Error: An error occurred while reading the file.");
        }
    }
}
