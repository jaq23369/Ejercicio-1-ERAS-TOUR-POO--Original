import java.util.Random;

public class Ticket{
    private int numero;
    private Localidad localidadAsignada;

    public Ticket(){
        Random rand = new Random();
        numero = rand.nextInt(15000) + 1;
    }

    public boolean esAptoParaComprar(){
        Random rand =  new Random();
        int a = rand.nextInt(15000) + 1;
        int b = rand.nextInt(15000) + 1;

        if (numero >= Math.min(a, b) && numero <= Math.max(a, b)){
            return true;
            }else {return false;}
    }
    
    public Localidad asignarLocalidad(){
        Random rand = new Random();
        int localidadAleatoria = rand.nextInt(3);

        Switch(localidadAleatoria){
            case 1;
                localidadAsignada = new Localidad(100, 200, 200);
                break;
            case 2;
                localidadAleatoria = new Localidad(500, 150, 150);
                break;
            case 3;
            localidadAleatoria = new Localidad(1000, 100, 100);
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