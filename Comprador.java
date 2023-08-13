import java.util.ArrayList;

public class Comprador{
    private String nombre;
    private String email;
    private int cantidadBoletosComprar;
    private double presupuestoMaximo;

    public Comprador(String nombre, String email, int cantidadBoletosComprar, double presupuestoMaximo){
        this.nombre = nombre;
        this.email= email;
        this.cantidadBoletosComprar = cantidadBoletosComprar;
        this.presupuestoMaximo = presupuestoMaximo;
    }

    public void solicitarComprarBoletos(){
        System.out.println("Ingrese la cantidad de boletos que desea comprar: ");
        cantidadBoletosComprar = Integer.parseInt(System.console().readLine());
        System.out.println("Ingrese su presupuesto maximo: ");
        presupuestoMaximo = Double.parseDouble(System.console().readLine());
    }

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

    public String getNombre(){
        return  nombre;
    }

    public String getEmail(){
        return email;
    }

    public int getCantidadBoletosComprar(){
        return cantidadBoletosComprar;
    }

    public double getPresupuestoMaximo(){
        return presupuestoMaximo;
    }
}