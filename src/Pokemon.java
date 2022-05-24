import java.util.Random;
import java.util.Scanner;

public class Pokemon extends Personaje{

private String nombre;
private String tipo;
private Habilidad habilidad;
private int HP;
private boolean esLegendario;
private String debilContra;
private String fuerteContra;
    private int fuerza;
    private int velocidad;

    public Pokemon(String nombre, int nivel, char genero, String nombre1, String tipo, Habilidad habilidad, int HP, boolean esLegendario, String debilContra, String fuerteContra, int fuerza, int velocidad) {
        super(nombre, nivel, genero);
        this.nombre = nombre1;
        this.tipo = tipo;
        this.habilidad = habilidad;
        this.HP = HP;
        this.esLegendario = esLegendario;
        this.debilContra = debilContra;
        this.fuerteContra = fuerteContra;
        this.fuerza = fuerza;
        this.velocidad = velocidad;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Habilidad getHabilidad() {
        return habilidad;
    }

    public void setHabilidad(Habilidad habilidad) {
        this.habilidad = habilidad;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public boolean isEsLegendario() {
        return esLegendario;
    }

    public void setEsLegendario(boolean esLegendario) {
        this.esLegendario = esLegendario;
    }

    public String getDebilContra() {
        return debilContra;
    }

    public void setDebilContra(String debilContra) {
        this.debilContra = debilContra;
    }

    public String getFuerteContra() {
        return fuerteContra;
    }

    public void setFuerteContra(String fuerteContra) {
        this.fuerteContra = fuerteContra;
    }
    //nombre
    //tipo - String
    //habilidad- Habilidad
     // HP - int
    //esLegendario-boolean
    // debilcontra- String
    //fuerteContra- String




    //pelea

      //si mi pokemon es fuerte contra pokemon opuesto
        //+ ataque de habilidad
    //si no si mi pokemon es debil contra el pokemon opuesto
    //-ataque de habilidad
    //sino
      // normal ataque

    //cuando lanza el ataque se resta la cantidad
    // de ataque del HP
    // Todo metodo pelear
    @Override
    public boolean pelear(Pokemon PokemonContrario) {
        Scanner leer= new Scanner(System.in);
        int turno=0, aumento, dis;

        System.out.println("Entrenador contrario sacó a"+PokemonContrario.nombre);
        //turnos
        do {
            //valida fuerte, debil contra.
            if(turno==0){
                if(PokemonContrario.fuerteContra.equals(this.debilContra)) {
                aumento=PokemonContrario.fuerza/2;
                PokemonContrario.fuerza+=aumento;
                dis=this.fuerza/2;
                this.fuerza-=dis;
                turno++;}
             else if(PokemonContrario.debilContra.equals(this.fuerteContra)){
                 aumento=this.fuerza/2;
                 this.fuerza+=aumento;
                 dis=PokemonContrario.fuerza/2;
                 PokemonContrario.fuerza-=dis;
                 turno++;
             }
             else{
                 //ataque normal
            }
             //Calculo de dannio hecho
                int validacion=this.habilidad.getAtaqueBase()/2;
                int validacion2=PokemonContrario.getHabilidad().getAtaqueBase()/2;
                int validacion3=PokemonContrario.fuerza/2;
                int validacion4=this.fuerza/2;
                int atq=validacion+validacion4;
                int atq2=validacion2+validacion3;
                //Validacion velocidad del poke
            if (PokemonContrario.velocidad > this.velocidad) {
                this.HP -=atq2;
                PokemonContrario.HP-=atq;
            }else{
                PokemonContrario.HP-=atq;
                this.HP -=atq2;
            }
            //todo mejoras futuras
                // Random random= new Random();
            //mostrar habilidades
                // atkCPU= random.nextInt(4);
                // this.HP -= PokemonContrario.getHabilidades().get(atkCPU).getataqueBase();
            //atk=leer.nextInt();

            }else{

            }

        }while(this.HP!=0 || PokemonContrario.getHP()!=0);
        if(this.HP==0){
            System.out.println("Tu"+this.nombre+" se debilitó...");
            return false;}
        else{
            return true;}

    }

    @Override
    public String toString() {
        return "Pokemon{" +
                "nombre='" + nombre + '\'' +
                ", nivel=" + nivel +
                ", genero=" + genero +
                ", nombre='" + nombre + '\'' +
                ", tipo='" + tipo + '\'' +
                ", habilidad=" + habilidad +
                ", HP=" + HP +
                ", esLegendario=" + esLegendario +
                ", debilContra='" + debilContra + '\'' +
                ", fuerteContra='" + fuerteContra + '\'' +
                ", fuerza=" + fuerza +
                ", velocidad=" + velocidad +
                '}';
    }

}
