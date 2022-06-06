
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
public class Entrenador extends Personaje {
    //region - String
    // PokemonMascota - Pokemon
    //torneosGanados- int
    //pokedex - ArrayList<Pokemon>
    //mochila - ArrayList<Objeto>
    private String region;
    private Pokemon mascota;
    private int torneosganados;
    ArrayList<Pokemon> pokedex;
    ArrayList<Objeto> mochila;
    private double dinero;

    public Entrenador(String nombre, char nivel,
                      char genero, String region, Pokemon mascota, int torneosganados,
                      ArrayList<Pokemon> pokedex, ArrayList<Objeto> mochila, double dinero) {
        super(nombre, nivel, genero);
        this.region = region;
        this.mascota = mascota;
        this.torneosganados = torneosganados;
        this.pokedex = pokedex;
        this.mochila = mochila;
        this.dinero = dinero;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public Pokemon getMascota() {
        return mascota;
    }

    public void setMascota(Pokemon mascota) {
        this.mascota = mascota;
    }

    public int getTorneosganados() {
        return torneosganados;
    }

    public void setTorneosganados(int torneosganados) {
        this.torneosganados = torneosganados;
    }

    public ArrayList<Pokemon> getPokedex() {
        return pokedex;
    }

    public void setPokedex(ArrayList<Pokemon> pokedex) {
        this.pokedex = pokedex;
    }

    public ArrayList<Objeto> getMochila() {
        return mochila;
    }

    public void setMochila(ArrayList<Objeto> mochila) {
        this.mochila = mochila;
    }

    public double getDinero() {
        return dinero;
    }

    public void setDinero(double dinero) {
        this.dinero = dinero;
    }
    //pelear- (Abstracto implementacion)
    //nivel 1 (pokemon y entrenador) -> 10xp
    // nivel n (pokeomn y entrenador) -> 10 Xp * 1.5
    // escoger pokemon del pokedex
    // Si su Hp es superior a 15
    //Y su atributo fuerte coincide con el pokemon a pelear
    //arreglo de pokemones a usar en la pelea
    //darle a escoger pokemon al entrenador
    // mostrar las estadisitcas (HP, velocidad, ataque)
    //menu para curar, aumentar ataque o velocidad.
    //si escoge pelear
    //llamar metodo pelear del pokemon
    //si escoge curar
    //Hay que validar si hay pocion/baya de curacion, usar
    //si escoge velocidad
    //Hay que validar si hay pocion/baya de velocidad, usar
    //si escoge ataque
    //Hay que validar si hay pocion/baya de ataque, usar
    //llamar al método pelear del pokemon
    //aquí acaba el ciclo

    //ganar (metodo)-> El entrenador opuesto ya no tiene pokemones
    // Perder (metodo) -> yo me queodo sin pokemon

    //TODO metodos tirar objeto, intercambiar porkémon.
    //Crear un menú
    public boolean tirarObjeto(int res) {
        Scanner leer = new Scanner(System.in);
        try{
            System.out.println("Que deseas tirar?");
            for (int i = 0; i < mochila.size(); i++) {
                System.out.println(1+i +"-" + mochila.get(i).getNombre());
            }
            res = leer.nextInt();
            if (res>mochila.size()-1) {
                System.out.println("Que raro, este objeto no esta en la mochila...");
                return false;
            }else {
                System.out.println("Tiraste" + mochila.get(res - 1).getNombre());
                mochila.remove(res - 1);
            }
            } catch(IndexOutOfBoundsException e){
            System.out.println("El objeto indicado no existe" );
            return false;
            }
        return true;
    }

    //Todo probar metodo
    public boolean intercambiar(ArrayList<Pokemon> pokedexCPU) {
        Random random= new Random();
        Scanner leer = new Scanner(System.in);
        int prop, propCPU;
        boolean decision;
        System.out.println("Pokemon del otro entrenador");
        for (int i = 0; i < pokedexCPU.size(); i++) {
            System.out.println(1+i +"- " + pokedexCPU.get(i));
            //int indice = 1;
           // for (Pokemon pokemon: pokedexOpuesto) {
               // System.out.println(indice+" . ");
              //  System.out.println(pokemon);
               // indice++;
            }
        System.out.println("Selecciona el pokemon que deseas del otro entrenador");
        propCPU = leer.nextInt()-1;
        System.out.println("Selecciona tu propuesta de intercambio");
        mostrarPokedex(pokedex);
        prop = leer.nextInt()-1;
        System.out.println("Te lo cambio por "+pokedex.get(prop));
        decision = ((random.nextInt(100)) >60) ? true : false;
        if (decision) {
            Pokemon aux = pokedex.get(prop);
            pokedex.set(prop, pokedexCPU.get(propCPU));
            System.out.println("¡Adios " + pokedex.get(prop).getNombre() + " !");
            pokedex.add(pokedexCPU.get(propCPU ));
            pokedexCPU.add(pokedex.get(prop ));
            pokedex.remove(prop);
            pokedexCPU.remove(propCPU); //Proceso repetido?
            System.out.println("Dile hola a tu nuevo " + pokedexCPU.get(propCPU).getNombre());

            return true;
        } else {
            System.out.println("El otro entrenador no aceptó tu propuesta");
            return false;
        }}
        public void mostrarMochila() {
            System.out.println("los objetos disponibles son: ");
            int indice = 1;
            for (Objeto objeto : mochila) {
                System.out.println(indice + " . ");
                System.out.println(objeto);
                indice++;

            }
        }

    public void mostrarPokedex(ArrayList<Pokemon> Pokemones){
        System.out.println("los Pokemones disponibles son: ");
        int indice = 1;
        for (Pokemon objeto : Pokemones) {
            System.out.println(indice+" . ");
            System.out.println(objeto);
            indice++;
        }
    }

    @Override
    public boolean pelear(Pokemon PokemonContrario) {
        //escoger pokemmon para pelear

        Scanner scanner = new Scanner(System.in);
        ArrayList<Pokemon> paraPelea = new ArrayList<>();
        mostrarPokedex(pokedex);
        System.out.println("Escoge 3 pokemones");
        for(int i=1; i<3; i++) {
            System.out.println("ingresa pokemon");
            try {

                paraPelea.add(pokedex.get(scanner.nextInt() - 1));
            } catch (InputMismatchException e) {
                System.out.println("Vuelva a ingresar un pokemon, ingrese un número");
                scanner.nextLine();
                i--;
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Este pokemon no existe");
                i--;
            }
        }
        int respuesta=0;
        do{
            System.out.println("1. Pelear");
            System.out.println("2. Usar Baya/Poción");
            System.out.println("3. Huir");
            respuesta = scanner.nextInt();
            if(paraPelea.size() !=0) {
                if (respuesta == 1) {
                    System.out.println("¿Con cual pokemon deseas pelear?");
                    mostrarPokedex(paraPelea);
                    int eleccion = scanner.nextInt();
                    //validar si es true o false
                    if(!paraPelea.get(eleccion).pelear(PokemonContrario)){
                        paraPelea.remove(eleccion);
                        return false;
                    }else{
                        return true;
                    }

                } else if (respuesta == 2) {
                    //
                    mostrarMochila();
                    System.out.println("Escoge la baya o pocion para el pokemon");
                    int eleccion = scanner.nextInt();
                    System.out.println("Escoge el pokemon para dar baya/pocion");
                    mostrarPokedex(paraPelea);
                    //validar si retorno true o false
                    mochila.get(eleccion - 1).usar(paraPelea.get(scanner.nextInt()));
                    return true;
                } else if(respuesta==3) {
                    System.out.println("Escapaste sin problemas");
                    return false;
                }
                }else{
                return false;
            }
        }while (respuesta!=0);
        //mostrar pokedex
        //el usuario escoge 3
        //
        return false;
    }

    @Override
    public String toString() {
        return "Entrenador{" +
                "region='" + region + '\'' +
                ", mascota=" + mascota +
                ", torneosganados=" + torneosganados +
                ", pokedex=" + pokedex +
                ", mochila=" + mochila +
                ", dinero=" + dinero +
                ", nombre='" + nombre + '\'' +
                ", nivel=" + nivel +
                ", genero=" + genero +
                '}';
    }
}

