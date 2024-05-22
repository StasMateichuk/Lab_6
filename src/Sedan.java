class Sedan extends Car {
    public Sedan(String model, String color, int maxSpeed) {
        super(model, color, maxSpeed);
    }

    @Override
    void Brake() {
        System.out.println("Sedan is braking!");
    }


}
