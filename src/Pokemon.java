public class Pokemon extends Personaje{

private String nombre;
private String tipo;
private Habilidad habilidad;
private int HP;
private boolean esLegendario;
private String debilContra;
private String fuerteContra;

    public Pokemon(String nombre, int nivel, char genero, String nombre1, String tipo, Habilidad habilidad, int HP, boolean esLegendario, String debilContra, String fuerteContra) {
        super(nombre, nivel, genero);
        this.nombre = nombre1;
        this.tipo = tipo;
        this.habilidad = habilidad;
        this.HP = HP;
        this.esLegendario = esLegendario;
        this.debilContra = debilContra;
        this.fuerteContra = fuerteContra;
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
    //consumi pocion o baya para ataque?
    //habilidad ataqueBase +20
      //si mi pokemon es fuerte contra pokemon opuesto
        //+ ataque de habilidad
    //si no si mi pokemon es debil contra el pokemon opuesto
    //-ataque de habilidad
    //sino
      // normal ataque

    //cuando lanza el ataque se resta la cantidad
    // de ataque del HP


}
