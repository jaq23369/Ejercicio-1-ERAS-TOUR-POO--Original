import java.util.Random;

public class Utilidades{
    public static int generarNumeroAleatorio(){
        Random rand = new Random();
        return rand.nextInt(15000) + 1;
    }

    public static Localidad seleccionarLocalidadAleatoria(ArrayList<Localidad> localidades){
        Random rand = new Random();
        int index = rand.nextInt(localidades.size());
        return localidades.get(index);
    }
}