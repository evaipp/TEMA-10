import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class App {
    public static void main(String[] args) throws Exception {

    String texto = "";
    BufferedReader in = null;/*
     * la delcaramos fuera de la estructura try-catch para que sea accesible tambien
     * desde fuera /
     */
    try {
      in = new BufferedReader(new FileReader("C:\\Users\\JAVA\\Desktop\\10.3\\src\\Main.txt"));
      String linea = in.readLine();
      while (linea != null) { //mientras no llegue al final del archivo
        texto =
          texto +
          linea +
          "\n";/*el cambio de linea hay que insertarlo manualmente*/
        linea = in.readLine();
      }
    } catch (IOException ex) {
      System.out.println(ex.getMessage());
    } finally {
      if (in != null) {
        try {
          in.close();
        } catch (IOException ex) {
          System.out.println(ex);
        }
      }
    }
    System.out.println(texto);
  }
}

    