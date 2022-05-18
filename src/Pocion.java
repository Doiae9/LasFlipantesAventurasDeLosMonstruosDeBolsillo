public class Pocion extends Objeto {
    //efecto - String
    //duracion - entero
    private String efecto;
    private int duracion;

    public Pocion(double costo, int cantidad, String nombre, String tipo, String efecto, int duracion) {
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
            if(this.efecto.equals("curacion")){
                pokemon.setHP(pokemon.getHP()+20);
                return true;
            } else if(this.efecto.equals("fuerza")){
                pokemon.setFuerza(pokemon.getFuerza()+20);
                return true;
            } else if(this.efecto.equals("velocidad")){
                pokemon.setVelocidad(pokemon.getVelocidad()+20);
                return true;
            } else {
                return false;
            }
    }
//usar
    //si es curacion 20 hp
    // si es fuerza
       //aumentar 20 ataque
    //si es velocidad
       //aumentar 20  velocidad

}

