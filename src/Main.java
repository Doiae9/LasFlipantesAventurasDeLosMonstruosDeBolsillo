import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.System.currentTimeMillis;

public class Main implements  UtilInterface{
    static ArrayList<Habilidad>habilidades= new ArrayList<>();

    public static void main(String[] args) {
        System.out.println();
        long tiempoinicial = currentTimeMillis();
        //poner la palabra implements y el nombre de la interface
        //

        tiempojugado(tiempoinicial,currentTimeMillis());

    }
    @Override
    public void tiempoJugado(long tiempoInicial, long tiempoFinal) {
        System.out.println(tiempoInicial-tiempoFinal);

    }

    @Override
    public void mostrarMenu() {
Scanner leer = new Scanner(System.in);
        System.out.println("1-. Explorar");
        System.out.println("2-. ");
        String Esc;
        Esc=leer.next();
    switch (Esc){

    }
    }

    @Override
    public Pokemon crearPokemonAleatorio() {
        return null;
    }

    @Override
    public <T> T sacarAleatorio(ArrayList<T> arrayList) {
        return null;
    }


    @Override
    public String[] debilYFuerteAleatorio(String tipo) {
        String[] debiles= new String[2];
        switch (tipo){
            case "agua":
                debiles[0] = "elec";
                debiles[1] = "fuego";

        }

        return new String[0];

    }

    @Override
    public String[] nombresAleatorios(String tipo) {

        return new String[0];
    }
}
//static no necesitas llamar objetos
//mostrar menu.
