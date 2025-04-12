package operations;

import java.util.Scanner;

public class SearchStudent {
    public static void search() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter PRN or Name to search: ");
        String searchQuery = sc.nextLine();
        // Logic to search students in the database by PRN or Name
        System.out.println("Searching for student: " + searchQuery);
        // Add logic for searching student from MySQL
    }
}
