import java.util.ArrayList;

/**
 * Estudiante: Joel Antonio Jaquez Lopez
 * Carne: 23369
 * Carrera: Ingenieria en Ciencias de la computacion y tecnologias de la informacion 
 * Fecha de creacion: 12/8/2023
 * Ultima fecha de modificacion: 12/8/2023
 * La clase Comprador representa a una persona interesada en comprar boletos para el evento.
 */
public class Comprador{
    private String nombre;
    private String email;
    private int cantidadBoletosComprar;
    private double presupuestoMaximo;

/**
     * Constructor para la clase Comprador.
     * 
     * @param nombre el nombre del comprador
     * @param email el correo electrónico del comprador
     * @param cantidadBoletosComprar la cantidad de boletos que desea comprar el comprador
     * @param presupuestoMaximo el presupuesto máximo que tiene el comprador para comprar boletos
     */
    public Comprador(String nombre, String email, int cantidadBoletosComprar, double presupuestoMaximo){
        this.nombre = nombre;
        this.email= email;
        this.cantidadBoletosComprar = cantidadBoletosComprar;
        this.presupuestoMaximo = presupuestoMaximo;
    }

/**
     * Solicita al comprador la cantidad de boletos que desea comprar y su presupuesto máximo.
     */
    public void solicitarComprarBoletos(){
        System.out.println("Ingrese la cantidad de boletos que desea comprar: ");
        cantidadBoletosComprar = Integer.parseInt(System.console().readLine());
        System.out.println("Ingrese su presupuesto maximo: ");
        presupuestoMaximo = Double.parseDouble(System.console().readLine());
    }

/**
     * Realiza la compra de boletos para el comprador.
     * 
     * @param ticket el ticket que desea comprar el comprador
     * @param localidadesDisponibles las localidades disponibles para el evento
     * @return true si se realizó la compra con éxito; false en caso contrario
     */
    public boolean realizarCompraBoletos(Ticket ticket, ArrayList<Localidad> localidadesDisponibles){
        if (ticket.esAptoParaComprar()){
            Localidad localidadAsignada = ticket.asignarLocalidad(localidadesDisponibles);
            if (localidadAsignada.validarBoletosDisponibles(1) &&
                localidadAsignada.validarBoletosDisponibles(cantidadBoletosComprar) &&
                localidadAsignada.validarPrecio(presupuestoMaximo)){
            localidadAsignada.venderBoletos(cantidadBoletosComprar);
            System.out.println("Compra realizada con exito");
            System.out.println("Localidad" + localidadAsignada);
            System.out.println("Cantidad de boletos: " + cantidadBoletosComprar);
            System.out.println("Precio total: " + (cantidadBoletosComprar * localidadAsignada.getPrecio()));
            return true;
                }else{
                    System.out.println("No se pudo realizar la compra");
                    return false;}
        }else{
            System.out.println("No se pudo realizar la compra");
            return false;}}

/**
     * Obtiene el nombre del comprador.
     * 
     * @return el nombre del comprador
     */
    public String getNombre(){
        return  nombre;
    }

/**
     * Obtiene el correo electrónico del comprador.
     * 
     * @return el correo electrónico del comprador
     */
    public String getEmail(){
        return email;
    }

/**
     * Obtiene la cantidad de boletos que desea comprar el comprador.
     * 
     * @return la cantidad de boletos que desea comprar el comprador
     */
    public int getCantidadBoletosComprar(){
        return cantidadBoletosComprar;
    }

/**
     * Obtiene el presupuesto máximo que tiene el comprador para comprar boletos.
     * 
     * @return el presupuesto máximo que tiene el comprador para comprar boletos
     */
    public double getPresupuestoMaximo(){
        return presupuestoMaximo;
    }
}