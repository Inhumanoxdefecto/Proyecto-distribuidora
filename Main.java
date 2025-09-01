import java.util.Scanner; // Importa Scanner para leer datos de teclado

public class Main {
    public static void main(String[] args) {
        // Crear objeto Scanner para capturar entradas
        Scanner sc = new Scanner(System.in);

        // Declaración de variables para datos del vehículo
        String marca, modelo, tipoCombustible;
        int cilindrada, capacidadPasajeros;

        // Solicitar datos al usuario
        System.out.print("Ingrese la marca: ");
        marca = sc.nextLine();

        System.out.print("Ingrese el modelo: ");
        modelo = sc.nextLine();

        System.out.print("Ingrese la cilindrada: ");
        cilindrada = sc.nextInt();
        sc.nextLine(); // Limpia buffer para evitar salto de línea

        System.out.print("Ingrese el tipo de combustible: ");
        tipoCombustible = sc.nextLine();

        System.out.print("Ingrese la capacidad de pasajeros: ");
        capacidadPasajeros = sc.nextInt();

        // Mostrar los datos en pantalla
        System.out.println("\nLa marca que ha ingresado es: " + marca);
        System.out.println("El modelo que ha ingresado es: " + modelo);
        System.out.println("La cilindrada que ha ingresado es: " + cilindrada);
        System.out.println("El tipo de combustible es: " + tipoCombustible);
        System.out.println("Tiene una capacidad de " + capacidadPasajeros + " pasajeros.");
    }
}
