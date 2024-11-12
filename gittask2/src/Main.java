import java.io.*;

public class Main {
    public static void main(String[] args) {
        String inputFilePath = "input.txt";
        String outputFilePath = "output.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFilePath));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath))) {

            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }
            System.out.println("File copied successfully.");

        } catch (FileNotFoundException e) {
            System.err.println("Input file does not exist: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("No write permission for the output file: " + e.getMessage());
        }
    }
}
