public abstract class Personaje {
    //atributos
    //nombre -String protected
    //nivel- entero protected
    //genero- char protected
    //Hacer constructor
    protected String nombre;
    protected int nivel;
    protected char genero;

    public Personaje(String nombre, int nivel, char genero) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }
    public abstract boolean pelear(Pokemon PokemonContrario);

    @Override
    public String toString() {
        return "Personaje{" +
                "nombre='" + nombre + '\'' +
                ", nivel=" + nivel +
                ", genero=" + genero +
                '}';
    }
    //pelear - abstracto

    //
}
