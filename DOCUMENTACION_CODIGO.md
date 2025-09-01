# Documentación Línea por Línea

1. `import java.util.Scanner;`  
   Importa la clase Scanner de la librería estándar de Java para poder leer datos desde teclado.

2. `public class Main {`  
   Define la clase pública principal del programa.

3. `public static void main(String[] args) {`  
   Método principal de la aplicación, punto de entrada del programa.

4. `Scanner sc = new Scanner(System.in);`  
   Crea un objeto Scanner llamado `sc` para capturar datos desde consola.

5-12. Declaración de variables y solicitudes de datos (`System.out.print`)  
   Piden al usuario ingresar la marca, modelo, cilindrada, tipo de combustible y capacidad.

13. `sc.nextLine();`  
   Limpia el buffer después de `nextInt()` para evitar errores de lectura.

14-18. Impresión de resultados (`System.out.println`)  
   Muestra en pantalla los datos ingresados por el usuario.

19. Llaves de cierre `}`  
   Terminan el método `main` y la clase `Main`.
