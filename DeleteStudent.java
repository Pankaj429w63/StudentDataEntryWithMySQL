package operations;

import java.util.Scanner;

public class DeleteStudent {
    public static void delete() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter PRN of student to delete: ");
        String prn = sc.nextLine();
        // Logic to delete student from the database
        System.out.println("Deleting student with PRN: " + prn);
        // Add logic for deleting student from MySQL
    }
}
