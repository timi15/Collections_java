/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package iskolaiosztalyfeldolgozasamappal;

import java.util.Objects;

/**
 *
 * @author Hp
 */
public class Tanulo {
    private String tanuloId;
    private String nev;
    private String nem;

     public Tanulo(String tanuloId, String nev, String nem) {
          this.tanuloId = tanuloId;
          this.nev = nev;
          this.nem = nem;
     }

     @Override
     public String toString() {
          return "Tanulo{" + "tanuloId=" + tanuloId + ", nev=" + nev + ", nem=" + nem + '}';
     }

     public String getTanuloId() {
          return tanuloId;
     }

     public void setTanuloId(String tanuloId) {
          this.tanuloId = tanuloId;
     }

     public String getNev() {
          return nev;
     }

     public void setNev(String nev) {
          this.nev = nev;
     }

     public String getNem() {
          return nem;
     }

     public void setNem(String nem) {
          this.nem = nem;
     }

     @Override
     public int hashCode() {
          int hash = 7;
          hash = 53 * hash + Objects.hashCode(this.tanuloId);
          return hash;
     }

     @Override
     public boolean equals(Object obj) {
          if (this == obj) {
               return true;
          }
          if (obj == null) {
               return false;
          }
          if (getClass() != obj.getClass()) {
               return false;
          }
          final Tanulo other = (Tanulo) obj;
          return Objects.equals(this.tanuloId, other.tanuloId);
     }
     
     
     
     
     
     
}
