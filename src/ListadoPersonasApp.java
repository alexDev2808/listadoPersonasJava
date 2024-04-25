import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ListadoPersonasApp {
    public static void main(String[] args) {

        Scanner consola = new Scanner(System.in);
        List<Persona> personas = new ArrayList<>();

        boolean salir = false;
        while ( !salir ) {
            mostrarMenu();
            try {
                salir = ejecutarOperacion( consola, personas );
            } catch ( Exception e ) {
                System.out.println("Ocurrio un error: " + e.getMessage() );
            }
        }

    }

    private static boolean ejecutarOperacion(Scanner consola, List<Persona> personas) {

        int opcion = Integer.parseInt( consola.nextLine() );
        boolean salir = false;

        switch ( opcion ) {
            case 1 -> {
                System.out.print("Proporciona el nombre: ");
                String nombre = consola.nextLine();
                System.out.print("Proporciona el telefono: ");
                String tel = consola.nextLine();
                System.out.print("Proporciona el email: ");
                String email = consola.nextLine();

                // Crear objeto persona
                Persona persona = new Persona(nombre, tel, email);
                // lo agregamos a la lista
                personas.add(persona);
                System.out.println("La lista tiene: " + personas.size() + " personas");
            }
            case 2 -> {
                System.out.println("Listado de personas: ");
                // lambda y metodos de referencia
                //personas.forEach((persona) -> System.out.println(persona));
                personas.forEach(System.out::println);
            }
            case 3 -> {
                System.out.println("Hasta pronto...");
                salir = true;
            }
            default -> System.out.println("Opcion erronea: " + opcion );
        }

        return salir;
    }

    private static void mostrarMenu() {
        System.out.println("""
                **** Listado Personas App *****
                1. Agregar
                2. Listar
                3. Salir
                """);
        System.out.print("Ingresa el numero de tu eleccion: ");
    }
}