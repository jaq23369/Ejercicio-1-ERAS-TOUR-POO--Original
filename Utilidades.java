import java.util.ArrayList;
import java.util.Random;

/**
 * Estudiante: Joel Antonio Jaquez Lopez
 * Carne: 23369
 * Carrera: Ingenieria en Ciencias de la computacion y tecnologias de la informacion 
 * Fecha de creacion: 12/8/2023
 * Ultima fecha de modificacion: 12/8/2023
 * La clase Utilidades proporciona métodos útiles para generar números aleatorios y seleccionar localidades aleatorias.
 */
public class Utilidades{
/**
     * Genera un número aleatorio entre 1 y 15000.
     * 
     * @return el número aleatorio generado.
     */
    public static int generarNumeroAleatorio(){
        Random rand = new Random();
        return rand.nextInt(15000) + 1;
    }

/**
     * Selecciona una localidad aleatoria de una lista de localidades.
     * 
     * @param localidades la lista de localidades disponibles.
     * @return la localidad seleccionada aleatoriamente.
     */
    public static Localidad seleccionarLocalidadAleatoria(ArrayList<Localidad> localidades){
        Random rand = new Random();
        int index = rand.nextInt(localidades.size());
        return localidades.get(index);
    }
}