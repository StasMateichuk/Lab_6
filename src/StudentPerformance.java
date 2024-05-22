import java.util.Scanner;

public class StudentPerformance {
    private String lastName;
    private String firstName;
    private double[] grades;

    public void inputStudentData() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student's last name: ");
        lastName = scanner.nextLine();

        System.out.print("Enter student's first name: ");
        firstName = scanner.nextLine();

        grades = new double[3];
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter grade for subject " + (i + 1) + ": ");
            grades[i] = scanner.nextDouble();
        }
    }

    public void displayStudentData() {
        System.out.println("Student: " + lastName + " " + firstName);
        System.out.println("Grades:");
        for (int i = 0; i < 3; i++) {
            System.out.println("Subject " + (i + 1) + ": " + grades[i]);
        }
    }

    public double calculateAverageGrade() {
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        return sum / grades.length;
    }

}

