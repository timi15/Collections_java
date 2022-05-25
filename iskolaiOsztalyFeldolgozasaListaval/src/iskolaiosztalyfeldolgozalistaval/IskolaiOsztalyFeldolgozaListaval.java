/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package iskolaiosztalyfeldolgozalistaval;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Thomas
 */
public class IskolaiOsztalyFeldolgozaListaval {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Osztaly> osztalyok = feltölt("diakok.txt");
        System.out.println("Az osztályok száma: "+ osztalyok.size() );
        
        Collections.sort(osztalyok);
        
        for (Osztaly osztaly : osztalyok) {
            System.out.println(osztaly);
        }
    }
    
    private static List<Osztaly> feltölt(String fileNev){
        List<Osztaly> result = new ArrayList<>();
        try{
            RandomAccessFile bemenet = new RandomAccessFile(fileNev, "r");
            while( bemenet.getFilePointer() < bemenet.length()){
                String sor = bemenet.readLine();
                String [] darabok = sor.split(";"); //Nem string, hanem regex
                String osztaly = darabok[3];
                Osztaly teszt = new Osztaly(osztaly);
                if( ! result.contains(teszt) ){
                    //Ez az osztály még nincs adminisztrálva fel kell venni
                    result.add(teszt);
                }
                //Itt már biztosan van ilyen jelû osztály
                Tanulo ujTanulo = new Tanulo(darabok[2], darabok[1], darabok[0]);
                result.get( result.indexOf( teszt ) ).tanulok.add(ujTanulo);
            }
            bemenet.close();
        }catch(IOException exc){
            System.out.println("Hiba van: "+ exc.getMessage());
        }
        return result;
    }
    
}
