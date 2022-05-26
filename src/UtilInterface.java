import java.util.ArrayList;

public interface UtilInterface {
    //funcion que regrea el tiempo actual en milisegundos
    void tiempoJugado(long tiempoInicial, long tiempoFinal);
    void mostrarMenu();
    Pokemon crearPokemonAleatorio();
    //GenericoAleatorio
    <T> T sacarAleatorio(ArrayList<T> arrayList);
    //String[] Debil y fuerte
    String[] debilYFuerteAleatorio(String tipo);

    //String[] Nombres Pokemon = devolver arreglo de string
    //Colocar los tipos en un switch
    String[] nombresAleatorios(String tipo);

}
