import java.util.HashMap;
import java.util.Scanner;
public class HashmapExample {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in); 
            HashMap<Integer, String> stdMap = new HashMap<>();
            System.out.print("Number of students need to be entered: ");
            int c = sc.nextInt();
            for (int i = 1; i <= c; i++) {
                System.out.print("Enter student ID: ");
                int id = sc.nextInt();
                sc.nextLine();
                System.out.print("Enter student name: ");
                String name = sc.nextLine();
                stdMap.put(id, name);
            }
            System.out.print("\nEnter student ID to search: ");
            int searchId = sc.nextInt();
            if (stdMap.containsKey(searchId)) {
                System.out.println("Student Name: " + stdMap.get(searchId));
            } else {
                System.out.println("Student ID not found.");
            }
    }
}
