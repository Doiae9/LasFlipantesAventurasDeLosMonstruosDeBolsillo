import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import static java.lang.System.currentTimeMillis;

public class Main implements  UtilInterface {
    //ajustes futuros
    //todo mover a un metodo habilidades que conecten con los tipos
    static ArrayList<Habilidad> habilidades = new ArrayList<>();
    static Habilidad habilidad = new Habilidad("Lanzallamas",
            "Poderoso torrente de llamas que pueden derretir el acero", 70);

    static Habilidad habilidad2 = new Habilidad("Poder Oculto",
            "Ataque que muta de tipo dependiendo del pokemon",50);

    static Habilidad habilidad3= new Habilidad("Hidrobomba",
            "Como un poderoso cañon, lanza una bomba de agua de mucha potencia",120);

    static Habilidad habilidad4= new Habilidad("Pulso Dragon",
            "Abre mucho la boca y libera una onda de choque que ataca al objetivo.",80);

    static Habilidad habilidad5= new Habilidad("Giga Impacto",
            "El usuario ataca al contrincante con una carga que se vuelve incontrolable",120);

    static Habilidad habilidad6= new Habilidad("Tijera X",
            "Cuchillada en forma de X credada por pinzas o guadañas",80);

    static Habilidad habilidad7= new Habilidad("Terremoto",
            "Poderosa onda sismica",100);

    static Habilidad habilidad8= new Habilidad("Puya Nociva",
            "Lanza una carga concentrada de veneno hacía el contrincante",50);

    static Habilidad habilidad9= new Habilidad("Pulso Umbrio",
            "El usuario suelta una horrible carga de aura impregnada de obsucros pensamientos ",65);

    static Habilidad habilidad10= new Habilidad("Bola Sombra",
            "Lanza una bola de sombras contra el enemigo",80);

    static Habilidad habilidad11= new Habilidad("Patada de Sal. Alto",
            "Toma vuelo con un salto al aire y lanza una potente patada",95);

    static Habilidad habilidad12= new Habilidad("Ataque Ala",
            "Lanza un golpe con el ala",60);

    static Habilidad habilidad13= new Habilidad("Cola Ferrea",
            "El contrincante es golpeado con una cola endurecida en acero",85);

    static Habilidad habilidad14= new Habilidad("Chispazo",
            "Poderosa carga electrica que puede paralizar al enemigo",65);

    static Habilidad habilidad15= new Habilidad("Avalancha",
            "Grnades rocas son arrojadas al enemigo inflingiendo daño",95);

    static Habilidad habilidad16= new Habilidad("Rayo hielo",
            "Poderoso rayo Helido ",80);

    static Habilidad habilidad17= new Habilidad("Psicorrayo",
            "Lanza un extraño rayo que puede confundir al enemigo",65);

    static Habilidad habilidad18= new Habilidad("Hoja Aguda",
            "Lanza una fila de hojas afiladas contra el enemigo",75);

    static Habilidad habilidad19= new Habilidad("Rayo solar",
            "Poderoso rayo que es cargado por medio de la fotosintesis",120);

    static Habilidad habilidad20= new Habilidad("Humareda",
            "Explosión que quema todo a su alrededor",150);

    static Habilidad habilidad21= new Habilidad("Cuchillada Solar",
            "Carga un poderoso rayo por medio de la fotosintesis en forma de cuchilla",100);

    static Habilidad habilidad22= new Habilidad("Acido",
            "Arroja un acido nocivo que es corrosivo",70);
    static ArrayList<String> tiposPokemon;

    public static void main(String[] args) throws InterruptedException {
        System.out.println();
       Thread.sleep(1500);
        Main objetomain= new Main();
        long tiempoInicial = 0;
        objetomain.tiempoJugado(tiempoInicial,System.currentTimeMillis());
        System.out.println(objetomain.crearPokemonAleatorio());
        System.out.println(objetomain.crearPokemonAleatorio());
        System.out.println(objetomain.crearPokemonAleatorio());

        habilidades.add(habilidad);
        habilidades.add(habilidad2);
        habilidades.add(habilidad3);
        habilidades.add(habilidad4);
        habilidades.add(habilidad5);
        habilidades.add(habilidad6);
        habilidades.add(habilidad7);
        habilidades.add(habilidad8);
        habilidades.add(habilidad9);
        habilidades.add(habilidad10);
        habilidades.add(habilidad11);
        habilidades.add(habilidad12);
        habilidades.add(habilidad13);
        habilidades.add(habilidad14);
        habilidades.add(habilidad15);
        habilidades.add(habilidad16);
        habilidades.add(habilidad17);
        habilidades.add(habilidad18);
        habilidades.add(habilidad19);
        habilidades.add(habilidad20);
        habilidades.add(habilidad21);
        habilidades.add(habilidad22);

        tiposPokemon= new ArrayList<>(Arrays.asList("agua","electrico","tierra",
                "planta","fuego","hielo","acero","roca","lucha","psiquico","siniestro",
                "fantasma","bicho","veneno","volador","dragon"));


    }

