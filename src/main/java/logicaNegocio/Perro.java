package logicaNegocio;

public class Perro extends Animal implements Domestico {

    private TipoHabitat habitat;

    public Perro() {
        this.habitat = TipoHabitat.TERRESTRE;
    }

    public String emitirSonido() {
        return "Ladrido";
    }

    public String obtenerDieta() {
        return "Omnívoro";
    }

    @Override
    public String interactuarConHumano() {
        return "El perro mueve la cola y ladra de felicidad";
    }

    public TipoHabitat getHabitat() {
        return habitat;
    }
}
