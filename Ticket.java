import java.util.Random;
import java.util.ArrayList;

public class Ticket{
    private int numero;
    private Localidad localidadAsignada;
    private static final Random RAND = new Random();

    public Ticket(){
        numero = RAND.nextInt(15000) + 1; 
    }

    public boolean esAptoParaComprar(){
        int a = RAND.nextInt(15000) + 1;
        int b = RAND.nextInt(15000) + 1;
        return numero >= Math.min(a, b) && numero <= Math.max(a, b);
    }
    
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

    public int getNumero(){
        return numero;
    }

    public Localidad getLocalidadAsignada(){
        return localidadAsignada;
    }
}