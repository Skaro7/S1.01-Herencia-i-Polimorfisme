public class Car {

    //1
    public static final String brand = "Peugot";
    public static String model = "Desconocido";
    public final int power;

    public Car(int power) {
        this.power = power;
        System.out.println("Car power: " + this.power);
    }

    //3.1
    public static void brake(){
        System.out.println("Braking vehicle");
        System.out.println("Braking called on brand:" + brand + "model: " + model);
    }

    //3.2
    public void accelerate(){
        System.out.println("Accelarating vehicle");
        System.out.println("Accelerating on brand:" + brand + "model: " + model + "power: " + power);
    }

}
