import java.util.Random;
import java.util.ArrayList;

/**
 * Estudiante: Joel Antonio Jaquez Lopez
 * Carne: 23369
 * Carrera: Ingenieria en Ciencias de la computacion y tecnologias de la informacion 
 * Fecha de creacion: 12/8/2023
 * Ultima fecha de modificacion: 12/8/2023
 * La clase Ticket representa un boleto para un evento.
 */
public class Ticket{
    private int numero;
    private Localidad localidadAsignada;
    private static final Random RAND = new Random();

/**
     * Constructor para la clase Ticket.
     * Genera un número aleatorio entre 1 y 15000 y lo asigna al campo numero.
     */
    public Ticket(){
        numero = RAND.nextInt(15000) + 1; 
    }

/**
     * Verifica si el boleto es apto para comprar.
     * Genera dos números aleatorios entre 1 y 15000 y verifica si el número del boleto está dentro del rango.
     * 
     * @return true si el boleto es apto para comprar, false de lo contrario.
     */
    public boolean esAptoParaComprar(){
        int a = RAND.nextInt(15000) + 1;
        int b = RAND.nextInt(15000) + 1;
        return numero >= Math.min(a, b) && numero <= Math.max(a, b);
    }

/**
     * Asigna una localidad aleatoria al boleto.
     * Genera un número aleatorio entre 0 y 2 y asigna una localidad en función del número generado.
     * 
     * @param localidades una lista de localidades disponibles para el evento.
     * @return la localidad asignada al boleto.
     */  
    public Localidad asignarLocalidad(ArrayList<Localidad> localidades){
        int localidadAleatoria = RAND.nextInt(3);

        switch(localidadAleatoria){
            case 0:
                localidadAsignada = new Localidad(100, 200, 200);
                break;
            case 1:
                localidadAsignada = new Localidad(500, 150, 150);
                break;
            case 2:
                localidadAsignada = new Localidad(1000, 100, 100);
                break;
            default:
                break;
        }
        return localidadAsignada;
    }

/**
     * Retorna el número del boleto.
     * 
     * @return el número del boleto.
     */
    public int getNumero(){
        return numero;
    }

/**
     * Retorna la localidad asignada al boleto.
     * 
     * @return la localidad asignada al boleto.
     */
    public Localidad getLocalidadAsignada(){
        return localidadAsignada;
    }
}