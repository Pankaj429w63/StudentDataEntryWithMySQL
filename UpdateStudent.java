package operations;

import java.util.Scanner;

public class UpdateStudent {
    public static void update() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter PRN of student to update: ");
        String prn = sc.nextLine();
        // Logic to update student information in the database
        System.out.println("Updating student with PRN: " + prn);
        // Add logic for updating student information in MySQL
    }
}

