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
        System.out.println("Llevas: " +(tiempoInicial-tiempoFinal));

    }

    @Override
    public void mostrarMenu() {
Scanner leer = new Scanner(System.in);
        System.out.println("1-. Explorar");
        System.out.println("2-. Entrar a la tienda");
        System.out.println("3-. Tirar objeto");
        System.out.println("4-. ");
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
        String[] BancoDF= new String[2];
        switch (tipo){
            case "agua":
                BancoDF[0] = "electrico";
                BancoDF[1] = "fuego";
            case "electrico":
                BancoDF[0] = "tierra";
                BancoDF[1] = "agua";
            case "tierra":
                BancoDF[0] = "hielo";
                BancoDF[1] =  "acero";
            case"hielo":
                BancoDF[0] = "tierra";
                BancoDF[1] = "roca";
            case"fuego":
                BancoDF[0] = "planta";
                BancoDF[1] = "agua";
            case "acero":
                BancoDF[0] = "hielo";
                BancoDF[1] = "fuego";
            case "roca":
                BancoDF[0] = "planta";
                BancoDF[1] = "roca";
            case "lucha":
                BancoDF[0] = "psiquico";
                BancoDF[1] = "roca";
            case "psiquico":
                BancoDF[0] = "siniestro";
                BancoDF[1] = "lucha";
            case "siniestro":
                BancoDF[0] = "lucha";
                BancoDF[1] = "psiquico";
            case "fantasma":
                BancoDF[0] = "";
                BancoDF[1] = "";
            default:
                BancoDF[0] = "lucha";
                BancoDF[1] = "fantasma";
        }

        return new String[0];

    }

    @Override
    public String[] nombresAleatorios(String tipo) {
    String[] BancoNombres= new String[4];
    switch (tipo){
        case "agua":
           BancoNombres [0]=""
            [1]
        }

    }
        return new String[0];
    }
}
//static no necesitas llamar objetos
//mostrar menu.
