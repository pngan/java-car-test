
public class Car {

    private int speed;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int Accelerate(int deltaSpeed) {
        this.speed += deltaSpeed;
        return this.speed;
    }

    public Car() {
        this(0);
    }

    public Car(int initialSpeed) {
        super();
        this.speed = initialSpeed;
    }
}