
package iskolaiosztalyfeldolgozasamappal;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;


public class IskolaiOsztalyFeldolgozasaMappal {

    
     public static void main(String[] args) {
        Map<String, List<Tanulo>> osztalyok= feltolt("diakok.txt");
          System.out.println("Az osztályok száma: "+osztalyok.size());
          
          for (String egyOsztály: osztalyok.keySet()) {
               System.out.println("A "+ egyOsztály+ " osztályban tanulók száma "+osztalyok.get(egyOsztály).size());
          }
          
          String tesztOsztaly="7/c";
          System.out.println(osztalyok.get(tesztOsztaly));
          
     }

     private static Map<String, List<Tanulo>> feltolt(String fileName) {
          Map<String, List<Tanulo>> result= new TreeMap<>();
          
          try {
               RandomAccessFile bemenet = new RandomAccessFile(fileName, "r");
               
               while(bemenet.getFilePointer()<bemenet.length()){
                    String sor = bemenet.readLine();
                    String [] darabok= sor.split(";");
                    if(!result.containsKey(darabok[3])){
                         result.put(darabok[3], new ArrayList<>());
                    }
                    
                    result.get(darabok[3]).add(new Tanulo(darabok[0], darabok[2], darabok[1]));
                            
                    
               }
               
               bemenet.close();
          } catch (IOException e) {
               System.out.println("Hiba "+ e.getMessage());
          }
          
          return result;
          
     }
     
}
