import java.util.*;

public class StudentSorter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of entries
        int N = scanner.nextInt();
        scanner.nextLine(); // Consume the newline

        // List to store students' roll numbers and marks
        List<Student> students = new ArrayList<>();

        // Read each student's data
        for (int i = 0; i < N; i++) {
            String rollNumber = scanner.next();
            int marks = scanner.nextInt();
            students.add(new Student(rollNumber, marks));
        }

        // Sort students based on roll numbers
        Collections.sort(students);

        // Print the sorted students
        for (Student student : students) {
            System.out.println(student.rollNumber + " " + student.marks);
        }

        scanner.close();
    }
}

// Student class implementing Comparable for custom sorting
class Student implements Comparable<Student> {
    String rollNumber;
    int marks;

    Student(String rollNumber, int marks) {
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    @Override
    public int compareTo(Student other) {
        // Split roll numbers into class (letters) and number parts
        String thisClass = rollNumber.replaceAll("\\d", "");
        int thisNumber = Integer.parseInt(rollNumber.replaceAll("\\D", ""));

        String otherClass = other.rollNumber.replaceAll("\\d", "");
        int otherNumber = Integer.parseInt(other.rollNumber.replaceAll("\\D", ""));

        // Compare class part first, then number part
        int classComparison = thisClass.compareTo(otherClass);
        if (classComparison == 0) {
            return Integer.compare(thisNumber, otherNumber);
        } else {
            return classComparison;
        }
    }
}
