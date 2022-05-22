import java.util.ArrayList;

public class Tienda {
    //nombre- String
    //atributos
    //objetos disponibles- ArrayList<objetos>

    private String nombre;
    private ArrayList<Objeto> objetosDisponibles;
    public Tienda(String nombre, ArrayList<Objeto> objetosDisponibles) {
        this.nombre = nombre;
        this.objetosDisponibles = objetosDisponibles;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Objeto> getObjetosDisponibles() {
        return objetosDisponibles;
    }

    public void setObjetosDisponibles(ArrayList<Objeto> objetosDisponibles) {
        this.objetosDisponibles = objetosDisponibles;
    }
    //metodo
    //antes de llamar a usuario comprar se tiene que llamar a mostrarDisponibles
    //1 Pocion vida(2 dispo)
    //2 Pocion ataque (1 dispo)
    //3 Pokebola ultra(13 dispo)
    public boolean usuarioComprar(double dinero, int cantidad, int indiceObjeto){
        //ToDo metodo para mostrar objetos disponibles

        //validar que hay suficientes objetos del tipo requerido
        //ToDo Excepcion
        if(indiceObjeto>objetosDisponibles.size()){
            System.out.println("Lo siento, no tenemos el objeto que esta pidiendo");
            return false;
        }else {
            if (objetosDisponibles.get(indiceObjeto).cantidad >= cantidad){
                double precioTotal = cantidad*objetosDisponibles.get(indiceObjeto).costo;
                if(precioTotal>= dinero){
                    System.out.println("Gracias por su compra");
                    System.out.println("Compraste"+cantidad+" "+objetosDisponibles.get(indiceObjeto).nombre+"por $"+precioTotal);
                    System.out.println("Te quedan :"+(precioTotal-dinero));
                    return true;
                }else{
                    System.out.println("No te alcanza, te faltan:= " +(precioTotal- dinero)); //Su cambio es :
                    return false;
                }
            }else{
                System.out.println("No tenemos la cantidad solicitada");
                return false;
            }
        }
        //Si hay cantidad y Objeto
        //Si hay cantidad y existe en el arreglo
        //Si si tengo, validar que el dinero sea suficiente
        //Si es suficiente, le vendo
        //Si no
        //mostrar que no le alcanza
        //sino
        //hacemos excepción de que no hay la cantidad que pide
        //repetimos pregunta
        //


    }



    //comprar
    //vender
    public boolean usuariovender(Objeto objeto, int cantidad) {
        //logica inversa de compra
        //No comprar baya if(Objeto.get(Baya).){}

        if (objeto.getClass().toString().equals("class Baya")) {
            System.out.println("No puedes vender bayas");
            return false;
        } else {
            for (Objeto elemento : objetosDisponibles) {
                if (elemento.nombre.equals(objeto.nombre)) {
                    elemento.cantidad += cantidad;
                    System.out.println("Compraste"+elemento.nombre);
                    return true;
                }
            }
            objetosDisponibles.add(objeto);
            objetosDisponibles.get(objetosDisponibles.size() - 1).cantidad = cantidad;
            System.out.println("Comprado Objeto nuevo");
            //No podremos comprarle al usuario si quiere vendernos una baya
            //

            //dinero infinito en la tienda
            //recibir objetos y darle el dinero
        }
        return true;
    }
        public void mostrarDisponibles() {
            System.out.println("Los objetos disponibles son: ");
            int indice = 1;
            for (Objeto objeto: objetosDisponibles) {
                System.out.println(indice + " - ");
                System.out.println(objeto);//faltan toString en objeto
                indice++;
            }
        }
        @Override
        public String toString() {
            return "Tienda{" +
                    "nombre='" + nombre + '\'' +
                    ", objetosDisponibles=" + objetosDisponibles +
                    '}';
        }
    }
