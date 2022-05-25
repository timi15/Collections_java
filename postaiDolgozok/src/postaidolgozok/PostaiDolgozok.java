
package postaidolgozok;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class PostaiDolgozok {


     public static void main(String[] args) {
          
          List<Dolgozo> dolgozok= feltolt("dolgozo.txt");
          System.out.println(String.format("A dolgozók száma %s f?. ", dolgozok.size()));
          System.out.println(dolgozok);
          felsorol(dolgozok);
          
          /*
          Collections.sort(dolgozok,(egyik, masik)  -> (egyik.getNev().compareTo(masik.getNev())));
          ez a minifvg:
          egyik.comapeTo(masik)--->{
                egyik.getNev().compareTo()
          */
          
          Collections.sort(dolgozok,(egyik, masik)  -> (egyik.getNev().compareTo(masik.getNev())));  //compareTo metódus megvalósítása
          
          felsorol(dolgozok);
          
          Collections.reverse(dolgozok);
     }

     private static List<Dolgozo> feltolt(String forras) {
          List<Dolgozo> result = new ArrayList<>();
          List<String> temporary= null;
          try {
               temporary=Files.readAllLines(Paths.get(forras), Charset.forName("utf-8"));
          } catch (IOException e) {
               System.out.println("Hiba "+ e.getMessage());
          }
          
          for (String string : temporary) {
              result.add(new Dolgozo(string));
          }
          
          return result;
                  
          
          
     }
     
     private static void felsorol(List<Dolgozo>lista){
          for (Dolgozo dolgozo : lista) {
               System.out.println(dolgozo.toFileString());
          }
     }
     
}
