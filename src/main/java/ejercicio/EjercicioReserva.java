// Suponer un sistema de reserva de asientos para un anfiteatro.
//El teatro cuenta con 1 filas de 10 asientos cada una. Se necesita
//desarrollar un sistema (sin uso de base de datos, únicamente manejo
//de datos de form lógica) que permita llevar a cabo lo siguiente:

//1: Cargar el "mapa de filas y asientos". Indicado con una "X" los
//asientos ocupados y con una "L" los que estan libres. Al iniciar
//el programa todos los asientos estan libres.
//2: Manejar la reserva de asientos contemplando que un asientosolo puede
//ser reservado si se encuentra en estado "L", en caso de que esté en estado "X",
//se deberá pasar automáticamente al estado "X"
//3: Para finalizar el programa se deberá ingresar un valor en particular. 
//Contemplar que no exista una cantidad exacta de veces que el programa se pueda ejecutar
//4: Contemplar que solo existen 10 filas y 10 asientos. No se pueden vender
//asientos fuera de esas numeraciones. No se permite "sobreventa"
//Consideraciones: No es necesaria implementaión de IGU ni de BD. Se evaluará
//100% el manejo lógico del desarrollo de aplicación.
//Extra: En caso de que un cliente soliite visualizar cúales son los asientos libres
//el sistema debe permitir mostrar de forma gráfica el mapa de asientos.
//No utillizar IGU para este caso. Utilizar únicamente lógica y salida por consola.
package ejercicio;
import java.util.Scanner;

/**
 *
 * @author Marcelo
 */
public class EjercicioReserva {

    public static void main(String[] args) {

        char asientos [][] = new char [10][10];
        boolean bandera = false;

        //ingresar datos
        Scanner teclado = new Scanner(System.in);

        //variable para guardar fila y asiento
        int fila, asiento;

        //Variable para respuesta de usuario 
        String respuesta;

        //Carga de filas y asientos
        for (int f = 0; f < 10; f++){
            for (int c = 0; c < 10; c++) {
                asientos [f][c] = 'L'; 
            }
        }

        System.out.println("----------BIENVENIDO AL SISTEMA DE RESERVAS----------");

        //Reserva de asientos mediante while
        while(bandera!=true){
        System.out.println("Ingrese Fila y Asiento a reservar");

        // Fila y asientos a reservar, almacenados en sus respectivas variables
        System.out.print("Fila (0-9): ");
        fila = teclado.nextInt();

        System.out.print("Asiento (0-9): ");
        asiento = teclado.nextInt();

        if(asientos[fila][asiento] == 'L'){
            asientos[fila][asiento] = 'X';
            System.out.println("El asiento fue reservado exitosamente");
        } else{
                System.out.println("El asiento ya esta reservado, por favor alija otro");
            }
        
        System.out.println("¿Desea finalizar la reserva? S: Si / Cualquiera tecla: No");
        respuesta = teclado.next();

        if(respuesta.equalsIgnoreCase("S")){
            bandera = true;
        }
        }
        
    }
}


//cd "/d/Mis cosas/Programacion/Java/EjercicioReserva"
//javac src/main/java/ejercicio/EjercicioReserva.java
//java -cp src/main/java ejercicio.EjercicioReserva