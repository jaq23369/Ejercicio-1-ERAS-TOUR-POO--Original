import java.util.ArrayList;

/**
 * Estudiante: Joel Antonio Jaquez Lopez
 * Carne: 23369
 * Carrera: Ingenieria en Ciencias de la computacion y tecnologias de la informacion 
 * Fecha de creacion: 12/8/2023
 * Ultima fecha de modificacion: 12/8/2023
 * La clase DriverProgram es la Clase principal del programa que permite la venta de boletos para un evento.
 */
public class DriverProgram{
    private static ArrayList<Localidad> localidades = new ArrayList<>();
    private static Comprador compradorActivo;

/**
     * Método principal que inicializa el programa.
     * 
     * @param args los argumentos de la línea de comandos
     */
    public static void main(String[] args){
        localidades.add(new Localidad(100, 200, 200));
        localidades.add(new Localidad(500, 150, 150));
        localidades.add(new Localidad(1000, 100, 100));
// Se muestra el menú principal del programa
        menu();
    }

/**
     * Muestra el menú principal del programa y realiza las acciones correspondientes según la opción seleccionada.
     */
    public static void menu(){
        while (true){
            System.out.println("Menu");
            System.out.println("1. Nuevo Comprador");
            System.out.println("2. Nueva Solicitud de Boletos");
            System.out.println("3. Consultar disponibilidad total");
            System.out.println("4. Consultar disponibilidad individual");
            System.out.println("5. Reporte de caja");
            System.out.println("6. Salir");
// Se lee la opción seleccionada por el usuario
            int opcion = Integer.parseInt(System.console().readLine());

            switch (opcion){
                case 1:
                    nuevoComprador();
                    break;
                case 2:
                    nuevaSolicitudBoleto();
                    break;
                case 3:
                    consultarDisponibilidadTotal();
                    break;
                case 4:
                    consultarDisponibilidadIndividual();
                    break;
                case 5:
                    reporteCaja();
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    break;
            }
        }
    }

/**
     * Crea un nuevo comprador con el nombre y correo electrónico ingresados por el usuario.
     */
    public static void nuevoComprador(){
        System.out.println("Ingrese su nombre: ");
        String name = System.console().readLine();
        System.out.println("Ingrese su email: ");
        String email = System.console().readLine();

        compradorActivo = new Comprador(name, email, 0, 0);
    }

/**
     * Crea una nueva solicitud de boletos para el comprador activo y asigna una localidad disponible.
     */
    public static void nuevaSolicitudBoleto(){
        if (compradorActivo == null) {
            System.out.println("Debe crear un nuevo comprador antes de pedir boletos");
            return;
        }

    Ticket ticket = new Ticket();
    Localidad localidadAsignada = ticket.asignarLocalidad(localidades);

    if (ticket.esAptoParaComprar()){
        localidadAsignada.venderBoletos(compradorActivo.getCantidadBoletosComprar());
        System.out.println("Compra realizada con exito.");
    }else{
        System.out.println("Perdon pero no se pudo realizar la compra.");
    }
    }
/**
     * Consulta la disponibilidad total de boletos para todas las localidades.
     */
    public static void consultarDisponibilidadTotal(){
        for (Localidad localidad : localidades){
            System.out.println("Localidad con precio $" + localidad.getPrecio() + ":");
            System.out.println("Boletos vendidos: " + (localidad.getEspacioDisponible() - localidad.getBoletosDisponibles()));
            System.out.println("Boletos disponibles: " + localidad.getPrecio() + ":");
            System.out.println("Localidad con precio $" + localidad.getBoletosDisponibles());
            System.out.println();
        }
    }

/**
     * Consulta la disponibilidad de boletos para una localidad específica.
     */
    public static void consultarDisponibilidadIndividual(){
        if (compradorActivo == null){
            System.out.println("Debe crear un usuario antes de consultar la disponibilidad");
            return;
        }

        System.out.println("Ingrese el precio de la localidad que desea consultar: ");
        double precioLocalidad = Double.parseDouble(System.console().readLine());

        for (Localidad localidad : localidades){
            if (localidad.getPrecio() == precioLocalidad){
                System.out.println("Localidad con precio $: " + localidad.getPrecio() + ":");
                System.out.println("Boletos vendidos: " + (localidad.getEspacioDisponible() - localidad.getBoletosDisponibles()));
                System.out.println("Boletos disponibles: " + localidad.getBoletosDisponibles());
                System.out.println();
                return;
            }
        }
        System.out.println("No se encontro ninguna localidad con ese precio");
    }

/**
     * Genera un reporte de caja con el total vendido para cada localidad y en general.
     */
    public static void reporteCaja(){
        double totalVendido = 0;

        for (Localidad localidad : localidades){
            double montoVendido = (localidad.getEspacioDisponible() - localidad.getBoletosDisponibles()) * localidad.getPrecio();
            totalVendido += montoVendido;
            System.out.println("Localidad con precio $: " + localidad.getPrecio() + ": $" + montoVendido);
        }
        System.out.println("Total vendido: $" + totalVendido);
    }
}
                




    

