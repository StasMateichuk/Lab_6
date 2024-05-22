class Truck extends Car {
    public Truck(String model, String color, int maxSpeed) {
        super(model, color, maxSpeed);
    }

    @Override
    void Brake() {
        System.out.println("Truck is braking!");
    }
}

