import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        /*Primero creamos el flujo de texto a partir del nombre del archivo . como dentro del bloque try solo se va a abrir el archivo y no se va a leeer de él. basta con la excepción FileNotFoundExcaption, que es una subclase de IOException */
        FileInputStream flujo = null;
        try {
            flujo = new FileInputStream("Enteros.txt");
        } catch (FileNotFoundException ex) { //valdria su supercalse IOException
            System.out.println(ex.getMessage());
        } 
        Scanner s = new Scanner(flujo);
        int contador = 0;
        int suma = 0;
        while (s.hasNext()) { //en principio ,no sabemos cuántos números hay 
            int n = s.nextInt();
            System.out.print(n + " "); //vamos mostrando los números leídos
            suma += n;
            contador++;
        }
        double media = (double) suma / contador; // la media es un número real 
        System.out.println("\nsuma: " + suma + "  media: " + media);
        

    }
}
