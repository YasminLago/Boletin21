package boletin22;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ylagorebollar
 */
public class Ficheiro {

    public void escribirFich(String nomeFich, String ficheiro) throws FileNotFoundException {
        FileWriter c = null;
        PrintWriter escribir = null;
        try {
            c = new FileWriter(nomeFich, true);
            escribir = new PrintWriter(c);
            escribir.append("\n");

            escribir.append(ficheiro);
        } catch (IOException ex) {
            System.out.println("Erro crear" + ex.getMessage());
        } finally {
            if (c != null) {
                try {
                    c.close();
                    escribir.close();
                } catch (IOException ex) {
                    System.out.println("erro de peche" + ex.getMessage());
                }
            }
        }
    }

    public void ordenarDatosFich(String fich, String novoFich) {
        Scanner ler = null;
        PrintWriter fichOrdenado = null;
        try {
            File l = new File(fich);
            File f = new File(novoFich);
            ler = new Scanner(l);
            fichOrdenado = new PrintWriter(f);
            while (ler.hasNextLine()) {
                String res = ler.nextLine();
                String[]datos=res.split(" ");
                for(int i=0;i<datos.length;i++)
                fichOrdenado.println(datos[0]+datos[0]);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Erro no ficheiro" + ex.toString());
        } finally {
            ler.close();
            fichOrdenado.close();

        }
    }

}
