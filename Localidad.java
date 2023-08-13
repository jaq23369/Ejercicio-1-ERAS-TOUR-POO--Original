/**
 * La clase Localidad representa una localidad en el evento.
 */
public class Localidad{
    private double precio;
    private int espacioDisponible;
    private int boletosDisponibles;

/**
     * Constructor para la clase Localidad.
     * 
     * @param precio el precio de la localidad
     * @param espacioDisponible el espacio disponible en la localidad
     * @param boletosDisponibles el número de boletos disponibles en la localidad
     */
    public Localidad(double precio, int espacioDisponible, int boletosDisponibles){
        this.precio = precio;
        this.espacioDisponible = espacioDisponible;
        this.boletosDisponibles= boletosDisponibles;
    }

/**
     * Verifica si hay espacio disponible en la localidad.
     * 
     * @return true si hay espacio disponible; false en caso contrario
     */
    public boolean validarEspacioDisponible(){
        return espacioDisponible > 0;
    }

/**
     * Verifica si hay suficientes boletos disponibles en la localidad.
     * 
     * @param cantidadBoletosComprar la cantidad de boletos que se desea comprar
     * @return true si hay suficientes boletos disponibles; false en caso contrario
     */
    public boolean validarBoletosDisponibles(int cantidadBoletosComprar){
        return boletosDisponibles >= cantidadBoletosComprar;
    }
/**
     * Verifica si el precio de la localidad es menor o igual al presupuesto máximo del comprador.
     * 
     * @param presupuestoMaximo el presupuesto máximo del comprador
     * @return true si el precio es menor o igual al presupuesto máximo; false en caso contrario
     */
    public boolean validarPrecio(double presupuestoMaximo){
        return presupuestoMaximo >= precio;
    }

/**
     * Vende boletos para la localidad.
     * 
     * @param cantidadBoletosComprar la cantidad de boletos que se desea comprar
     */
    public void venderBoletos(int cantidadBoletosComprar){
        espacioDisponible -= cantidadBoletosComprar;
        boletosDisponibles -= cantidadBoletosComprar;
    }

/**
     * Obtiene el precio de la localidad.
     * 
     * @return el precio de la localidad
     */
    public double getPrecio(){
        return precio;
    }

/**
     * Obtiene el espacio disponible en la localidad.
     * 
     * @return el espacio disponible en la localidad
     */
    public int getEspacioDisponible(){
        return espacioDisponible;
    }

/**
     * Obtiene el número de boletos disponibles en la localidad.
     * 
     * @return el número de boletos disponibles en la localidad
     */
    public int getBoletosDisponibles(){
        return boletosDisponibles;
    }
}
