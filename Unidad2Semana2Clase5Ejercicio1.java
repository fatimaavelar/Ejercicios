package unidad.pkg2semana.pkg2clase.pkg5ejercicio.pkg1;
public class Unidad2Semana2Clase5Ejercicio1 {
    public static void main(String[] args) {
    String Branch = "CSE";
    int year = 2;

    switch(year){
      case 1:
        System.out.println("Cursos ejecutivos; Inglés, Cálculo");
      case 2:
        switch(Branch){
          case "CSE":
            System.out.println("Cursos ejecutivos; Inglés, Cálculo");
            break;
          case "CCE":
            System.out.println("Cursos electivos: Machine Learning, Big Data");
            break;
          case "ECE":
            System.out.println("Cursos electivos: Programación");
            break;
          default:
            System.out.println("Cursos electivos: Ingeniería de Software");
        }
    }        
    }
    
}
