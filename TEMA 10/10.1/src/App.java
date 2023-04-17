import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Integer n = leerEntero();
        System.out.println(n);
      }
    
      static Integer leerEntero() {
        Integer resultado;
        while (true) {
          try {
            System.out.println("Introducir entero:");
            resultado = new Scanner(System.in).nextInt();
            break;/*aqui se llega solo si la lectura del Scanner ha sido correcta */
          } catch (InputMismatchException ex) {
            System.out.println("Tipo erróneo");
          }
        }
        return resultado;

    
    }
}
