import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class FileWriting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.print("Enter a string to write to the file: ");
            String input = sc.nextLine();
            try {
            FileWriter w = new FileWriter("output.txt"); 
            w.write(input);
                System.out.println("Data has been written to output.txt file successfully.");
            } catch (IOException e) {
                System.out.println("An error occurred while writing to the file.");
                e.printStackTrace();
            }
            }
}
