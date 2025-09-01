# Proyecto de Cálculo de Despacho - Distribuidora de Alimentos

Este proyecto implementa un programa básico en **Java**, compilado y ejecutado sin usar un IDE, que solicita datos de un vehículo y los muestra en pantalla. El objetivo es demostrar el proceso de compilación en línea de comandos y el uso de la Máquina Virtual de Java (JVM).

## 📌 Requerimientos Funcionales
- Solicitar al usuario:
  - Marca
  - Modelo
  - Cilindrada
  - Tipo de combustible
  - Capacidad de pasajeros
- Mostrar los datos en pantalla de forma ordenada.
- Ejecutarse usando la línea de comandos (sin IDE).

## 🔧 Requerimientos No Funcionales
- **Portabilidad:** debe ejecutarse en cualquier equipo con JVM.
- **Usabilidad:** interfaz de texto simple e intuitiva.
- **Mantenibilidad:** código comentado línea a línea.
- **Rendimiento:** ejecución rápida en equipos de gama baja.

## 👤 Historias de Usuario

| ID | Historia | Criterio de Aceptación |
|----|---------|----------------------|
| HU-01 | Como usuario quiero ingresar los datos de mi vehículo para que el sistema me los muestre en pantalla. | Los datos ingresados aparecen correctamente en consola. |
| HU-02 | Como administrador quiero poder compilar y ejecutar el programa sin necesidad de un IDE. | El programa compila con `javac` y se ejecuta con `java`. |

## 🖥️ Instalación y Ejecución

1. Instalar [Java SE JDK 8+](https://www.oracle.com/cl/java/technologies/javase/javase-jdk8-downloads.html).
2. Clonar este repositorio:
   ```bash
   git clone https://github.com/tuusuario/Proyecto-Distribuidora.git
   ```
3. Compilar el código:
   ```bash
   javac Main.java
   ```
4. Ejecutar:
   ```bash
   java Main
   ```

## 🗓️ Cronograma Inicial

Ver el archivo [CRONOGRAMA.md](CRONOGRAMA.md) para la planificación detallada.

## 📜 Licencia
Este proyecto está bajo la licencia MIT. Consulta el archivo [LICENSE](LICENSE) para más detalles.