    @Override
    public void tiempoJugado(long tiempoInicial, long tiempoFinal) {
        System.out.println("Llevas: " + (tiempoInicial - tiempoFinal/1000)+" segundos Jugando");

    }

    @Override
    public void mostrarMenu() {
        Scanner leer = new Scanner(System.in);
        System.out.println("1-. Explorar");
        System.out.println("2-. Entrar a la tienda");
        System.out.println("3-. Tirar objeto");
        System.out.println("4-. ");
        int Esc;
        Esc = leer.nextInt();
        switch (Esc) {
            case 1:
                break;
            case 2:
                break;
                case 3:
                    break;
                    case 4:
                        break;


        }
    }

    @Override
    public Pokemon crearPokemonAleatorio() {
        Random random = new Random();
        int numTipo =random.nextInt(0,tiposPokemon.size());
        String tipo= tiposPokemon.get(numTipo);
        int tamNombre = nombresAleatorios(tipo).length;
        int nombre = random.nextInt(0,tamNombre);
        String nombreFinal=nombresAleatorios(tipo)[nombre];
        int hp = random.nextInt(12,200);
        boolean legendario =random.nextBoolean();
        String [] debilYFuerteAleatorio= debilYFuerteAleatorio(tipo);
        int fuerza= random.nextInt(18,250);
        int velocidad=random.nextInt(18,250);
        int nivel= random.nextInt(1,100);
        int numHabilidad = random.nextInt(0,habilidades.size());
        char genero= random.nextInt(0,10)<5 ? 'f' : 'm';
        return new Pokemon(nombreFinal,nivel,genero,tipo,habilidad,hp,legendario,
                debilYFuerteAleatorio[0],debilYFuerteAleatorio[1],fuerza,velocidad);
    }

    @Override
    public <T> T sacarAleatorio(ArrayList<T> arrayList) {
        Random random = new Random();
        int indice = random.nextInt(0,arrayList.size()-1);
        return arrayList.get(indice);
    }
    @Override
    public String[] debilYFuerteAleatorio(String tipo) {
        String[] BancoDF = new String[2];
        switch (tipo) {
            case "agua":
                BancoDF[0] = "electrico";
                BancoDF[1] = "fuego";
                break;
            case "electrico":
                BancoDF[0] = "tierra";
                BancoDF[1] = "agua";
                break;
            case "tierra":
                BancoDF[0] = "hielo";
                BancoDF[1] = "acero";
                break;
            case "hielo":
                BancoDF[0] = "fuego";
                BancoDF[1] = "tierra";
                break;
            case "fuego":
                BancoDF[0] = "agua";
                BancoDF[1] = "planta";
                break;
            case "acero":
                BancoDF[0] = "fuego";
                BancoDF[1] = "roca";
                break;
            case "roca":
                BancoDF[0] = "planta";
                BancoDF[1] = "hielo";
                break;
            case "lucha":
                BancoDF[0] = "psiquico";
                BancoDF[1] = "acero";
                break;
            case "psiquico":
                BancoDF[0] = "siniestro";
                BancoDF[1] = "lucha";
                break;
            case "siniestro":
                BancoDF[0] = "lucha";
                BancoDF[1] = "psiquico";
                break;
            case "fantasma":
                BancoDF[0] = "fantasma";
                BancoDF[1] = "psiquico";
                break;
            case "planta":
                BancoDF[0] = "bicho";
                BancoDF[1] = "tierra";
                break;
            case "bicho":
                BancoDF[0] = "fuego";
                BancoDF[1] = "planta";
                break;
            case "volador":
                BancoDF[0] = "roca";
                BancoDF[1] = "bicho";
                break;
            case "veneno":
                BancoDF[0] = "psiquico";
                BancoDF[1] = "planta";
                break;
            case "dragon":
                BancoDF[0] = "acero";
                BancoDF[1] = "dragon";
                break;
            default:
                BancoDF[0] = "lucha";
                BancoDF[1] = "fantasma";
                break;
        }
        return BancoDF;
    }

