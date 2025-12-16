public abstract class Instruments {

    protected String name;
    protected double price;

    static {
        //Bloque estatico. Se ejecuta cuando la se crea una clase, antes que nada en la clase
        System.out.println("Clase instrumento cargada");
    }

    {
        // inicializacion sin static. Se ejecuta antes del constructor cada vez que un objeto es creado
        System.out.println("Bloque inicialización de Instruments no static");
    }

    //constructor
    public Instruments(String name, double price) {
        this.name = name;
        this.price = price;
    }
    public abstract void play();
}