
package gyakarray;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;


public class GyakArray {

    
    public static void main(String[] args) {
        List <String> nevek= new ArrayList<>(); // ArrayList őse a List
        nevek.add("Dani");
        System.out.println(nevek.size());
        
        nevek.add("Dóra");
        nevek.add("Andrea");
        nevek.add("Balázs");
        System.out.println(nevek);
        
        nevek.add(0, "Géza"); // indexnek validnak kell lennie
        
        System.out.println(nevek);
        
        
        System.out.println(nevek.contains("Andrea")); //boolean visszatérés
        
        
        System.out.println(nevek.contains("István")); 
        
        System.out.println(nevek.indexOf("Andrea")); // index-szel tér vissza 
        
        System.out.println(nevek.indexOf("István")); //ha nincs benne akkor negatív érték
        
        //sort  csak gyűjtemény  növekvő rend  csak akkor ha van compareTo
        
        Collections.sort(nevek); // nem  utf8
        System.out.println(nevek);
        
        
        
    }
    
}
