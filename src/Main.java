import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {

            System.out.println("\nОберіть завдання для виконання:");
            System.out.println("1. Завдання 1");
            System.out.println("2. Завдання 2");
            System.out.println("3. Завдання 3");
            System.out.println("4. Завдання 4");
            System.out.println("5. Завдання 5");
            System.out.println("6. Завершити програму");
            System.out.print("\nВаш вибір: ");


            try {
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        TaskName task1 = new TaskName("Завдання 1");
                        task1.printTaskNameInfo();
                        Person stas = new Person();
                        stas.Move();
                        stas.Talk();

                        System.out.println("Name: " + stas.fullName + ", Age: " + stas.age);
                        break;
                    case 2:
                        TaskName task2 = new TaskName("Завдання 2");
                        task2.printTaskNameInfo();
                        Phone phone1 = new Phone("123-456-7890", "POCO");
                        Phone stasPhone = new Phone("987-654-3210", "Google Pixel", 165 );
                        System.out.println("The phone I found: " + phone1.model + ", its number: " + phone1.number + ", its weight: " + phone1.weight);

                        stasPhone.recieveCall("Stas");
                        System.out.println("Phone number: " + stasPhone.getNumber());
                        phone1.recieveCall("Stas", "987-654-3210");

                        phone1.sendMessage("987-654-3210", "555-1234", "888-999-0000");
                        break;
                    case 3:
                        TaskName task3 = new TaskName("Завдання 3");
                        task3.printTaskNameInfo();

                        Shape pyramid = new Pyramid(1.0, 8.0);
                        Shape cylinder = new Cylinder(4.0, 8.0);
                        Shape ball = new Ball(7.0);

                        System.out.println(pyramid.getVolume());
                        System.out.println(cylinder.getVolume());
                        System.out.println(ball.getVolume());

                        break;
                    case 4:
                        TaskName task4 = new TaskName("Завдання 4");
                        task4.printTaskNameInfo();
                        Sedan sedan = new Sedan("Nissan", "Blue", 210);
                        sedan.ReturnInfo();
                        sedan.Gas();
                        sedan.Brake();

                        Truck truck = new Truck("Mercedes", "White", 90);
                        truck.ReturnInfo();
                        truck.Gas();
                        truck.Brake();

                        break;
                    case 5:
                        TaskName task5 = new TaskName("Завдання 5");
                        task5.printTaskNameInfo();
                        StudentPerformance student = new StudentPerformance();
                        student.inputStudentData();
                        student.displayStudentData();
                        double averageGrade = student.calculateAverageGrade();
                        System.out.println("Average Grade: " + averageGrade);

                        break;
                    case 6:
                        System.out.println("\nПрограма завершує роботу.");
                        running = false;
                        break;
                    default:
                        System.out.println("\nНевідома опція. Спробуйте ще раз.");
                }
            } catch (InputMismatchException e) {
                System.out.println("\nНеправильний ввід! Будь ласка, введіть число від 1 до 5.");
                scanner.next();
            }
        }
    }
}