public class Main {
    public static void main(String[] args) {

        //primera instancia
        System.out.println("Trigger Static");

        //acceso miembro estatico
        System.out.println(PercussionInstrument.class);

        //creando 3 instancias de objetos
        Instruments wind = new WindInstrument("Trompeta", 270);
        Instruments stringInstrument = new StringInstrument("Contrabaix", 1800);
        Instruments percussion = new PercussionInstrument("Bombo", 100);

        //polimorfismo
        wind.play();
        stringInstrument.play();
        percussion.play();
    }

}
