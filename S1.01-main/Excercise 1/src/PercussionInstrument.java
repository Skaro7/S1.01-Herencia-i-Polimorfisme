public class PercussionInstrument extends Instruments{

    public PercussionInstrument(String name, double price) {
        super(name, price);
    }

    @Override
    public void play() {
        System.out.println("Està sonant un instrument de percussió.");
    }
}
