import java.util.Scanner;
abstract class Car {
    String model, color;
    int maxSpeed;
    Scanner scanner = new Scanner(System.in);

    public Car() {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    public Car(String model, String color, int maxSpeed) {
        System.out.println("Enter model of the car: ");
        this.model = scanner.nextLine();
        System.out.println("Enter color of the car: ");
        this.color = scanner.nextLine();
        System.out.println("Enter max speed of the car: ");
        this.maxSpeed = scanner.nextInt();
    }

    protected void ReturnInfo () {
        System.out.println("Model: " + model + ", Color: " + color + ", Max Speed: " + maxSpeed);
    }

    protected void Gas() {
        System.out.println("Drive off!");
    }

    abstract void Brake();
}
