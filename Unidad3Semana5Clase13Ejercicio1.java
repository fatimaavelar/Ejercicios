package unidad.pkg3semana.pkg5clase.pkg13ejercicio.pkg1;
import java.util.Scanner;
public class Unidad3Semana5Clase13Ejercicio1 {
    public static void main(String[] args) {
    Scanner datos = new Scanner(System.in);
    int valor;

    do{
      System.out.println("Ingrese un valor entre 0 y 999 (0 finaliza) : ");
      valor = datos.nextInt();
      if (valor >= 100){
        System.out.println("Es de 3 dígitos");
      } else if (valor >= 10){
        System.out.println("Es de 2 dígitos");
      }else{
        System.out.println("Es de 1 dígito");
      }
    } while (valor != 0);
    }
    
}
