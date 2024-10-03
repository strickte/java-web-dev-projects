import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapPractice {
    public static void main(String[] args) {
        HashMap<Integer, String> classRoster = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String newStudentName;

        System.out.println("Enter your students (or ENTER to finish): ");

        do {
            System.out.print("Student: ");
            newStudentName = input.nextLine();
            if (!newStudentName.equals("")) {
                System.out.print("ID: ");
                int newStudentID = input.nextInt();
                classRoster.put(newStudentID, newStudentName);

                input.nextLine();
            }
        } while(!newStudentName.equals(""));

        input.close();

        System.out.println("\nClass Roster:");

        for (Map.Entry<Integer, String> student : classRoster.entrySet()) {
            System.out.println(student.getValue() + "'s ID: " + student.getKey());
        }

        System.out.println("Number of students in roster: " + classRoster.size());
    }
}