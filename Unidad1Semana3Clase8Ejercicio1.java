package unidad.pkg1semana.pkg3clase.pkg8.ejercicio.pkg1;
import java.util.Scanner;
public class Unidad1Semana3Clase8Ejercicio1 {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner (System.in);
        int numero1;
        int numero2;
        int suma;

        System.out.print("Escriba el primer entero: ");
        numero1 = Entrada.nextInt();

        System.out.print("Escriba el segundo entero: ");
        numero2 = Entrada.nextInt();

        suma = numero1 + numero2;

        System.out.print("La suma es: " + suma);
    }
    
}
