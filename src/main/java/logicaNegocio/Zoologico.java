package logicaNegocio;

public class Zoologico {

    public static void main(String[] args) {

        Leon leon = new Leon();
        Delfin delfin = new Delfin();
        Perro perro = new Perro();

        System.out.println("León:");
        System.out.println("Sonido: " + leon.emitirSonido());
        System.out.println("Dieta: " + leon.obtenerDieta());

        System.out.println("\nDelfín:");
        System.out.println("Sonido: " + delfin.emitirSonido());
        System.out.println("Dieta: " + delfin.obtenerDieta());

        System.out.println("\nPerro:");
        System.out.println("Sonido: " + perro.emitirSonido());
        System.out.println("Dieta: " + perro.obtenerDieta());
        System.out.println("Interacción: " + perro.interactuarConHumano());
    }
}
