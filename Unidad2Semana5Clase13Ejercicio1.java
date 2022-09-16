package unidad.pkg2semana.pkg5clase.pkg13ejercicio.pkg1;

public class Unidad2Semana5Clase13Ejercicio1 {
    public static void main(String[] args) {
    String tipoDia = "";
    String diaSemana = "Lunes";

    switch(diaSemana.toLowerCase()){
      case "lunes":
        tipoDia = "Inicio de semana";
        break;
      case "martes":
      case "miércoles":
      case "jueves":
        tipoDia = "Mediados de semana";
        break;
      case "viernes":
      case "sábado":
      case "domingo":
        tipoDia = "Fin de semana";
        break;
    }
    System.out.println(diaSemana + " es " + tipoDia);
    }
    
}
