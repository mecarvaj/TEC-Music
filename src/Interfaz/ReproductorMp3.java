
package Interfaz;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
 
//import javazoom.jl.decoder.JavaLayerException;
import javazoom.jlme.util.Player;
 
public class ReproductorMp3 {
 
   public static void main(String[] args) throws FileNotFoundException, Exception
          {
 
      Player apl;
       apl = new Player(new FileInputStream(
               "C:\\Users\\GMG418\\Music\\ThugLife.mp3"));
 
      apl.play();
   }
}