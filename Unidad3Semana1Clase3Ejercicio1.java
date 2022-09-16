package unidad.pkg3semana.pkg1clase.pkg3ejercicio.pkg1;
import java.util.Scanner;
public class Unidad3Semana1Clase3Ejercicio1 {
    public static void main(String[] args) {
    Scanner ingresar = new Scanner(System.in);
    double nota;

    System.out.println("Favor ingresar un valor desde 1 hasra 10");
    nota = ingresar.nextDouble();

    while(nota < 1 | nota > 10){
      System.out.println("Lo siento mucho pero el valor proporcionado no es correcto");
      nota = ingresar.nextDouble();
    }
    }
    
}
