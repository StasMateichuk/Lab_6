public class Pyramid extends Shape{
    private double square;
    private double height;

    public Pyramid(double square, double height) {
        super(1.0/3 * square * height);
        this.square = square;
        this.height = height;
    }
}
