public class StringInstrument extends Instruments{

    public StringInstrument(String name, double price){
        super(name,price);
    }

    @Override
    public void play() {
        System.out.println("Està sonant un instrument de corda.");
    }
}
