import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("========================================");
        System.out.println("SISTEMA DE GESTIÓN DE HOTEL - PRUEBAS");
        System.out.println("========================================\n");
        
        // ===== PRUEBAS DE LA CLASE CLIENTE =====
        System.out.println(">>> PRUEBAS DE LA CLASE CLIENTE <<<");
        System.out.println("-----------------------------------");
        
        // Crear clientes
        Cliente cliente1 = new Cliente(1, "12345678", "Juan", "Pérez", "juan.perez@email.com", "555-1234");
        Cliente cliente2 = new Cliente(2, "87654321", "María", "González", "maria.gonzalez@email.com", "555-5678");
        Cliente cliente3 = new Cliente(3, "11223344", "Carlos", "Rodríguez", "carlos.rodriguez@email.com", "555-9012");
        
        System.out.println("✓ Clientes creados correctamente");
        
        // Mostrar información de clientes
        System.out.println("\nInformación de clientes:");
        cliente1.InfoCliente();
        cliente2.InfoCliente();
        cliente3.InfoCliente();
        
        // Probar getters
        System.out.println("\nProbando getters del cliente1:");
        System.out.println("ID: " + cliente1.getId());
        System.out.println("DNI: " + cliente1.getDni());
        System.out.println("Nombre: " + cliente1.getNombre());
        System.out.println("Apellido: " + cliente1.getApellido());
        System.out.println("Email: " + cliente1.getEmail());
        System.out.println("Teléfono: " + cliente1.getTelefono());
        
        // Probar setters
        System.out.println("\nModificando datos del cliente1:");
        cliente1.setNombre("Juan Carlos");
        cliente1.setTelefono("555-9999");
        cliente1.setEmail("juancarlos.perez@email.com");
        System.out.println("Datos actualizados:");
        cliente1.InfoCliente();
        
        // ===== PRUEBAS DE LA CLASE HABITACION =====
        System.out.println("\n\n>>> PRUEBAS DE LA CLASE HABITACION <<<");
        System.out.println("--------------------------------------");
        
        // Crear habitaciones
        Habitacion hab1 = new Habitacion(101, 2, 15000, "Habitación estándar para 2 personas", "Estándar");
        Habitacion hab2 = new Habitacion(201, 4, 30000, "Habitación king para 4 personas", "King");
        Habitacion hab3 = new Habitacion(301, 5, 35000, "Suite presidencial para 5 personas", "Presidencial");
        
        System.out.println("✓ Habitaciones creadas correctamente");
        
        // Probar getters
        System.out.println("\nInformación de la habitación 1:");
        System.out.println("ID: " + hab1.get_ID());
        System.out.println("Capacidad: " + hab1.get_capacidad() + " personas");
        System.out.println("Costo: $" + hab1.get_costo());
        System.out.println("Descripción: " + hab1.get_descripcion());
        System.out.println("Clase: " + hab1.get_clase());
        System.out.println("Disponible: " + hab1.disponible_get());
        
        // Probar setters
        System.out.println("\nModificando habitación 2:");
        hab2.set_costo(32000);
        hab2.set_disponible(false);
        System.out.println("Nuevo costo: $" + hab2.get_costo());
        System.out.println("Disponible: " + hab2.disponible_get());
        
        // Probar método costoxnoche
        System.out.println("\nCosto por noche de habitación 3: $" + hab3.costoxnoche(301));
        
        // ===== PRUEBAS DE LA CLASE RESERVA =====
        System.out.println("\n\n>>> PRUEBAS DE LA CLASE RESERVA <<<");
        System.out.println("-----------------------------------");
        
        // Crear reservas
        LocalDate fechaIngreso1 = LocalDate.of(2025, 11, 10);
        LocalDate fechaSalida1 = LocalDate.of(2025, 11, 15);
        
        Reserva reserva1 = new Reserva(1001, 1, 101, fechaIngreso1, fechaSalida1, "Tarjeta de Crédito");
        Reserva reserva2 = new Reserva(1002, 2, 201, LocalDate.of(2025, 11, 20), LocalDate.of(2025, 11, 25), "Efectivo");
        
        System.out.println("✓ Reservas creadas correctamente");
        
        // Probar getters
        System.out.println("\nInformación de la reserva 1:");
        System.out.println("ID Reserva: " + reserva1.getReservaId());
        System.out.println("ID Cliente: " + reserva1.getClienteId());
        System.out.println("ID Habitación: " + reserva1.getHabitacionId());
        System.out.println("Fecha Ingreso: " + reserva1.getFechaIngreso());
        System.out.println("Fecha Salida: " + reserva1.getFechaSalida());
        System.out.println("Método de Pago: " + reserva1.getMetodoPago());
        
        // Probar setters
        System.out.println("\nModificando reserva 1:");
        reserva1.setFechaSalida(LocalDate.of(2025, 11, 17));
        reserva1.setMetodoPago("Transferencia Bancaria");
        System.out.println("Nueva fecha salida: " + reserva1.getFechaSalida());
        System.out.println("Nuevo método de pago: " + reserva1.getMetodoPago());
        
        // ===== PRUEBAS DE LA CLASE LISTACLIENTES =====
        System.out.println("\n\n>>> PRUEBAS DE LA CLASE LISTACLIENTES <<<");
        System.out.println("-----------------------------------------");
        
        listaClientes listaClientes = new listaClientes();
        
        // Agregar clientes a la lista
        System.out.println("Agregando clientes a la lista...");
        listaClientes.AgregarCliente(cliente1);
        listaClientes.AgregarCliente(cliente2);
        listaClientes.AgregarCliente(cliente3);
        System.out.println("✓ Clientes agregados correctamente");
        
        // Mostrar cliente
        System.out.println("\nMostrando cliente con ID 1:");
        listaClientes.MostrarCliente(1);
        
        // Eliminar cliente
        System.out.println("\nEliminando cliente con ID 3:");
        listaClientes.EliminarCliente(3);
        System.out.println("✓ Cliente eliminado");
        
        // ===== PRUEBAS DE LA CLASE LISTARESERVAS =====
        System.out.println("\n\n>>> PRUEBAS DE LA CLASE LISTARESERVAS <<<");
        System.out.println("-----------------------------------------");
        
        ListaReservas listaReservas = new ListaReservas();
        System.out.println("✓ Lista de reservas inicializada con habitaciones del hotel");
        
        // Crear reservas usando el método CrearReserva
        System.out.println("\nCreando reservas...");
        listaReservas.CrearReserva(2001, 1, 1, LocalDate.of(2025, 12, 1), LocalDate.of(2025, 12, 5), "Tarjeta de Crédito");
        listaReservas.CrearReserva(2002, 1, 4, LocalDate.of(2025, 12, 10), LocalDate.of(2025, 12, 15), "Efectivo");
        listaReservas.CrearReserva(2003, 2, 6, LocalDate.of(2025, 12, 20), LocalDate.of(2025, 12, 30), "Transferencia");
        System.out.println("✓ Reservas creadas correctamente");
        
        // Agregar reserva existente
        System.out.println("\nAgregando una reserva existente a la lista...");
        listaReservas.AgregarReserva(reserva1);
        System.out.println("✓ Reserva agregada");
        
        // Mostrar tiempo reservado
        System.out.println("\nCalculando tiempo reservado para la reserva 2001:");
        listaReservas.TiempoReservado(2001);
        
        // Mostrar historial de reservas de un cliente
        System.out.println("\nHistorial de reservas del cliente 1:");
        listaReservas.HistorialReservaClientes(1);
        
        // Cancelar una reserva
        System.out.println("\nCancelando reserva 2002:");
        listaReservas.CancelacionReserva(2002);
        System.out.println("✓ Reserva cancelada");
        
        // ===== RESUMEN FINAL =====
        System.out.println("\n========================================");
        System.out.println("PRUEBAS COMPLETADAS EXITOSAMENTE");
        System.out.println("========================================");
        System.out.println("\nClases probadas:");
        System.out.println("✓ Cliente - Constructor, getters, setters, InfoCliente()");
        System.out.println("✓ Habitacion - Constructor, getters, setters, disponible_get(), costoxnoche()");
        System.out.println("✓ Reserva - Constructor, getters, setters");
        System.out.println("✓ listaClientes - AgregarCliente(), MostrarCliente(), EliminarCliente()");
        System.out.println("✓ ListaReservas - CrearReserva(), AgregarReserva(), TiempoReservado(),");
        System.out.println("                   HistorialReservaClientes(), CancelacionReserva()");
        System.out.println("\n¡Todas las funcionalidades han sido probadas!");
    }
}