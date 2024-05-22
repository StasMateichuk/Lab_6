

public class Person {
    protected String fullName;
    protected int age;

    public static void main(String[] args) {

    }

    public void Move() {
        System.out.println(fullName + " is moving!");
    }

    public void Talk() {
        System.out.println(fullName + " is talking!\n");
    }

    public Person() {
        this.fullName = "Stas";
        this.age = 18;
    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }
}