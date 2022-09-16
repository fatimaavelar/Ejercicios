package unidad.pkg2semana.pkg3clase.pkg8.ejercicio.pkg1;
import java.util.Scanner;
public class Unidad2Semana3Clase8Ejercicio1 {
    public static void main(String[] args) {
    Scanner ingresar = new Scanner(System.in);
    System.out.println("Ingrese el número: ");
    int numero = ingresar.nextInt();
    for(int i = 1; i<=10; i++){
      System.out.println(numero + " * " + i + " = " + numero * i);
    }
    }
    
}
