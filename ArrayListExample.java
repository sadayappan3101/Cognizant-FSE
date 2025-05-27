import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListExample {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            ArrayList<String> stdnames = new ArrayList<>();
            System.out.print("The number of students need to be entered: ");
            int c = sc.nextInt();
            sc.nextLine();
            for (int i = 1; i <= c; i++) {
                System.out.print("Enter name " + i + ": ");
                String name = sc.nextLine();
                stdnames.add(name);
            }
            System.out.println("\nStudent Names:");
            for (String name : stdnames) {
                System.out.println(name);
            }
        
    }
}
