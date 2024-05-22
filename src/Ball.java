public class Ball extends SolidOfRevolution{

    public Ball(double radius) {
        super(4.0 / 3 * 3.1415 * Math.pow(radius, 3), radius);
    }
}

