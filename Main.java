/*
 * Name: Pankaj Yadav
 * PRN: 23070126166
 * Batch: AIML 2023–2027
 */

import java.util.Scanner;
import operations.AddStudent;
import operations.DeleteStudent;
import operations.DisplayStudents;
import operations.SearchStudent;
import operations.UpdateStudent;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("\n=== Student Data Entry System ===");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> AddStudent.add();
                case 2 -> DisplayStudents.display();
                case 3 -> SearchStudent.search();
                case 4 -> UpdateStudent.update();
                case 5 -> DeleteStudent.delete();
                case 6 -> {
                    System.out.println("Exiting...");
                    System.exit(0);
                }
                default -> System.out.println("Invalid choice!");
            }
        }
    }
}
