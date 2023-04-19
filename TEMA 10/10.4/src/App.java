import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;

public class App {

  public static void main(String[] args) throws Exception {
    //Todos los números están en una única línea
    BufferedReader in = null;
    try {
      in = new BufferedReader(new FileReader("NumeroReales.txt"));
      String texto = in.readLine(); //leemos la cadena con los números
      String[] subcadenas = texto.split(" "); //separamos las subcadenas
      double suma = 0;
      for (int i = 0; i < subcadenas.length; i++) {
        suma += Double.valueOf(subcadenas[i]); //*las convertimos y acumulamos */
      }
      System.out.println(
        "suma: " + suma + "\tmedia: " + suma / subcadenas.length);

    } catch (IOException ex) {
      System.out.println(ex.getMessage());
    } finally {
      if (in != null) {
        try {
          in.close();
        } catch (IOException ex) {
          System.out.println(ex.getMessage());
        }
      }
    }
  }
}
