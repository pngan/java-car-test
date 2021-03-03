public class App {
    public static void main(String[] args)  {

        // Create an instance of a Car
        Car car = new Car(3);
        
        System.out.println(String.format("Initial Car speed is %d ", car.getSpeed()));
        
        System.out.println("Accelerate the car by 5");
        car.Accelerate(5);

        System.out.println(String.format("Final Car speed is %d ", car.getSpeed()));
    }
}