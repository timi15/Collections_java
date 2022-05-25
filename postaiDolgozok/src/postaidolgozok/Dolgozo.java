/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package postaidolgozok;

/**
 *
 * @author Hp
 */
public class Dolgozo {
     private String wId;
     private String nev;
     private String osztaly;

     public Dolgozo(String wId, String nev, String osztaly) {
          this.wId = wId;
          this.nev = nev;
          this.osztaly = osztaly;
     }
     
     
     public Dolgozo(String sor){
          String [] reszek= sor.split(";");  // ha tab lenne \t, ez az egyik white space (\r, \t);
          this.wId = reszek[0];
          this.nev = reszek[1];
          this.osztaly = reszek[2];
          
          
          
          
     }

     public String getwId() {
          return wId;
     }

     public void setwId(String wId) {
          this.wId = wId;
     }

     public String getNev() {
          return nev;
     }

     public void setNev(String nev) {
          this.nev = nev;
     }

     public String getOsztaly() {
          return osztaly;
     }

     public void setOsztaly(String osztaly) {
          this.osztaly = osztaly;
     }

     @Override
     public String toString() {
          return "Dolgozo{" + "wId=" + wId + ", nev=" + nev + ", osztaly=" + osztaly + '}';
     }
     
     public String toFileString(){
          return this.wId+";"+this.nev+";"+this.osztaly;
     }
}
