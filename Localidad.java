public class Localidad{
    private double precio;
    private int espacioDisponible;
    private int boletosDisponibles;

    public Localidad(double precio, int espacioDisponible, int boletosDisponibles){
        this.precio = precio;
        this.espacioDisponible = espacioDisponible;
        this.boletosDisponibles= boletosDisponibles;
    }

    public boolean validarEspacioDisponible(){
        return espacioDisponible > 0;
    }

    public boolean validarBoletosDisponibles(int cantidadBoletosComprar){
        return boletosDisponibles >= cantidadBoletosComprar;
    }

    public boolean validarPrecio(double presupuestoMaximo){
        return presupuestoMaximo >= precio;
    }

    public void venderBoletos(int cantidadBoletosComprar){
        espacioDisponible -= cantidadBoletosComprar;
        boletosDisponibles -= cantidadBoletosComprar;
    }

    public double getPrecio(){
        return precio;
    }

    public int getEspacioDisponible(){
        return espacioDisponible;
    }

    public int getBoletosDisponibles(){
        return boletosDisponibles;
    }
}
