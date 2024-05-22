
public class Phone {
    String number;
    String model;
    int weight;

    public static void main(String[] args) {

    }

    public Phone() {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone(String number, String model, int weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public static void recieveCall(String callerName) {
        System.out.println("Calling... " + callerName);
    }

    public static void recieveCall(String callerName, String number) {
        System.out.println("\nCalling... " + callerName + " and his phone number is " + number);
    }

    public static void sendMessage(String... phoneNumbers) {
        System.out.println("Phone numbers to send a message:");

        for (String phoneNumber : phoneNumbers) {
            System.out.println(phoneNumber);
        }
    }

    public String getNumber() {
        return number;
    }
}
