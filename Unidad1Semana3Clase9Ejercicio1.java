package unidad.pkg1semana.pkg3.clase.pkg9.ejercicio.pkg1;
import java.util.Scanner;
public class Unidad1Semana3Clase9Ejercicio1 {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        int numero1;
        int numero2;

        System.out.print("Escriba el primer entero: ");
        numero1 = Entrada.nextInt();
        System.out.print("Escriba el segundo entero: ");
        numero2 = Entrada.nextInt();

        if (numero1 == numero2)
          System.out.println("El número " + numero1 + " es igual a " + numero2);
        if (numero1 != numero2)
          System.out.println("El número " + numero1 + " es distinto a " + numero2);
        if(numero1 < numero2)
          System.out.println("El número " + numero1 + " es menor a " + numero2);
        if(numero1 > numero2)
          System.out.println("El número " + numero1 + " es mayor a " + numero2);
    }
    
}
