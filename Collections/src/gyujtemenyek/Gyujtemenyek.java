
package gyujtemenyek;

import java.util.Map;
import java.util.TreeMap;


public class Gyujtemenyek {

     
     public static void main(String[] args) {
          
          
          Map <String, Integer> jegyek = new TreeMap<>();
          
          jegyek.put("Java01", 5);
          jegyek.put("Java02",4);
          jegyek.put("Python", 4);
          jegyek.put("Javascript", 5);
          
          System.out.println(jegyek);
          
          //treeMap garantált a sorrend
          
          int jegy= jegyek.get("Java02"); //kulcsszerint férek hozzá az elemekhez
          // automatikus tipuskonverzio
          
          jegyek.remove("Python");
          System.out.println(jegyek.size());
          
          /*
          jegyek.clear();
          */
          
          //Mapek körbe járhatóak
          
          System.out.println(jegyek.keySet());
          
          for (String kulcs : jegyek.keySet()) {
               System.out.println(jegyek.get(kulcs)+" ");
          }
          
          System.out.println("");
          
          for(int egyJegy: jegyek.values()){
               System.out.println(egyJegy);
          }
          
          // contains() nincs ilyen hogy contains
          
          System.out.println(jegyek.containsKey("Python"));
          
          System.out.println(jegyek.containsValue(1));
          System.out.println(jegyek.containsValue(5));
          
          
     } // main vége
     
}
