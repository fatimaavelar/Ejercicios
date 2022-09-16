package unidad.pkg3semana.pkg5clase.pkg14ejercicio.pkg1;
import java.util.Scanner;
public class Unidad3Semana5Clase14Ejercicio1 {
    public static void main(String[] args) {
    Scanner Teclado = new Scanner(System.in);
    int Nota = 0, Cont1 =0, Cont2 = 0;

    do{
      System.out.println("Ingrese la nota del alumno");
      Nota = Teclado.nextInt();

      if (Nota >= 7){
        Cont1 = Cont1 + 1;
      } else if (Nota > 0){
        Cont2 = Cont2 + 1;
      }
    } while (Nota != 0);
    System.out.println("La cantidad de alumnos que tienen notas mayores o iguales a 7 son: " + Cont1);
    System.out.println("La cantidad de alumnos que tienen notas menores a 7 son: " + Cont2);
    }
    
}
