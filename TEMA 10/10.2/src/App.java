import java.io.FileReader;
import java.io.IOException;

public class App {
    public static void main(String[] args) throws Exception {
        String texto = "";
        FileReader in = null; /*
                               * la delcaramos fuera de la estructura try-catch para que sea accesible tambien
                               * desde fuera /
                               */
        try {
            in = new FileReader("Main.java");
            int c = in.read();
            while (c != -1) { // mientras no lleguemos al final del archivo
                texto = texto + (char) c; // convertimos c a char
                c = in.read();
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } finally { // en todo caso cerramos flujo
            if (in != null) { // si el flujo esta abierto
                try {
                    in.close(); // cerramos el flujo
                } catch (IOException ex) {
                    System.out.println(ex);
                }
            }
        }


        System.out.println(texto); // mostramos el texto leido
    }

}