    @Override
    public String[] nombresAleatorios(String tipo) {
        String[] BancoNombres = new String[4];
        switch (tipo) {
            case "agua":
                BancoNombres[0] = "Blastoise";
                BancoNombres[1] = "Gyarados";
                BancoNombres[2] = "Greninja";
                BancoNombres[3] = "Manaphy";
                break;
            case "electrico":
                BancoNombres[0] = "Pikachu";
                BancoNombres[1] = "Emolga";
                BancoNombres[2] = "Togedemaru";
                BancoNombres[3] = "Pachirizu";
                break;
            case "tierra":
                BancoNombres[0] = "Excadrill";
                BancoNombres[1] = "Krokorok";
                BancoNombres[2] = "Dugtrio";
                BancoNombres[3] = "Kyogre";
                break;
            case "hielo":
                BancoNombres[0] = "Lapras";
                BancoNombres[1] = "Abomasnow";
                BancoNombres[2] = "Glaseon";
                BancoNombres[3] = "Aurorus";
                break;
            case "fuego":
                BancoNombres[0] = "Camelupt";
                BancoNombres[1] = "Charizard";
                BancoNombres[2] = "Nintetales";
                BancoNombres[3] = "Delphox";
                break;
            case "acero":
                BancoNombres[0] = "Aggron";
                BancoNombres[1] = "Metragross";
                BancoNombres[2] = "Steelex";
                BancoNombres[3] = "Mawile";
                break;
            case "roca":
                BancoNombres[0] = "Golem";
                BancoNombres[1] = "Onix";
                BancoNombres[2] = "Lycanroc";
                BancoNombres[3] = "Rhyperior";
                break;
            case "lucha":
                BancoNombres[0] = "Machoke";
                BancoNombres[1] = "Hitmonlee";
                BancoNombres[2] = "Hitmontop";
                BancoNombres[3] = "Hawlucha";
                break;
            case "psiquico":
                BancoNombres[0] = "Gardevoir";
                BancoNombres[1] = "Golduck";
                BancoNombres[2] = "Gothitelle";
                BancoNombres[3] = "Hatterene";
                break;
            case "siniestro":
                BancoNombres[0] = "Zoroark";
                BancoNombres[1] = "Umbreon";
                BancoNombres[2] = "Absol";
                BancoNombres[3] = "Darkrai";
                break;
            case "fanstasma":
                BancoNombres[0] = "Mimikiu";
                BancoNombres[1] = "Misdreavus";
                BancoNombres[2] = "Cofagrigus";
                BancoNombres[3] = "Banette";
                break;
            case "planta":
                BancoNombres[0] = "Chikorita";
                BancoNombres[1] = "Serperior";
                BancoNombres[2] = "Lilligant";
                BancoNombres[3] = "Lurantis";
                break;
            case "bicho":
                BancoNombres[0] = "Heracross";
                BancoNombres[1] = "Venomoth";
                BancoNombres[2] = "Vespiquen";
                BancoNombres[3] = "Scolipede";
                break;
            case "volador":
                BancoNombres[0] = "Pidgeot";
                BancoNombres[1] = "Staraptor";
                BancoNombres[2] = "Dodrio";
                BancoNombres[3] = "Unfezant";
                break;
            case "veneno":
                BancoNombres[0] = "Crobat";
                BancoNombres[1] = "Nidoking";
                BancoNombres[2] = "Muk";
                BancoNombres[3] = "Drapion";
                break;
            case "dragon":
                BancoNombres[0] = "Dragonair";
                BancoNombres[1] = "Goodra";
                BancoNombres[2] = "Haxorus";
                BancoNombres[3] = "Kommo-o";
                break;
            default:
                BancoNombres[0] = "Snorlax";
                BancoNombres[1] = "Chansey";
                BancoNombres[2] = "Tauros";
                BancoNombres[3] = "Lopunny";
                break;
        }
        return BancoNombres;
    }
}
//static no necesitas llamar objetos
//mostrar menu.
