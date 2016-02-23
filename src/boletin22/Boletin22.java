package boletin22;

import java.io.FileNotFoundException;

/**
 *
 * @author ylagorebollar
 */
public class Boletin22 {
    public static void main(String[] args) throws FileNotFoundException {
       Ficheiro f=new Ficheiro();
       //f.escribirFich("fichero", "mmmm");
       f.ordenarDatosFich("fichero", "novoFich");
    }
    
}
