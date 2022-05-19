
import java.util.ArrayList;
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
    ArrayList<Pokemon> pokedexCPU;
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
    //escoger dos fuertes y un debil aleatoriamente
    //si no tiene fuertes poner 3 aleatorios
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
    public void tirarObjeto() {
        int res;
        Scanner leer = new Scanner(System.in);
        do {
            System.out.println("Que deseas tirar?, si ya no deseas tirar ningun objeto pulsa 0");
            for (int i = 0; i < mochila.size(); i++) {
                System.out.println(i + 1 + "-" + mochila.get(i).getNombre());
            }
            res = leer.nextInt();
            if (res != 0) {
                mochila.remove(res - 1);
                System.out.println("Objeto eliminado");
            }
        } while (res != 0);
    }

    public boolean intercambiar() {
        Scanner leer = new Scanner(System.in);
        int prop, propCPU;
        double decision = 0;
        System.out.println("Escoge un pokemon para intercambiar");
        for (int i = 0; i < pokedex.size(); i++) {
            System.out.print(i + 1 + "- " + pokedex.get(i).getNombre());
        }
        System.out.println("Pokemon del otro entrenador"); //usar un nombre de un arraylist de nombres. prop

        for (int i = 0; i < pokedexCPU.size(); i++) {
            int index = (int) (Math.random() * pokedexCPU.size());
            System.out.println(i + 1 + "- " + pokedexCPU.get(index));
            //propuesta, randomizar el pokedex de la CPU en base a los pokemon creados.
        }
        System.out.println("Selecciona el pokemon que deseas del otro entrenador");
        propCPU = leer.nextInt();
        System.out.println("Selecciona tu propuesta de intercambio");
        prop = leer.nextInt();
        decision = Math.random() * 100;
        if (decision < 50) {
            System.out.println("El otro entrenador no aceptó tu propuesta");
            return false;
        } else {
            System.out.println("¡Adios" + pokedex.get(prop - 1).getNombre() + " !");
            pokedex.add(pokedexCPU.get(propCPU - 1));
            pokedexCPU.add(pokedex.get(prop - 1));
            pokedex.remove(prop - 1);
            pokedexCPU.remove(propCPU - 1);
            System.out.println("Dile hola a tu nuevo" + pokedexCPU.get(propCPU - 1));
            return true;
        }
        //public boolean intercambiarPokemon(ArrayList<Pokemon> pokedexOpuesto){
        /*System.out.println("Pokemones disponibles del entrenador Opuesto: ");
        int indice = 1;
        for (Pokemon pokemon: pokedexOpuesto) {
            System.out.println(indice+" . ");
            System.out.println(pokemon);
            indice++;
        }

        System.out.println("¿Que pokemon deceas intercambiar?");
        int indicePokemonOpuesto = sc.nextInt()-1;
        System.out.println("Que pokemon ofreses?");
        mostrarPokedex();
        int indicePokemonPropio = sc.nextInt()-1;
        System.out.println("Te lo cambio por: " + pokedex.get(indicePokemonPropio));

        boolean probabilidad = ((random.nextInt(100)) > 60) ? true : false;
        if(probabilidad){
            Pokemon aux = pokedex.get(indicePokemonPropio);
            pokedex.set(indicePokemonPropio, pokedexOpuesto.get(indicePokemonOpuesto));
            pokedexOpuesto.remove(indicePokemonOpuesto);
            pokedexOpuesto.add(aux);
            return true;
        } else {
            System.out.println("El otro entrenador no accedio a intercambiar su pokemon");
            return false;
        }
        //tirar objeto
        //mostrar los elementos en mochila
        //que el usuario escoja cual tirar
//Crear menú
        //intercambiar //recibir entrenador, su pokedex

        //entrenador opuesto muestra pokedex
        //Escojo el pokemon que quiero
        // lw propongo uno de mi pokedex
        //y random true o false acepta
        //si true
        // get y add (mas remove)
        public void mostrarMochila(){
            System.out.println("los objetos disponibles son: ");
            int indice = 1;
            for (Objeto objeto : mochila) {
                System.out.println(indice+" . ");
                System.out.println(objeto);
                indice++;

         */
            }
    public void mostrarMochila(){
        System.out.println("los objetos disponibles son: ");
        int indice = 1;
        for (Objeto objeto : mochila) {
            System.out.println(indice+" . ");
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
        mostrarPokedex();
        System.out.println("Escoge 3 pokemones");
        for(int i=1 i<3; i++){
            System.out.println("ingresa pokemon");
            paraPelea.add(pokedex.get(scanner.nextInt()-1));
        }
        int respuesta=0;
        do{
            System.out.println("1. Pelear");
            System.out.println("2. Usar Baya/Poción");
            System.out.println("3. Huir");
            respuesta = scanner.nextInt();
            if(paraPelea.size() !=0) {
                if (respuesta == 1) {
                    System.out.println("Escoge el pokemon para pelear");
                    mostrarPokedex(paraPelea);
                    int eleccion = scanner.nextInt();
                    //validar si es true o false
                    if(!paraPelea.get(eleccion).pelear(PokemonContrario)){
                        paraPelea.remove(eleccion);
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

                } else {
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
}
