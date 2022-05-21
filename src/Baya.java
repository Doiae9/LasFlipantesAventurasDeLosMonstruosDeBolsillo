public class Baya extends Objeto {
    //efecto - String
    //duracion - entero
    private String efecto;
    private int duracion;

    public Baya(double costo, int cantidad, String nombre, String tipo, String efecto, int duracion) {
        super(costo, cantidad, nombre, tipo);
        this.efecto = efecto;
        this.duracion = duracion;
    }

    public String getEfecto() {
        return efecto;
    }

    public void setEfecto(String efecto) {
        this.efecto = efecto;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    @Override
    public boolean usar(Pokemon pokemon) {
        if (this.efecto.equals("curacion")) {
            pokemon.setHP(pokemon.getHP()+20);
            return true;
        }else if (this.efecto.equals("fuerza")){
            pokemon.getHabilidad().setAtaqueBase(pokemon.getHabilidad().getAtaqueBase());
            return true;
        } else if (this.efecto.equals("velocidad")) {
            pokemon.setVelocidad(pokemon.getVelocidad() + 20);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Baya{" +
                "efecto='" + efecto + '\'' +
                ", duracion=" + duracion +
                ", costo=" + costo +
                ", cantidad=" + cantidad +
                ", nombre='" + nombre + '\'' +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}

    //usar
    //si es curacion 20 hp
    // si es fuerza
    //aumentar 20 ataque


