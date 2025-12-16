public class Main {
    public static void main(String[] args) {

        //4.1 Static method without creating an object
        System.out.println("Break without object");
        Car.brake();
        System.out.println();

        //4.2 Create car instance and call accelerate
        System.out.println("Car instance with accelerate");
        Car car1 = new Car(451);
        car1.accelerate();
        System.out.println();

        //Document behaviours

        //static
        System.out.println("Static car model: " + Car.model);
        System.out.println();

        Car car2 = new Car(482);
        System.out.println("Car2 model: " + Car.model);
        System.out.println();


        //change static model
        Car.model = "Sport+";
        System.out.println("Change static model to: " + Car.model);
        System.out.println();

        //final atributes
        System.out.println("Car1 power: " + car1.power);
        System.out.println("Car2 power: " + car2.power);
    }
}
