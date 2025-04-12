package operations;

import db.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class AddStudent {
    public static void add() {
        try (Scanner sc = new Scanner(System.in)) {
            Connection conn = DBConnection.getConnection();

            System.out.print("Enter PRN: ");
            String prn = sc.nextLine();
            System.out.print("Enter Name: ");
            String name = sc.nextLine();
            System.out.print("Enter DOB (YYYY-MM-DD): ");
            String dob = sc.nextLine();
            System.out.print("Enter Marks: ");
            double marks = sc.nextDouble();

            String sql = "INSERT INTO students (prn, name, dob, marks) VALUES (?, ?, ?, ?)";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, prn);
            pst.setString(2, name);
            pst.setString(3, dob);
            pst.setDouble(4, marks);

            pst.executeUpdate();
            System.out.println("Student added successfully!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
